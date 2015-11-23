package pokerHands.pokerHands.model;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PlayerTest {
	private List<Card> listOfCards = Arrays.asList(
			new Card(5,"H"),
			new Card(2,"C"),
			new Card(13,"H"),
			new Card(5,"S"),
			new Card(10,"H"));

	@Test
	public void shouldReturnRightCards() {
		//given
		Player player = new Player();
		//when
		player.addCardsInOneHandToTheList(listOfCards);
		//then
		assertEquals(5, player.getCardsFromOneRound(0).get(0).getValue());
		assertEquals(2, player.getCardsFromOneRound(0).get(1).getValue());
		assertEquals(13, player.getCardsFromOneRound(0).get(2).getValue());
		assertEquals(5, player.getCardsFromOneRound(0).get(3).getValue());
		assertEquals(10, player.getCardsFromOneRound(0).get(4).getValue());
	}

	@Test
	public void shouldReturnResultsValueOfCards() {
		//given
		Player player = new Player();
		player.addCardsInOneHandToTheList(listOfCards);
		//when
		List<Result> listOfResults = player.getCardsResultFromOneRound(0);
		//then
		assertEquals(5, listOfResults.get(0).getCardNumber());
		assertEquals(13, listOfResults.get(1).getCardNumber());
		assertEquals(10, listOfResults.get(2).getCardNumber());
		assertEquals(2, listOfResults.get(3).getCardNumber());
	}
	
	@Test
	public void shouldReturnOccursOfCards() {
		//given
		Player player = new Player();
		player.addCardsInOneHandToTheList(listOfCards);
		//when
		List<Result> listOfResults = player.getCardsResultFromOneRound(0);
		//then
		assertEquals(2,listOfResults.get(0).getOccurs());
		assertEquals(1,listOfResults.get(1).getOccurs());
		assertEquals(1,listOfResults.get(2).getOccurs());
		assertEquals(1,listOfResults.get(3).getOccurs());
	}
	
	@Test
	public void shouldReturnTrueIfTheFirstPlayerWon() {
		//given
		Player playerOne = new Player();
		Player playerTwo = new Player();
		List<Card> listOfCardsPlayerTwo = Arrays.asList(
				new Card(4,"H"),
				new Card(2,"C"),
				new Card(12,"H"),
				new Card(4,"S"),
				new Card(10,"H"));
		//when
		playerOne.addCardsInOneHandToTheList(listOfCards);
		playerTwo.addCardsInOneHandToTheList(listOfCardsPlayerTwo);
		boolean ifPlayerOneWon = playerOne.compareRoundToOtherRound(playerTwo, 0);
		//then
		assertEquals(true,ifPlayerOneWon);
	}
}
