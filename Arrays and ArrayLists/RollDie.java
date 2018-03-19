import java.security.SecureRandom;

public class RollDie{

     public static void main(String[] args){

            SecureRandom randomNumbers = new SecureRandom();

            int[] frequency = new int[7];

            for(int roll = 1; roll < 6000000; roll++){

                 ++frequency[1 + randomNumbers.nextInt(6)];
            }

            System.out.printf("%s%10s%n", "Face", "Frequency");

            for(int face = 1; face < frequency.length; face++)
                  System.out.printf("%4d%10d%n", face, frequency[face]);
     }
}
