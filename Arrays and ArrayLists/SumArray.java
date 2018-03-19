public class SumArray{

      public static void main(String[] args){

            double[] array = {45,57,30,56,14,85,52,98,74,65};
            double sum = 0;

            for(int counter = 0; counter < array.length; counter++)
                  sum += array[counter];

            System.out.printf("Total of array elements : %f%n", sum);
      }

}
