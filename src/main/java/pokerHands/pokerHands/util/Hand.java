package pokerHands.pokerHands.util;

import java.util.ArrayList;
import java.util.List;

import pokerHands.pokerHands.model.Card;
import pokerHands.pokerHands.model.Rank;
import pokerHands.pokerHands.model.Result;
import pokerHands.pokerHands.model.Suit;

public class Hand {
	
	public static Rank checkHand(List<Card> cards, List<Result> resultList) {	
		List<Integer> values = changeToListOfValues(cards);
		List<Integer> occurs = changeToListOfOccurs(resultList);
		Rank rank;
		
		try {
			rank = Rank.findRankNumberByList(occurs);
		} catch (NullPointerException ex) {
			rank = Rank.HIGH_CARD;
			
			if(checkSuit(cards)){
				rank = Rank.FLUSH;
				if(straight(values)) {
					rank = Rank.STRAIGHT_FLUSH;
				}
			} else {
				if(straight(values)) {
					rank = Rank.STRAIGHT;
				}	
			}
		}
		return rank;
	}
	
	private static boolean checkSuit(List<Card> cards) {
		List<String> suit = new ArrayList<String>();
		for(int it=0; it<cards.size(); it++) {
     		suit.add(cards.get(it).getSuit());   	
		}
		
		if(Suit.findSuit(suit)) {
			return true;
		}
		
		return false;
    }
    
    private static List<Integer> changeToListOfOccurs(List<Result> result) {
    	List<Integer> occurs = new ArrayList<Integer>();
    	for (Result r : result) {
			occurs.add(r.getOccurs());
		}
		return occurs;
    }
    
    private static List<Integer> changeToListOfValues(List<Card> cards) {
    	List<Integer> values= new ArrayList<Integer>();
    	for (Card c : cards) {
			values.add(c.getValue());
		}
		return values;
    }
    
	private static boolean straight(List<Integer> values){
		for (int it=0; it<values.size()-1; it++) {
		    if(values.get(it) != values.get(it+1)+1) {
		    	return false;
		    }
		}		
		return true;
	}
    
	/*private boolean royalFlush(List<Integer> values){
		List<Integer> royalFlush = Arrays.asList(14,13,12,11,10);
		
		if(values.equals(royalFlush)) {
			return true;
		}
		
		return false;
	}*/
	
}
