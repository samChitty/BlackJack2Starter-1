class Main {
  public static void main(String[] args) 
  {
    //Comment out tester code for classes not yet written
    //or not being tested
    //Uncomment code for classes you want to test
    System.out.println("\n");
      //Tester Code for the Card class
    // Card c1 = new Card(1, "Diamonds");
    // System.out.println(c1);
    // Card c2 = new Card(4, "Clubs");
    // System.out.println(c2);
    // Card c3 = new Card(4,"Clubs");
    // System.out.println(c3);
    // System.out.println(c1.equals(c2));
    // System.out.println(c2.equals(c3));
    // c3.setSuit("Diamonds");
    // System.out.println(c3);
    // System.out.println(c2.equals(c3));
    // c1.setFace(4);
    // System.out.println(c1);
    // System.out.println(c1.equals(c2));
    // System.out.println(c1.equals(c3));
    // System.out.println(c1.getValue());
    // System.out.println(c1.getFace());
    // System.out.println(c1.getSuit());
    // System.out.println("\n");

    // //   // Tester code for the BlackJackCard class
    //  Card c4 = new BlackJackCard();
    //  System.out.println(c4);
    //  BlackJackCard c5 = new BlackJackCard(1,"DIAMONDS");
    //  System.out.println(c5);
    //  BlackJackCard c6 = new BlackJackCard(12,"SPADES");    
		//  System.out.println(c6);
    //  System.out.println(c5.equals(c6));
    //  System.out.println(c6.equals(c6));
    //  System.out.println(c5.getValue());
    //  System.out.println(c6.getValue());
    //  System.out.println("\n");

    // //   //Tester code for Deck class
    //  Deck d1 = new Deck();
    //  System.out.println(d1);
    //  System.out.println("\n");
    //  d1.shuffle();
    //  System.out.println("Shuffled: \n"+d1);
    //  System.out.println("\n");
    //  d1.nextCard();
    //  d1.nextCard();
    //  d1.nextCard();
    //  System.out.println("3 cards dealt: \n"+d1);
    //  System.out.println("\n");
    //  System.out.println("numCardsLeft: "+d1.numCardsLeft());
    //  System.out.println("size of deck: "+d1.size());
    //  System.out.println("\n");

    // //   //Player tester code
    //  Player player = new Player();	
		
		//  Deck deck = new Deck();
		//  deck.shuffle();
		
		//  player.addCardToHand(deck.nextCard());
		//  player.addCardToHand(deck.nextCard());

		//  System.out.println("\n\ntoString");
		//  System.out.println(player);	
		
		//  System.out.println("\n\nhandValue");
		//  System.out.println(player.getHandValue());					
		
		//  player.addCardToHand(deck.nextCard());
		//  player.addCardToHand(deck.nextCard());

		//  System.out.println("\n\ntoString");
		//  System.out.println(player);	
		
		//  System.out.println("\n\nhandValue");
		//  System.out.println(player.getHandValue());

    //  player.resetHand();
    //  player.addCardToHand(deck.nextCard());
		//  player.addCardToHand(deck.nextCard());
    //  System.out.println();
    //  if(player.hit())
    //  {
    //    player.addCardToHand(deck.nextCard());
    //  }
    //  System.out.println();
    //  System.out.println("\ntoString");
		//  System.out.println(player);
    //  System.out.println();

    //   //Dealer tester code
		//  Dealer dealer = new Dealer();
		//  Player player = new Player();
		
		//  dealer.shuffle();
		
		//  player.addCardToHand(dealer.deal());
		//  dealer.addCardToHand(dealer.deal());
		//  player.addCardToHand(dealer.deal());
		//  dealer.addCardToHand(dealer.deal());
		
		//  int playerTotal = player.getHandValue();
		//  int dealerTotal = dealer.getHandValue();
		
		//  System.out.println("\nPLAYER ");
		// System.out.println("Hand Value :: " + playerTotal );
		// System.out.println("Hand Size :: " + player.getHandSize() );
		// System.out.println("Cards in Hand :: " + player.toString() );
		// System.out.println("\nDEALER ");
		// System.out.println("Hand Value :: " + dealerTotal );
		// System.out.println("Hand Size :: " + dealer.getHandSize() );
		// System.out.println("Cards in Hand :: " + dealer.toString() );
    // if(dealer.hit())
    // {
    //   dealerTotal = dealer.getHandValue();
    // }

    // System.out.println("\nDEALER ");
		// System.out.println("Hand Value :: " + dealerTotal );
		// System.out.println("Hand Size :: " + dealer.getHandSize() );
		// System.out.println("Cards in Hand :: " + dealer.toString() );
		
		// if(playerTotal>21&&dealerTotal<=21)
		// {
		//    System.out.println("\nDealer wins - Player busted!");
		// }
		// else if(playerTotal<=21&&dealerTotal>21)
		// {
		//    System.out.println("\nPlayer wins - Dealer busted!");
		// }
		// else if(playerTotal>21&&dealerTotal>21){
		//    System.out.println("Both players bust!");
		// }
		// else if(playerTotal<dealerTotal){
		//    System.out.println("\nDealer has bigger hand value!");
		// }
		// else if(playerTotal>dealerTotal){
		//    System.out.println("\nPlayer has bigger hand value!");
		// }
    // else {
		//    System.out.println("\nPlayer and Dealer are tied!");
		// }	

    // System.out.println("\nNum cards left in Deck: "+dealer.numCardsLeftInDeck());

    //   //BlackJack tester code
      BlackJack game = new BlackJack();
		  game.playGame();

    // Card card = new Card(11,"SPADES");
    // Card card2 = new Card(3,"CLUBS");
    // Player player = new Player();
    // Dealer dealer = new Dealer();
    // player.addCardToHand(card2);
    // dealer.addCardToHand(dealer.deal());
    // player.addCardToHand(card);
   
    // System.out.println(player.toString());
    //  player.changeAce();

  }
}