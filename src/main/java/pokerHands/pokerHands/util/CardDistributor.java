package pokerHands.pokerHands.util;

import java.util.List;

import pokerHands.pokerHands.model.Card;
import pokerHands.pokerHands.model.Player;
import pokerHands.pokerHands.storage.FileReader;
import pokerHands.pokerHands.util.Parser;

public class CardDistributor {
	
	public static int giveCards(FileReader reader, Player first, Player second){
		int numberOfPlays = reader.getNumberOfLines();
		
		for(int line=0; line<numberOfPlays; line++) {
			List<String[]> tokens = reader.getOneLineCards(line);
			addParsedCardsToPlayerAsOneHand(first, Parser.parseListOfCards(tokens.get(0)));
			addParsedCardsToPlayerAsOneHand(second, Parser.parseListOfCards(tokens.get(1)));
		}
		return numberOfPlays;
	}
	
	private static void addParsedCardsToPlayerAsOneHand(Player player, List<Card> parseListOfCards) {
		player.addCardsInOneHandToTheList(parseListOfCards);
	}
}
