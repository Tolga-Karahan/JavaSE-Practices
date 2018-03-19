// String methods replace, toLowerCase, toUpperCase, trim, and toCharArray.

public class StringMiscellaneous2
{
       public static void main(String[] args)
       {
              String s1 = "hello";
              String s2 = "GOODBYE";
              String s3 = "   spaces    ";

              System.out.printf("s1 = %s%ns2 = %s%n3 = %s%n%n", s1, s2, s3);

              // test method replace
              System.out.printf(
                    "Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));

              // test toLowerCase and toUpperCase
              System.out.printf(
                    "s1.toUpperCase() = %s%n", s1.toUpperCase());
              System.out.printf(
                    "s2.toLowerCase() = %s%n", s2.toLowerCase());

              // test trim method
              System.out.printf("s3 after trim = \"%s\" %n%n", s3.trim());

              // test toCharArray method
              char[] charArray = s1.toCharArray();
              System.out.print("s1 as a character array = ");
              for(Character character : charArray)
                    System.out.printf("%c", character);
              System.out.println();                        
       }
}
