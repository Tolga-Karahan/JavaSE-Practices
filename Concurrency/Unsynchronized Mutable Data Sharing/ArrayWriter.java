// Adds integers to an array shared with other Runnables
import java.lang.Runnable;

public class ArrayWriter implements Runnable
{
     private final SimpleArray sharedSimpleArray;
     private final int startValue;

     public ArrayWriter(int value, SimpleArray array)
     {
          startValue = value;
          sharedSimpleArray = array;
     }

     @Override
     public void run()
     {
          for(int i = startValue; i < startValue + 3; i++)
             sharedSimpleArray.add(i); // add element to shared array
     }
}
