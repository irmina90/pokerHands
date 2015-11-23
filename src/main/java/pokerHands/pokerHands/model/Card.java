package pokerHands.pokerHands.model;

public class Card implements Comparable<Card> {
	private int value;  
	private String suit;  
	
	public Card(int value, String suit){
		this.value = value;
		this.suit = suit;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public void setSuit(String suit){
		this.suit = suit;
	}
	
	public int getValue(){
		return value;
	}
	
	public String getSuit(){
		return suit;
	}

	public int compareTo(Card anotherCard) {
		int compareCard = ((Card) anotherCard).getValue();
		return compareCard - this.value;
    }
}
