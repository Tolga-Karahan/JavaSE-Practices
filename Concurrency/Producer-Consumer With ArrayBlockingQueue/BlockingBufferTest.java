// Two threads manupulating an shared synchronized Buffer
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest
{
     public static void main(String[] args) throws InterruptedException
     {
          // create new thread pool
          ExecutorService executorService = Executors.newCachedThreadPool();

          // create shared buffer
          Buffer sharedLocation = new BlockingBuffer();

          executorService.execute(new Producer(sharedLocation));
          executorService.execute(new Consumer(sharedLocation));

          executorService.shutdown();
          executorService.awaitTermination(1, TimeUnit.MINUTES);


     }
}
