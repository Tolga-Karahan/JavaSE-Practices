//Card class represents a playing card.

public class Card{

     private final String face; // face of card("Ace", "Deuce",...)
     private final String suit; // suit of card("Hearts", "Diamonds"...)

     public Card(String face, String suit){
          this.face = face;
          this.suit = suit;
     }

     public String toString(){
          return face + " of " + suit;
     }

     public String getFace()
     {
          return face;
     }

     public String getSuit()
     {
          return suit;
     }
}
