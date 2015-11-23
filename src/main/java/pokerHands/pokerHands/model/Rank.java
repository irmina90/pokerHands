package pokerHands.pokerHands.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Rank {	
	PAIR(1,new ArrayList<Integer>(Arrays.asList(2,1,1,1))),
	TWO_PAIR(2,new ArrayList<Integer>(Arrays.asList(2,2,1))),
	THREE_OF_A_KIND(3,new ArrayList<Integer>(Arrays.asList(3,1,1))),
	FULL_HOUSE(6,new ArrayList<Integer>(Arrays.asList(3,2))),
	FOUR_OF_A_KIND(7,new ArrayList<Integer>(Arrays.asList(4,1))),
	HIGH_CARD(0),
	STRAIGHT(4),
	FLUSH(5),
	STRAIGHT_FLUSH(8);
	
	private int rank;
	private List<Integer> list;
	
	private Rank(int rank) {
		this.rank = rank;
	}
	
	private Rank(int rank, List<Integer> list) {
		this.rank = rank;
		this.list = list;
	}
	
	public static Rank findRankNumberByList(List<Integer> list) {
	    for(Rank r : Rank.values()){
	        if(r.getList().equals(list)) 
	        	return r;
	    }
	    return null;
	}
	
	public int getRank(){
		return this.rank;
	}
	
	public List<Integer> getList(){
		return this.list;
	}

}
