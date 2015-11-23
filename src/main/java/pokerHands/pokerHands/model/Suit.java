package pokerHands.pokerHands.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Suit {
	CLUBS(new ArrayList<String>(Arrays.asList("C","C","C","C","C"))),
	SPADES(new ArrayList<String>(Arrays.asList("S","S","S","S","S"))),
	HEARTS(new ArrayList<String>(Arrays.asList("H","H","H","H","H"))),
	DIAMONS(new ArrayList<String>(Arrays.asList("D","D","D","D","D")));
	
	private List<String> list;
	
	private Suit(List<String> list) {
		this.list = list;
	}
	
	public List<String> getSuit(){
		return this.list;
	}
	
	public static boolean findSuit(List<String> list)
	{
	    for(Suit s : Suit.values()){
	        if(s.getSuit().equals(list)) 
	        	return true;
	    }
	    return false;
	}
}
