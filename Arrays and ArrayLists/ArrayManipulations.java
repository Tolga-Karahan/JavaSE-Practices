// Array class methods and System.arraycopy
import java.util.Arrays;

public class ArrayManipulations{

      public static void main(String[] args){

           double[] doubleArray = {5.4, 3.8, 7.1, 6.8, 2.4, 3.4};
           displayArray(doubleArray, "doubleArray before sorting");

           // sort doubleArray into ascending order
           Arrays.sort(doubleArray);
           displayArray(doubleArray, "doubleArray after sorting");

           // fill 10-element array with 10's
           int[] filledIntArray = new int[10];
           Arrays.fill(filledIntArray, 10);
           displayArray(filledIntArray, "filledIntArray");

           //copy array intArray into array intArrayCopy
           int[] intArray = { 1, 2, 3, 4, 5, 6 };
           int[] intArrayCopy = new int[intArray.length];
           System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
           displayArray(intArray, "intArray");
           displayArray(intArrayCopy, "intArrayCopy");

           // compare intArray and intArrayCopy for equality
           boolean b = Arrays.equals(intArray, intArrayCopy);
           System.out.printf("%n%nintArray %s intArrayCopy",
                (b ?  "==" : "!="));

            b = Arrays.equals(intArray, filledIntArray);
            System.out.printf("%n%nintArray %s filledIntArray",
                (b ? "==" : "!="));

            int location = Arrays.binarySearch(intArray, 5);
            if(location >= 0)
                System.out.printf("Found 5 at element %d in intArray", location);
            else
                System.out.printf("5 not found in intArray");

            location = Arrays.binarySearch(intArray 8475);

            if(location >= 0)
                System.out.printf("Found 8475 at element %d in intArray", location);
            else
                System.out.printf("8475 not found in intArray");                          


      }

      public static void displayArray(int[] array, String description){

            System.out.printf("%n%s:%n", description);

            for(int element : array)
                 System.out.printf("%d ", element);
            System.out.println();
      }

      public static void displayArray(double[] array, String description){

            System.out.printf("%n%s:%n", description);

            for(double element : array)
                 System.out.printf("%.1f ", element);
            System.out.println();
      }
}
