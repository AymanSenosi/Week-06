package week_06_final_coding_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// instance variables
	private List<Card> cards = new ArrayList<Card>();
	
	
	public Deck() {
		
		List<String> suites = Card.getValidSuites();
		
		List<Integer> values = Card.getValidValues();
		
		cards = new ArrayList<>();
		
		for (int value : values) {
			for (String suite : suites) {
				cards.add(new Card(value, suite));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card card = cards.remove(0);
		return card;
	}

	public int size() {
		return cards.size();
	}
	
}
