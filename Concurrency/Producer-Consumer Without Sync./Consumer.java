// Consumer gets values from Buffer and total them.
import java.security.SecureRandom;

public class Consumer implements Runnable
{
     private static final SecureRandom generator =
         new SecureRandom();
     private final Buffer sharedBuffer;

     public Consumer(Buffer sharedBuffer)
     {
         this.sharedBuffer = sharedBuffer;
     }

     public void run()
     {
         int sum = 0;

         for(int count = 1; count <= 10; count++)
         {
             try
             {
                 Thread.sleep(generator.nextInt(3000));
                 sum += sharedBuffer.blockingGet();
                 System.out.printf("\t\t\t%2d%n", sum);
             }
             catch(InterruptedException ex)
             {
                 Thread.currentThread().interrupt();
             }
         }

         System.out.printf("Consumer reads values totaling: %d%s%n",
            sum,
            "Terminating Consumer");
     }
}
