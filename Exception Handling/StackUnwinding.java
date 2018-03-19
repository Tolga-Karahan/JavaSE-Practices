public class StackUnwinding
{
      public static void main(String[] args)
      {
           try
           {
                method1();
           }
           catch(Exception exception)
           {
                System.out.printf("%s%n%n", exception.getMessage());
                exception.printStackTrace();

                StackTraceElement[] traceElements = exception.getStackTrace();

                System.out.println("Class\t\tFile\t\t\tLine\tMethod:");

                for(StackTraceElement element : traceElements)
                {
                     System.out.printf("%s\t", element.getClassName());
                     System.out.printf("%s\t", element.getFileName());
                     System.out.printf("%s\t", element.getLineNumber());
                     System.out.printf("%s%n", element.getMethodName());
                }
           }
      }

      public static void method1() throws Exception
      {
           method2();
      }

      public static void method2() throws Exception
      {
           method3();
      }

      public static void method3() throws Exception
      {
           throw new Exception("Exception thrown in method3");
           // Stack unwinding occurs due to exception is not catched here
           // Method terminates and local variables go out-of-scope
      }
}
