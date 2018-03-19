// String valueOf methods.
public class StringValueOf
{
       public static void main(String[] args)
       {
              char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
              boolean booleanValue = true;
              char characterValue = 'Z';
              int integerValue = 7;
              long longValue = 10000000000L; // L suffix indicates Long
              float floatValue = 2.5f; // f indicates that 2.5 is a float
              double doubleValue = 33.333; // no suffix, double is default
              Object objectRef = "hello"; // assing String to an Object reference

              System.out.printf(
                   "char array = %s%n", String.valueOf(charArray));
              System.out.printf(
                   "part of char array = %s%n", String.valueOf(charArray, 3, 3));
              System.out.printf(
                   "boolean = %s%n", String.valueOf(booleanValue));
              System.out.printf(
                   "char = %s%n", String.valueOf(characterValue));
              System.out.printf(
                   "int = %s%n", String.valueOf(integerValue));
              System.out.printf(
                   "long = %s%n", String.valueOf(longValue));
              System.out.printf(
                   "float = %s%n", String.valueOf(floatValue));
              System.out.printf(
                   "double = %s%n", String.valueOf(doubleValue));
              System.out.printf(
                   "Objects = %s%n", String.valueOf(objectRef));                                       
       }
}
