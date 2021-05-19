public class Card
{
  // this is a public static final variable
  public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

  private String suit;
  private int face;
  //default constructor

   //constructor with parameters to set PIV’s

   // modifiers
   // set methods for PIV’s

   //accessors
   // get methods for PIV’s

   // used later for values of cards

  
  public Card(){
    suit = "";
    face =0;
  }
  public Card(int f, String s){
    suit =s;
    face =f;
  }

  public void setSuit(String s){
    suit = s;
  }

  public void setFace(int f){
    face =f;
  } 
  public String getSuit(){
    return suit;
  }
  public int getFace(){
    return face;
  }
   public int getValue()
   {
      return face;
   }
   
   public boolean equals(Object obj)
   { 
     //sees if the Card that is running is equal to the card being passed through in the method
     Card other = (Card) obj;
    if(this.suit.equals(other.getSuit())&&this.face==other.getFace())
      return true; 
    return false;
      
   }
   public String toString(){
     //prints from the FACES array along with the suit PIV
     return FACES[face]+" of "+suit;
   }


}