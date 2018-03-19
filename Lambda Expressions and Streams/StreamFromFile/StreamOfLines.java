// Counting word occurrences in a text file.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class StreamOfLines
{
      public static void main(String[] args)
      {
           // Regex that matches one or more consecutive whitespace characters
           Pattern regexPattern = Pattern.compile("\\s+");

           // Count occurrences of each word in a Stream<String> sorted by word

           try
           {
                 Map<String, Long> wordCounts =
                     Files.lines(Paths.get("Source.txt"))
                          .map(line -> line.replaceAll("(?!')\\p{P}", ""))
                          .flatMap(line -> regexPattern.splitAsStream(line))
                          .collect(Collectors.groupingBy(String::toLowerCase,
                              TreeMap::new, Collectors.counting()));
           }
           catch(IOException ioException)
           {
                System.out.println("Error opening file. Terminating.");
           }

          // display the words grouped by starting letter
          wordCounts.entrySet()
                    .stream()
                    .collect(Collectors.groupingBy(
                        entry -> entry.getKey().charAt(0),
                        TreeMap::new, Collectors.toList()))
                    .forEach((letter, wordList) ->
                        {
                             System.out.printf("%n%C%n", letter);
                             wordList.stream()
                                     .forEach(word ->
                                     System.out.printf("%13s: %d%n",
                                     word.getKey(), word.getValue()));
                        });
      }
}
