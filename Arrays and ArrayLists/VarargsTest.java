public class VarargsTest{

       public static double average(double... numbers){

             double total = 0.0;

             for(double element : numbers)
                  total += element;

             return total / numbers.length ;
       }

       public static void main(String[] args){

             double d1 = 10.0;
             double d2 = 20.0;
             double d3 = 30.0;
             double d4 = 40.0;

             System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n",
                  d1, d2, d3, d4);

              System.out.printf("Average of d1 and d2 is: %.1f%n",
                  average(d1, d2));
              System.out.printf("Average of d1, d2 and d3 is: %.1f%n",
                  average(d1, d2, d3));
              System.out.printf("Average of d1, d2, d3 and d4 is: %.1f%n",
                  average(d1, d2, d3, d4));
       }
}
