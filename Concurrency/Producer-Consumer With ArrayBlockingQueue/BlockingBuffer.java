// Using an BlockingArrayQueue as shared synchronized buffer
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer
{
     private final ArrayBlockingQueue<Integer> sharedBuffer;

     public BlockingBuffer()
     {
         sharedBuffer = new ArrayBlockingQueue<Integer>(1);
     }

     public void blockingPut(int value) throws InterruptedException
     {
         sharedBuffer.put(value);
         System.out.printf("%s%2d\t%s%d", "Producer writes", value,
            "Buffer cells occupied: ", sharedBuffer.size());
     }

     public int blockingGet() throws InterruptedException
     {
         int readValue = sharedBuffer.take();
         System.out.printf("%s%2d\t%s%d", "Consumer reads", readValue,
            "Buffer cells occupied: ", sharedBuffer.size());
         return readValue;
     }
}
