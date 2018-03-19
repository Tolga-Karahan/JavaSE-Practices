// Testing Generic Stack class
public class StackTest
{
      public static void main(String[] args)
      {
          Double[] doubleElements = {1.7, 2.5, 3.1, 7.9, 10.1};
          Integer[] integerElements = {4, 7, 3, 41, 32, 48, 77, 55};

          Stack<Double> doubleStack = new Stack<>(5);
          Stack<Integer> integerStack = new Stack<>();

          // Pushing and popping double elements to stack
          testPushDouble(doubleStack, doubleElements);
          testPopDouble(doubleStack);

          // Pushing and popping integer elements to stack
          testPushInteger(integerStack, integerElements);
          testPopInteger(integerStack);

      }

      public static void testPushDouble(
          Stack<Double> stack, Double[] values)
      {
          System.out.println("\nPushing elements onto doubleStack\n");

          for(Double value : values)
          {
              System.out.printf("%.1f ", value);
              stack.push(value);
          }
      }

      public static void testPopDouble(Stack<Double> stack)
      {

          try
          {
              System.out.println("\nPopping elements from doubleStack\n");
              Double poppedValue;

              while(true)
              {
                  poppedValue = stack.pop();
                  System.out.printf("%.1f ", poppedValue);
              }
          }
          catch(EmptyStackException emptyStackException)
          {
              System.err.println();
              emptyStackException.printStackTrace();
          }
      }

      public static void testPushInteger(
          Stack<Integer> stack, Integer[] values)
      {
          System.out.println("\nPushing elements onto integerStack\n");

          for(Integer value : values)
          {
              System.out.printf("%d ", value);
              stack.push(value);
          }
      }

      public static void testPopInteger(Stack<Integer> stack)
      {
          try
          {
              System.out.println("\nPopping elements from integerStack\n");
              int poppedValue;

              while(true)
              {
                  poppedValue = stack.pop();
                  System.out.printf("%d ", poppedValue);
              }
          }
          catch(EmptyStackException emptyStackException)
          {
              System.err.println();
              emptyStackException.printStackTrace();
          }
      }

}
