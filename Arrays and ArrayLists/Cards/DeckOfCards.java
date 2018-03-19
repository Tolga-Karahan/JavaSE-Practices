//DeckOfCards class represents a deck of playing cards.
import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards{

      private Card[] deck;
      private int currentCard;
      private static final int NUMBER_OF_CARDS = 52;

      SecureRandom randomNumbers = new SecureRandom();

      public DeckOfCards(){

            String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
            String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

            deck = new Card[NUMBER_OF_CARDS];
            currentCard = 0;

            for(int count = 0; count < deck.length; count++)
                 deck[count] =
                        new Card(faces[count % 13], suits[count / 13]);
      }

      public void shuffle(){

            // next call to method dealCard should start at deck[0] again
            currentCard = 0;

            for(int first = 0; first < deck.length; first++){

                  int second = randomNumbers.nextInt(52);

                  Card temp = deck[first];
                  deck[first] = deck[second];
                  deck[second] = temp;
            }

      }

      public Card dealCard(){

            // determine whether Cards remain to be dealt
            if(currentCard < deck.length)
                 return deck[currentCard++]; // return current card in deck
            else
                 return null; // return null indicates there is no card in deck
      }

      public void determineHand(Card[] hand)
      {
            int[] frequency = new int[5];
            Arrays.fill(frequency, 1);
            int pair = 0;
            int threeOfAKind = 0;
            int fourOfAKind = 0;
            boolean flush = true;
            boolean straight = true;
            int fullHouse = 0;

            for(int i = 0; i < hand.length; i++)
            {


                  if(frequency[i] != 0)
                      for(int j = (i + 1); j < hand.length; j++)

                          if(hand[i].getSuit() != hand[j].getSuit())
                              flush = false;

                          if(hand[i].getFace() == hand[j].getFace())
                          {
                              frequency[i]++;
                              frequency[j] = 0;
                          }
            }

            for(int elem : frequency)
            {
                 if(elem == 2)
                    pair++;
                 if(elem == 3)
                    threeOfAKind++;
                 if(elem == 4)
                    fourOfAKind++;
            }

      }
}
