import java.util.Scanner;
public class BlackJack{
  private Dealer dealer;
  private Player player;

  public BlackJack(){
    dealer = new Dealer();
    player = new Player();
  }

  public void playGame(){
    Scanner kb = new Scanner(System.in);
    dealer.shuffle();
    player.resetHand();
    dealer.resetHand();
    //uses a scanner to see if the player wants to play
    System.out.println("Do you want to play?(y/n) ");
    String n = kb.next();
    while(n.equals("y")){
     System.out.println("How much do you want to buy in");
     player.setMoney(kb.nextInt());

    while(player.getMoney()>0&&n.equals("y")){
      player.resetHand();
      dealer.resetHand();
      //deals one card at a time, shows one of the dealer's cards and both of the players cards
      System.out.println("How much would you like to bet?");
      int am = kb.nextInt();
      int amount = 0;
      if(am>player.getMoney()){
       System.out.println("You dont have enough money, bet something lower");
       amount = player.bet(kb.nextInt());
      }else{
        amount =player.bet(am);
      }
      player.addCardToHand(dealer.deal());
      dealer.addCardToHand(dealer.deal());
      System.out.println("Dealer is Showing: \n"+dealer.toString()+"\n Value = "+dealer.getHandValue());
      player.addCardToHand(dealer.deal());
      dealer.addCardToHand(dealer.deal());
      System.out.println("Your Hand ="+player.toString()+"\n Value = "+player.getHandValue());
      //player.changeAce();
      //if(player.getHandValue)
      // if(player.split()){
      //   player.bet(amount);
      // }
      System.out.println("Would you like to double down? y/n");
      String r = kb.next();
      if(r.equals("y")){
        player.bet(amount);
        player.addCardToHand(dealer.deal());
        System.out.println("Your hand ="+player.toString()+"\n Value = "+player.getHandValue());
        //player.changeAce();
      }else{
      
      while(player.getHandValue()<21&&player.hit()){
        //  if(player.split()){
        //    System.out.println("Would you like to hit the first hand, the second hand, or neither(1/2/n)");
        //    String w = kb.next();
        //    if(w.equals("1")){
        //      player.addCardToHand(dealer.deal());
        //      System.out.println("\n Value = "+player.getHandValue());
        //    }else if(w.equals("2")){
        //      player.addCardToSplitHand(dealer.deal());
        //      System.out.println("\n Value = "+player.getSplitHandValue());
        //    }
        //  }

        //adds a card to the players hand if the player says yes to hitting and their hand value is less than 21
        player.addCardToHand(dealer.deal());
        System.out.println("\n Value = "+player.getHandValue());
        //player.changeAce();
        if(player.fiveCard()){
          System.out.println("Five Card Charlie! You win unless you want to keep hitting");
        }
      
      }
      System.out.println(player.toString()+"\n Value = "+player.getHandValue());
      }
      if(!(player.fiveCard())){
      while(dealer.hit()){
        //if the hit method for the dealer is true than it adds a card to the dealer's hand
         dealer.addCardToHand(dealer.deal());
      }
      }
      System.out.println();
      System.out.println("Dealer Hand: \n"+dealer.toString()+"\n Value = "+dealer.getHandValue());
      

     //the following if statements finds out who wins the hand 
     int playerTotal = player.getHandValue();
		 int dealerTotal = dealer.getHandValue();
     if(player.fiveCard()){
       player.setWinCount(player.getWinCount()+1);
       player.setMoney(player.getMoney()+(amount*4));
     }
      else if(playerTotal>21) 
		{
		   System.out.println("\nDealer wins - Player busted!");
       dealer.setWinCount(dealer.getWinCount()+1);
		}
		else if(playerTotal<=21&&dealerTotal>21)
		{
		   System.out.println("\nPlayer wins - Dealer busted!");
       player.setWinCount(player.getWinCount()+1);
       if(r.equals("y")){
         player.setMoney(player.getMoney()+(amount*4));
       }else{
       player.setMoney(player.getMoney()+(amount*2));
       }
		}
		//else if(playerTotal>21&&dealerTotal>21){
		  // System.out.println("Both players bust!");
		//}
		else if(playerTotal<dealerTotal){
		   System.out.println("\nDealer has bigger hand value!");
      dealer.setWinCount(dealer.getWinCount()+1);
		}
		else if(playerTotal>dealerTotal){
		   System.out.println("\nPlayer has bigger hand value!");
       player.setWinCount(player.getWinCount()+1);
       if(r.equals("y")){
         player.setMoney(player.getMoney()+(amount*4));
       }else{
       player.setMoney(player.getMoney()+(amount*2));
       }
		}
    else {
		   System.out.println("\nPlayer and Dealer are tied!");
      //  if(r.equals("y")){
      //    player.setMoney(player.getMoney()+(amount));
      //  }
       player.setMoney(player.getMoney()+(amount));
		}	
    System.out.println("Money = "+player.getMoney());
    System.out.println("Player wins = "+player.getWinCount());
    System.out.println("Dealer wins = "+dealer.getWinCount());

    if(dealer.numCardsLeftInDeck()<10){
      //if the number of cards gets under 10, than it shuffles the deck
      System.out.println("Shuffling new deck...");
      dealer.shuffle();
    }
      System.out.println();
      System.out.println("Num cards left: "+dealer.numCardsLeftInDeck());

      if(player.getMoney()<=0){
        System.out.println("Out of money");
      }else{
      System.out.println("Do you want to keep playing(Y/Ny/n) \n");
      n = kb.next();
      }
      System.out.println();
    //If they answer no, the game ends, if they answer yes, another round starts



    }
    
  }
  }


}