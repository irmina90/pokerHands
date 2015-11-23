package pokerHands.pokerHands.storage;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class FileReaderTest {

	@Test
	public void shouldReturnAllCardsFromOneLineFromFile() throws FileNotFoundException {
		//given
		String filePath = "C:/Users/wzietek/workspace/pokerHands/src/main/java/pokerHands/pokerHands/storage/poker.txt";
		FileReader fileReader = new FileReader(filePath);
		fileReader.readCardsFromFile();
		String[] tokensOne = {"8C","TS","KC","9H","4S"};
		String[] tokensTwo = {"7D","2S","5D","3S","AC"};
		//when
		List<String[]> lineOfCards = fileReader.getOneLineCards(0);
		//then
		for(int it=0; it<5; it++) {
			assertEquals(tokensOne[it], lineOfCards.get(0)[it]);
			assertEquals(tokensTwo[it], lineOfCards.get(1)[it]);
		}
	}
	
}
