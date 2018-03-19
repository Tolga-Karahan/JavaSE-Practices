// Printing array elements using overloaded methods.

public class OverloadedMethods
{
      public static void main(String[] args)
      {
            Integer[] integerArray = {4, 1, 0, 2, 8, 14};
            Double[] doubleArray = {1.2, 2.4, 3.7, 8.4, 9.2};
            Character[] characterArray = {'T', 'O', 'L', 'G', 'A'};

            System.out.println("Array integerArray contains:");
            printArray(integerArray);
            System.out.println("Array doubleArray contains:");
            printArray(doubleArray);
            System.out.println("Array characterArray contains:");
            printArray(characterArray);    
      }

      // method printArray to print Integer array
      public static void printArray(Integer[] inputArray)
      {
            for(Integer element : inputArray)
                System.out.printf("%s ", element);

            System.out.println();
      }

      // method printArray to print Double array
      public static void printArray(Double[] inputArray)
      {
            for(Double element : inputArray)
                System.out.printf("%s ", element);

            System.out.println();
      }

      //method printArray to print Character array
      public static void printArray(Character[] inputArray)
      {
             for(Character element : inputArray)
                 System.out.printf("%s ", element);

             System.out.println();
      }
}
