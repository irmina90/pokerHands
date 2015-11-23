package pokerHands.pokerHands;
import java.io.IOException;
import pokerHands.pokerHands.service.PokerHands;
import pokerHands.pokerHands.storage.FileReader;
import pokerHands.pokerHands.ui.View;

public class Play {
	
	public static void main(String [] args) throws IOException	{
		String path = "C:/Users/wzietek/workspace/pokerHands/src/main/java/pokerHands/pokerHands/storage/poker.txt";
		FileReader file = new FileReader(path);
		file.readCardsFromFile();

		View view = new View();
		PokerHands poker = new PokerHands();
		view.startTheGame();
		view.showTheNumberOfWins(poker.getWinsOfPlayerOne(file));
	}
}
