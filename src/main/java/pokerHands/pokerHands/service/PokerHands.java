package pokerHands.pokerHands.service;

import pokerHands.pokerHands.model.Player;
import pokerHands.pokerHands.model.Rank;
import pokerHands.pokerHands.storage.FileReader;
import pokerHands.pokerHands.util.CardDistributor;

public class PokerHands {
	
	public int getWinsOfPlayerOne(FileReader data){
		Player playerOne = new Player();
		Player playerTwo = new Player();
		int amountOfWins = 0;
		int numberOfPlays = CardDistributor.giveCards(data,playerOne,playerTwo);
		
		for(int round=0; round<numberOfPlays; round++) {
			Rank left = playerOne.getRankFromOneRound(round);
			Rank right = playerTwo.getRankFromOneRound(round);
			
			if(left.getRank() > right.getRank()) {
				amountOfWins++;
			} else if (left.getRank() == right.getRank()) {
				if(playerOne.compareRoundToOtherRound(playerTwo, round)){
					amountOfWins++;
				}
			}		
		}
		
		return amountOfWins;
	}
	
}