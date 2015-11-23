package pokerHands.pokerHands.util;

import java.util.ArrayList;
import java.util.List;

import pokerHands.pokerHands.model.Card;


public class Parser {
	
    private static int convertToNumber(char c) {
    	int value;
		switch (c) {
			case 'T':
				value = 10;
				break;
			case 'J':
				value = 11;
				break;
			case 'Q':
				value = 12;
				break;
			case 'K':
				value = 13;
				break;
			case 'A':
				value = 14;
				break;
			default:
				value = Character.getNumericValue(c);
		}	
		return value;
    }
	 
    private static Card convertToCard(String token) {
    	int value = convertToNumber(token.charAt(0));
		String suit = Character.toString(token.charAt(1));
    	return new Card(value,suit);
    }

	public static List<Card> parseListOfCards(String[] tokens) {
		List<Card> returnValue = new ArrayList<Card>();	
		for (String token : tokens) {
		        if (token.isEmpty()) {
		        	continue;	
		        }
		        returnValue.add(convertToCard(token));
			}
		return returnValue;
	}
}