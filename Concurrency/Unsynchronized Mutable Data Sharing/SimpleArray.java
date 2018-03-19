// Class that allows multiple threads to write its array
import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray
{
     private static final SecureRandom generator =
        new SecureRandom();
     private final int[] array; // the shared array
     private int writeIndex = 0; // next element's shared index to write

     public SimpleArray(int size)
     {
         array = new int[size];
     }

     // add a value to shared array
     /* If we want to solve the syncronization problems
        we can put a synchronize keyword in the method's header or
        we can put whole operations of add method in a syncronized statement */
     public void add(int value)
     {
         int position = writeIndex; // store the next index to write

         try
         {
             Thread.sleep(generator.nextInt(500));
         }
         catch(InterruptedException exception)
         {
             Thread.currentThread().interrupt();
         }

         // put value in position refers to
         array[position] = value;
         System.out.printf("%s wrote %2d to index %d.%n",
            Thread.currentThread().getName(), value, position);

         writeIndex++; // increment index of element to be written next
         System.out.printf("Next write index: %d%n", writeIndex);
     }

     public String toString()
     {
         return Arrays.toString(array);
     }
}
