package week_06_final_coding_project;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		System.out.println("Starting with a new deck of " + deck.size());
		
		System.out.println("\nDeck Shuffled!");
		deck.shuffle();
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.setName("Player One");
		player2.setName("Player Two");
		
		System.out.println("Each player is dealt a card until each player has a stack of 26 cards in front of them.");
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} 
			else {
				player2.draw(deck);
			}
		}
			int round = 0;
			

			
			System.out.println("\nEach player draws a card from the top of their deck");
			
			for (int i = 0; i < 26; i++) {
				round++;
				Card cardOne = player1.flipCard();
				Card cardTwo = player2.flipCard();
				
				System.out.print("\n" + player1.getName() + " plays ");
				cardOne.describe();
				System.out.print(player2.getName() + " plays ");
				cardTwo.describe();
				
				if (cardOne.getValue() > cardTwo.getValue()) {
					player1.incrementScore();
					System.out.println(" " + player1.getName() + " Wins round " + round + "!");
					System.out.println(" The current score is Player One: " + player1.getScore() + ", Player Two: " + player2.getScore());
				} else if (cardTwo.getValue() > cardOne.getValue()) {
					player2.incrementScore();
					System.out.println(" " + player2.getName() + " Wins round " + round + "!");
					System.out.println(" The current score is Player One: " + player1.getScore() + ", Player Two: " + player2.getScore());
				} else {
					System.out.println(" Round " + round + " is a Draw!");
				}
								
			}
			
			System.out.println("\nBoth player's are out of cards! The game is over");
			
			int playerOneScore = player1.getScore();
			int playerTwoScore = player2.getScore();
			
			if (playerOneScore > playerTwoScore) {
				System.out.println("\nPlayer One is the Winner!!!");
			} else if (playerTwoScore > playerOneScore){
				System.out.println("\nPlayer Two is the Winner!!!");
			} else {
				System.out.println("\nIt's a Draw!");
			}
		}
		
	}

