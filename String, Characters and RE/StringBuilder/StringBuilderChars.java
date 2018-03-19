// StringBuilder methods charAt, setCharAt, getChars, reverse

public class StringBuilderChars
{
       public static void main(String[] args)
       {
              StringBuilder buffer = new StringBuilder("hello there");

              System.out.printf("buffer = %s%n", buffer);

              System.out.printf("Character at 0: %s%nCharacter at 4: %s%n",
                    buffer.charAt(0), buffer.charAt(4));

              char[] charArray = new char[buffer.length()];
              buffer.getChars(0, buffer.length(), charArray, 0);
              System.out.println("The characters are: ");
              for(char character : charArray)
                    System.out.printf("%c", character);

              buffer.setCharAt(0, 'H');
              buffer.setCharAt(6, 'T');
              System.out.printf("%nbuffer = %s%n", buffer);

              buffer.reverse();
              System.out.printf("buffer = %s%n", buffer);
       }
}
