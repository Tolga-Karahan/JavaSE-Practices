// Producer inserts values 1 to 10 in buffer.
import java.security.SecureRandom;

public class Producer implements Runnable
{
     private static final SecureRandom generator =
         new SecureRandom();
     private final Buffer sharedBuffer;

     public Producer(Buffer sharedBuffer)
     {
         this.sharedBuffer = sharedBuffer;
     }

      // insert values 1 to 10 into sharedBuffer
      public void run()
      {
         int sum = 0;

         for(int count = 1; count <= 10; count++)
         {
             try
             {
                 Thread.sleep(generator.nextInt(3000));
                 sharedBuffer.blockingPut(count);
                 sum += count;
                 System.out.printf("\t%2d%n", sum);
             }
             catch(InterruptedException ex)
             {
                 Thread.currentThread().interrupt();
             }
         }

         System.out.println("Producer done its job. Terminating Producer.");
      }
}
