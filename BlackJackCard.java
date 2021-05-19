import java.util.Scanner;
public class BlackJackCard extends Card{
  public BlackJackCard(){
    //calls the Card constructor
    super(0,"");
  }
  public BlackJackCard(int f, String s){
    //calls the Card constructor
    super(f,s);
  }

  public int getValue(){
    //enables you to build the value for the game into the card
    //face cards have a value of 10; cards 2-9 have face value 2-9
    //for now, Aces have a value of 11
    if(this.getFace()<=10&&this.getFace()>=2){
      return this.getFace();
    }
    if(this.getFace()==1){
      return 11;

    }
    if(this.getFace()>=10){
      return 10;
    }
    return 0;
  }
  public String toString(){
    return super.toString()+" | value = "+this.getValue();
  }

}
