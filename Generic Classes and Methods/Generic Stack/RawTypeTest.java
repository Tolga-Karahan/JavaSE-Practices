// Raw type testing program
public class RawTypeTest
{
     public static void main(String[] args)
     {

          Double[] doubleValues = {1.4, 2.7, 5.1, 9.4, 10.8};
          Integer[] integerValues = {1, 97, 45, 65, 21, 6 , 8};

          // Raw-type stack variable assigned a raw-type stack reference
          Stack rawTypeStack1 = new Stack(5);

          // Stack<Double> assigned to a raw-type Stack variable
          Stack rawTypeStack2 = new Stack<Double>(5);

          // Raw-type stack assigned to Stack<Integer> variable
          Stack<Integer> integerStack = new Stack(10);

          testPush("rawTypeStack1", rawTypeStack1, doubleValues);
          
     }

     public static <T> void testPush(String name, Stack<T> stack,
         T[] values)
     {
          System.out.printf("%nPushing elements onto %s%n", name);

          for(T value : values)
          {
               System.out.printf("%s ", value);
               stack.push(value);
          }
     }

     public static <T> void testPop(String name, Stack<T> stack)
     {
          try
          {
               System.out.printf("%nPopping elements from %s%n", name);
               T poppedValue;

               while(true)
               {
                    poppedValue = stack.pop();
                    System.out.printf("%s ", poppedValue);
               }
          }
          catch(EmptyStackException emptyStackException)
          {
               System.err.println();
               emptyStackException.printStackTrace();
          }
     }
}
