package pokerHands.pokerHands.service;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import pokerHands.pokerHands.storage.FileReader;

public class PokerHandsTest {

	@Test
	public void shouldReturnThreeHundredSeventySixWins() throws FileNotFoundException {
		//given
		String filePath = "C:/Users/wzietek/workspace/pokerHands/src/main/java/pokerHands/pokerHands/storage/poker.txt";
		FileReader fileReader = new FileReader(filePath);
		fileReader.readCardsFromFile();
		PokerHands poker = new PokerHands();
		//when
		int amountOfWinsPlayerOne = poker.getWinsOfPlayerOne(fileReader);
		//then
		assertEquals(376, amountOfWinsPlayerOne);
	}

}
