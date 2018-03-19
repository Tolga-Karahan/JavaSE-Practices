// Demonstrating lambdas and streams with an array of Integers.
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArraysAndStreams
{
      public static void main(String[] args)
      {
           Integer[] values = {5, 17, 4, 8, 12, 22, 7};
           System.out.printf("Original values: %s%n", Arrays.asList(values));

           // sort values in ascending order with streams
           System.out.printf("Sorted values: %s%n",
               Arrays.stream(values)
                     .sorted()
                     .collect(Collectors.toList()));

           // values greater than 4
           List<Integer> greaterThan4 =
               Arrays.stream(values)
                     .filter(value -> value > 4)
                     .collect(Collectors.toList());
           System.out.printf("Values greater than 4: %s%n", greaterThan4);

           // filter values greater than 4 and sort the results
           System.out.printf("Sorted values greater than 4: %s%n",
               Arrays.stream(values)
                     .filter(value -> value > 4)
                     .sorted()
                     .collect(Collectors.toList()));

           // greaterThan4 sorted with streams
           System.out.printf(
              "Contents of the greaterThan4 is sorted with stream: %s%n",
              greaterThan4.stream()
                          .sorted()
                          .collect(Collectors.toList()));
      }
}
