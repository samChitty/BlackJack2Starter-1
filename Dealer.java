public class Dealer extends Player{
  private Deck deck;
  public Dealer(){
    deck = new Deck();
  }
  public void shuffle(){
    deck.shuffle();
  }

  public Card deal(){
    return deck.nextCard();
  }

  public int numCardsLeftInDeck(){
    return deck.numCardsLeft();
  }

  public boolean hit(){
    //makes the dealer hit as long as their hand value is less than 17
    while(this.getHandValue()<17){
      return true;
    }
  
  return false;
  }
}