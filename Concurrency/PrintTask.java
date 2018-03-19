// PrintTask class sleep for a random time between 0 and 5 seconds
import java.security.SecureRandom;

public class PrintTask implements Runnable
{
     private static final SecureRandom generator =
         new SecureRandom();
     private String taskName;
     private int sleepTime;

     public PrintTask(String taskName)
     {
         this.taskName = taskName;

         // pick a random sleep time
         sleepTime = generator.nextInt(5000); // milliseconds
     }

     // method run contains the code thread execute
     public void run()
     {
         try
         {
             System.out.printf("%s going to sleep %d milliseconds.%n",
                taskName, sleepTime);

             Thread.sleep(sleepTime);
         }
         catch(InterruptedException e)
         {
             e.printStackTrace();
             Thread.currentThread().interrupt(); // re-interrupt the Thread
         }

         // print task name
         System.out.printf("%s done its sleeping.%n", taskName);
     }
}
