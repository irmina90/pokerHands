package pokerHands.pokerHands.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

	@Test
	public void shouldReturnValueFromCard() {
		//given
		Card card = new Card(6,"H");
		//when		
		//then
		assertEquals(6, card.getValue());
	}
	
	@Test
	public void shouldReturnSuitFromCard() {
		//given
		Card card = new Card(6,"H");
		//when		
		//then
		assertEquals("H", card.getSuit());
	}
	
	@Test
	public void shouldReturnDiffBeetweenTwoCards() {
		//given
		Card cardOne = new Card(6,"H");
		Card cardTwo = new Card(10,"H");
		//when		
		//then
		assertEquals(4, cardOne.compareTo(cardTwo));
	}
}
