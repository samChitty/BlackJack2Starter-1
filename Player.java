import java.util.ArrayList;
import java.util.Scanner;
public class Player{
  private ArrayList<Card> hand;
  private int winCount;
  private int money;
  private ArrayList<Card> splHand;

  public Player(){
    money =0;
    winCount =0;
    hand = new ArrayList<Card>();
  }

  public Player(int score, int x){
    winCount =score;
    money =x;
    hand = new ArrayList<Card>();
  }

//used to add cards to hand—call appropriate Card method
  public void addCardToHand(Card temp){
    hand.add(temp);
  }

  public void resetHand(){
    hand.clear();
  }

  public int getMoney(){
    return money;
  }

  public int getWinCount(){
    return winCount;
  }

  public int getHandSize(){
    return hand.size();
  }
  public int getHandValue(){
    int output = 0;
    for(int i=0;i<hand.size();i++){
      output+=hand.get(i).getValue();
    }
    return output;
  }
  
  public boolean fiveCard(){
    if(getHandSize()==5){
      return true;
    }
    return false;
  }
  public void setMoney(int x){
    money =x;
  }

  public int bet(int x){
    setMoney(getMoney()-x);
    return x;
  }

  public void setWinCount(int x){
    winCount = x;
  }


  public boolean hit(){
    //uses a scanner to find out if the player wants to hit or not, if they do returns true, if not returns false
    Scanner kb = new Scanner(System.in);
    System.out.println("Do you want to hit (Y/N y/n) ");
    String n = kb.next();
    while(n.equals("y")||n.equals("Y")){
      System.out.println("Do you want to hit (Y/N y/n) ");
      return true;
    }
    return false;
  }
  public void changeAce(){
    Scanner j = new Scanner(System.in);
    for(Card x: hand){
      if(x.getValue()==11){
        //while(getHandValue()>21){
        System.out.println("Would you like your ace to be a 1 or 11 (input the number 1 or 11)");
        String n = j.next();
        if(n.equals("1")){
          x.setFace(1);
        }else{
        x.setFace(11);
        //}
      }
      }
    }
    System.out.println(hand.toString()+getHandValue());
  }


  public boolean split(){
    Scanner s = new Scanner(System.in);
    if(hand.get(0).getValue()==hand.get(1).getValue()){
      System.out.println("Do you want to split your cards(y/n)");
      String spl = s.next();
      if(spl.equals("y")){
        splHand.add(hand.get(0));
        hand.remove(0);
        System.out.println("Hand 1: "+hand.toString());
        System.out.println("Hand 2: "+splHand.toString());
        return true;
      }

  }
  return false;
  }
  public void addCardToSplitHand(Card temp){
    splHand.add(temp);
  }
  public int getSplitHandValue(){
    int output = 0;
    for(int i=0;i<splHand.size();i++){
      output+=splHand.get(i).getValue();
    }
    return output;
  }
  public String toString(){
    return hand.toString()+"\n handValue\n"+getHandValue();
  }



}