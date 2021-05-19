import java.util.ArrayList;
import java.util.Collections;
public class Deck{
  public static final int NUMFACES = 13;
  public static final int NUMSUITS = 4;
  public static final int NUMCARDS = 52;
  public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};
  private int topCardIndex;	   
  private ArrayList<Card> stackOfCards;
  
  
  public Deck(){
    //initialize the instance variables
     // topCardIndex should start at 1 less than NUMCARDS
     //fill stackOfCards - one loop to go through all SUITS
     //one loop to go through all FACES
     //add in each new BlackJackCard(face,suit) to the Deck
    topCardIndex = (NUMCARDS-1);
    stackOfCards = new ArrayList<Card>();
    for(int i=0;i<SUITS.length;i++) {
      for(int j = 1; j < NUMFACES+1; j++) {
        stackOfCards.add(new BlackJackCard(j, SUITS[i]));
      }
    }
  }
  

  public int size(){
    return stackOfCards.size();
  }



  public int numCardsLeft(){
    return topCardIndex+1;
  }



  public void shuffle(){
    Collections.shuffle(stackOfCards);
    topCardIndex = (NUMCARDS-1);
  }
  
  public Card nextCard(){
    Card output = stackOfCards.get(topCardIndex);
    topCardIndex--;
    return output;
    }
  public String toString(){
      return stackOfCards.toString().replaceAll(",","\n")+" \ntop Card index "+ topCardIndex;
   }


}