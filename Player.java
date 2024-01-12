package week_06_final_coding_project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	// default constructor that takes no arguments
	public Player() {	
	}
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
	public void describe() {
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flipCard() {
		return hand.remove(0);
	}
	
	public void draw(Deck cards) {
		hand.add(cards.draw());
	}
	
	public void incrementScore() {
		score++;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
