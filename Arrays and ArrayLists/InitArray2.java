public class InitArray2{

      public static void main(String[] args){

            int[] array = {5,78,46,95,1,4,2,6,47,54};

            System.out.printf("%s%8s%n", "Index", "Value");

            for(int counter = 0; counter < array.length; counter++){

                  System.out.printf("%5d%8d%n", counter, array[counter]);
            }
      }
}
