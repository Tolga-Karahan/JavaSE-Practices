// initializes an array with command-line arguments
public class InitArray4{

       public static void main(String[] args){

             if(args.length != 3)
                 System.out.printf("Error: Please re-enter the entire command." +
                     "Command must include an array size" +
                     " initial value and increment.%n");
              else{

                  int arrayLength = Integer.parseInt(args[0]);
                  int[] array = new int[arrayLength];

                  int initialValue = Integer.parseInt(args[1]);
                  int increment = Integer.parseInt(args[2]);

                  for(int counter = 0; counter < array.length; counter++)
                      array[counter] = initialValue + counter * increment;

                  System.out.printf("%s%8s%n", "Index", "Value");

                  for(int counter = 0; counter < array.length; counter++)
                      System.out.printf("%5d%8d%n", counter, array[counter]);
              }
       }
}
