interface myFunctionalInterface
{
      void myFunction(int myParam);
}

public class FunctionalInterfaceTest
{
      public static void myTestFunction(int myValue,
          myFunctionalInterface superType)
      {
            superType.myFunction(myValue);
      }

      public static void main(String[] args)
      {
          myTestFunction(15, myParam -> System.out.printf(
              "My parameter is: %d%n", myParam));
      }
}
