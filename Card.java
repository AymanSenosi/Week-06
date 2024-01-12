package week_06_final_coding_project;

import java.util.Arrays;
import java.util.List;

// my Card class
public class Card {
	
	/**
	 * Instance Variables
	 */
	private int value; 
	private String name; 
	private String suite; 
	
	/**
	 * my Card class Constructor
	 * @param value
	 * @param suite
	 */
	public Card(int value, String suite) {
		
		// assigned value to the setter, rather than to the instance variable. 
		setValue (value);
		
		// assigned the suite to the setter, rather than to the instance variable.
		setSuite (suite);
		
		// this switch statement returns the name of the card based on the value of the card
		switch(value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;
		}
	}


	public int getValue() {
		return value;
	}
	

	/**
	 * This method returns a list of face values that are valid for Card objects
	 */
	public static List<Integer> getValidValues() {
		return Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
	}
	
	
	/**
	 * This method will validate the argument and set the instance variable
	 * @param value 2, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14.
	 */
	public void setValue(int value) {
		List<Integer> validValues = getValidValues();
		if (validValues.contains (value))
		this.value = value;
		else
			throw new IllegalArgumentException("Valid value's are: " + validValues);
	}
	
	public String getName() {
		return name;
	}

	/**
	 * This method will return a list of valid names
	 * @return Spades, Hearts, Clubs, Diamonds
	 */
	public static List<String> getValidNames() {
		return Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");
	}
	
	public void setName(String name) {
		List<String> validNames = getValidNames();
		if (validNames.contains(name))
		this.name = name;
		else
			throw new IllegalArgumentException("Valid name's are " + validNames);
	}

	public String getSuite() {
		return suite;
	}

	public static List<String> getValidSuites() {
		return Arrays.asList("Spades", "Clubs", "Diamonds", "Hearts");
	}
	
	public void setSuite(String suite) {
		List<String> validSuites = getValidSuites();
		if (validSuites.contains(suite))
		this.suite = suite;
		else
			throw new IllegalArgumentException("Valid name's are " + validSuites);
	}
	
	public String toString() {
		return String.format("%s(%d) of %s",  name, value, suite);
	}
	
	public void describe() {
		System.out.println(toString());
	}
	
}