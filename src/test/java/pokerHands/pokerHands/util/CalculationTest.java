package pokerHands.pokerHands.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import pokerHands.pokerHands.model.Card;
import pokerHands.pokerHands.model.Result;


public class CalculationTest {

	@Test
	public void shouldReturnOccursFromAllValuesOfCards() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(5,"C"), new Card(7,"H"), new Card(5,"S"), new Card(14,"S"));
		//when		
		List<Result> listOfResults = Calculation.checkCardsOccurs(listOfCards);
		//then
		assertEquals(3, listOfResults.get(0).getOccurs());
		assertEquals(1, listOfResults.get(1).getOccurs());
		assertEquals(1, listOfResults.get(2).getOccurs());
	}
	
	@Test
	public void shouldReturnValuesFromAllCards() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(5,"C"), new Card(7,"H"), new Card(5,"S"), new Card(14,"S"));
		//when		
		List<Result> listOfResults = Calculation.checkCardsOccurs(listOfCards);
		//then
		assertEquals(5, listOfResults.get(0).getCardNumber());
		assertEquals(14, listOfResults.get(1).getCardNumber());
		assertEquals(7, listOfResults.get(2).getCardNumber());
	}
	
	@Test
	public void shouldReturnFourAndOneOccurs() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(10,"H"), new Card(10,"C"), new Card(10,"D"), new Card(10,"S"), new Card(14,"S"));
		//when		
		List<Result> listOfResults = Calculation.checkCardsOccurs(listOfCards);
		//then
		assertEquals(4, listOfResults.get(0).getOccurs());
		assertEquals(1, listOfResults.get(1).getOccurs());
	}
	
	@Test
	public void shouldReturnDoubleValuesAndOneOccurs() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(10,"H"), new Card(10,"C"), new Card(11,"D"), new Card(11,"S"), new Card(14,"S"));
		//when		
		List<Result> listOfResults = Calculation.checkCardsOccurs(listOfCards);
		//then
		assertEquals(2, listOfResults.get(0).getOccurs());
		assertEquals(2, listOfResults.get(1).getOccurs());
		assertEquals(1, listOfResults.get(2).getOccurs());
	}

}
