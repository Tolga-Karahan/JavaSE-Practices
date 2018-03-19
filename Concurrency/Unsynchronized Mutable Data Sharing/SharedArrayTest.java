// Executes two Runnables to add elements to sharedArray.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest
{
     public static void main(String[] args)
     {
          SimpleArray sharedArray = new SimpleArray(6);

          ArrayWriter writer1 = new ArrayWriter(7, sharedArray);
          ArrayWriter writer2 = new ArrayWriter(147, sharedArray);

          ExecutorService executorService = Executors.newCachedThreadPool();
          executorService.execute(writer1);
          executorService.execute(writer2);
          executorService.shutdown();

          try
          {
               // wait a minute for both writers finish their tasks
               boolean taskEnded =
                  executorService.awaitTermination(1, TimeUnit.MINUTES);

               if(taskEnded)
               {
                   System.out.printf("%nContents of SimpleArray:%n");
                   System.out.println(sharedArray);
               }
               else
                   System.out.println(
                      "Timed out while waiting tasks to finish");
          }
          catch(InterruptedException ex)
          {
               ex.printStackTrace();
          }

     }
}
