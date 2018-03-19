// Prints array elements using generic printArray method

public class PrintArrayTest
{
      public static void main(String[] args)
      {
           Integer[] integerArray = {5, 7, 12, 4};
           Double[] doubleArray = {1.2, 3.4, 7.8, 10.2};
           Character[] characterArray = {'T', 'O', 'L', 'G', 'A'};

           printArray(integerArray);
           printArray(doubleArray);
           printArray(characterArray);
      }

      public static <T> void printArray(T[] inputArray)
      {
            for(T element : inputArray)
                System.out.printf("%s ", element);
            System.out.println();
      }
}
