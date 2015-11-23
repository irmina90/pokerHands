package pokerHands.pokerHands.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pokerHands.pokerHands.model.Card;


public class ParserTest {
	
	@Test
	public void shouldChangeCardAsToFourteen() {
		//given
		List<Card> result = new ArrayList<Card>();
		String[] tokens = {"AH"};
		//when		
		result = Parser.parseListOfCards(tokens);
		//then
		assertEquals(14, result.get(0).getValue());
	}
	
	@Test
	public void shouldChangeCardKingToThirteen() {
		//given
		List<Card> result = new ArrayList<Card>();
		String[] tokens = {"KH"};
		//when		
		result = Parser.parseListOfCards(tokens);
		//then
		assertEquals(13, result.get(0).getValue());
	}
	
	@Test
	public void shouldChangeCardQueenToTwelve() {
		//given
		List<Card> result = new ArrayList<Card>();
		String[] tokens = {"QH"};
		//when		
		result = Parser.parseListOfCards(tokens);
		//then
		assertEquals(12, result.get(0).getValue());
	}
	
	@Test
	public void shouldChangeCardJackToEleven() {
		//given
		List<Card> result = new ArrayList<Card>();
		String[] tokens = {"JH"};
		//when		
		result = Parser.parseListOfCards(tokens);
		//then
		assertEquals(11, result.get(0).getValue());
	}
	
	@Test
	public void shouldChangeCardTenToNumberTen() {
		//given
		List<Card> result = new ArrayList<Card>();
		String[] tokens = {"TH"};
		//when		
		result = Parser.parseListOfCards(tokens);
		//then
		assertEquals(10, result.get(0).getValue());
	}


}
