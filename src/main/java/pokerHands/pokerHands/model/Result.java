package pokerHands.pokerHands.model;

public class Result implements Comparable<Result>{
	private int cardNumber;
	private int occurs;
	
	public Result(int cardNumber, int occurs){
		this.cardNumber = cardNumber;
		this.occurs = occurs;
	}
	
	public int getCardNumber(){
		return cardNumber;
	}
	
	public int getOccurs(){
		return occurs;
	}
	
	public int compareTo(Result compareResult) {
		int compareOccurs = ((Result) compareResult).getOccurs();
		return compareOccurs - this.occurs;
	}
}
