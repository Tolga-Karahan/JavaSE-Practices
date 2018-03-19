// File class used to obtain file and directory information.
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class FileAndDirectoryInfo
{
       public static void main(String[] args)
       {
              Scanner input = new Scanner(System.in);

              System.out.println("Enter file or directory name: ");

              // create Path object based on user input
              Path path = Paths.get(input.nextLine());

              try
              {
                    if(Files.exists(path)) // if path exist output info about it
                    {
                           // display file or directory info
                           System.out.printf("%n%s exists%n", path.getFileName());
                           System.out.printf("%s a directory%n",
                                 Files.isDirectory(path) ? "Is" : "Is not");
                           System.out.printf("%s a absolute path%n",
                                 path.isAbsolute() ? "Is" : "Is not");
                           System.out.printf("Last modified: %s%n",
                                 Files.getLastModifiedTime(path));
                           System.out.printf("Size: %s bytes%n",
                                 Files.size(path));
                           System.out.printf("Path: %s%n", path);
                           System.out.printf("Absolute path: %s%n",
                                 path.toAbsolutePath());

                           if(Files.isDirectory(path))
                           {
                                 System.out.printf("%nDirectory contents:%n");

                                 DirectoryStream<Path> dirStream =
                                      Files.newDirectoryStream(path);

                                 for(Path paths : dirStream)
                                      System.out.printf("%s%n", paths);
                           }

                    }
                    else
                    {
                           System.out.printf("%s does not exist%n", path);
                    }
              }
              catch(IOException e)
              {
                     System.out.println(e);
              }
       }
}
