package pokerHands.pokerHands.model;

import java.util.ArrayList;
import java.util.List;

import pokerHands.pokerHands.util.Calculation;
import pokerHands.pokerHands.util.Hand;

public class Player {
	private List<List<Card>> allCards = new ArrayList<List<Card>>();
    
    public void addCardsInOneHandToTheList(List<Card> cardsInOneHand){
		this.allCards.add(cardsInOneHand);
    }
    
	public List<Card> getCardsFromOneRound(int round){
		return this.allCards.get(round);
	}
	
    public List<Result> getCardsResultFromOneRound(int round) {
    	return Calculation.checkCardsOccurs(this.allCards.get(round));
    }
    
	public boolean compareRoundToOtherRound(Player anotherPlayer, int round) {
		List<Result> listOfResultsPlayerOne = this.getCardsResultFromOneRound(round);
		List<Result> listOfResultsPlayerTwo = anotherPlayer.getCardsResultFromOneRound(round);
		
		for(int it=0; it<listOfResultsPlayerOne.size(); it++) {
			if(listOfResultsPlayerOne.get(it).getCardNumber() != listOfResultsPlayerTwo.get(it).getCardNumber()) {
				return listOfResultsPlayerOne.get(it).getCardNumber() > listOfResultsPlayerTwo.get(it).getCardNumber();	
			}
		}
		return false;
	}
	
	public Rank getRankFromOneRound(int round){
		return Hand.checkHand(getCardsFromOneRound(round),getCardsResultFromOneRound(round));
	}
	
}
