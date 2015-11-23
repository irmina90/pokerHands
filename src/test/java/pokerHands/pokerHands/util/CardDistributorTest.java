package pokerHands.pokerHands.util;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import pokerHands.pokerHands.model.Player;
import pokerHands.pokerHands.storage.FileReader;


public class CardDistributorTest {

	@Test
	public void shouldReturnOneThusendNumberOfPlays() throws FileNotFoundException {
		//given
		String filePath = "C:/Users/wzietek/workspace/pokerHands/src/main/java/pokerHands/pokerHands/storage/poker.txt";
		FileReader fileReader = new FileReader(filePath);
		fileReader.readCardsFromFile();
		//when		
		int numberOfPlays = CardDistributor.giveCards(fileReader, new Player(), new Player());
		//then
		assertEquals(1000, numberOfPlays);
	}
	
}
