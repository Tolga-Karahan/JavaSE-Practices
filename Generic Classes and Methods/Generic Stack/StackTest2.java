// Using generic methods inside generic Stack class
public class StackTest2
{
      public static void main(String[] args)
      {
          Double[] doubleValues = {1.2, 3.7, 4.2, 9.7, 1.5};
          Integer[] integerValues = {77, 31, 47, 6, 32, 98, 5};

          Stack<Double> doubleStack = new Stack<>(5);
          Stack<Integer> integerStack = new Stack<>();

          testPush(doubleStack, doubleValues);
          testPop(doubleStack);

          testPush(integerStack, integerValues);
          testPop(integerStack);
      }

      public static <T> void testPush(Stack<T> stack, T[] values)
      {
          System.out.printf("Pushing elements onto %sstack%n",
               stack.getClass().getTypeParameters()[0]);

          for(T value : values)
          {
               System.out.printf("%s ", value);
               stack.push(value);
          }
      }

      public static <T> void testPop(Stack<T> stack)
      {
           try
           {
               System.out.printf("%nPopping elements from %sstack%n",
                   stack.getClass().getTypeParameters()[0]);
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
