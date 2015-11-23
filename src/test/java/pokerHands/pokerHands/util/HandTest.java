package pokerHands.pokerHands.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import pokerHands.pokerHands.model.Card;
import pokerHands.pokerHands.model.Rank;
import pokerHands.pokerHands.model.Result;

public class HandTest {
	
	@Test
	public void shouldReturnRankThree() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(5,"C"), new Card(7,"H"), new Card(5,"S"), new Card(14,"S"));
		List<Result> listOfResults = Arrays.asList(new Result(5,3), new Result(14,1), new Result(7,1));
		//when
		Rank result = Hand.checkHand(listOfCards, listOfResults);
		//then
		assertEquals(3, result.getRank());
	}
	
	@Test
	public void shouldReturnRankSeven() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(5,"C"), new Card(5,"D"), new Card(5,"S"), new Card(14,"S"));
		List<Result> listOfResults = Arrays.asList(new Result(5,4), new Result(14,1));
		//when
		Rank result = Hand.checkHand(listOfCards, listOfResults);
		//then
		assertEquals(7, result.getRank());
	}
	
	@Test
	public void shouldReturnRankSix() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(5,"C"), new Card(7,"H"), new Card(5,"S"), new Card(7,"S"));
		List<Result> listOfResults = Arrays.asList(new Result(5,3), new Result(7,2));
		//when
		Rank result = Hand.checkHand(listOfCards, listOfResults);
		//then
		assertEquals(6, result.getRank());
	}
	
	@Test
	public void shouldReturnRankTwo() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(5,"C"), new Card(7,"H"), new Card(7,"S"), new Card(14,"S"));
		List<Result> listOfResults = Arrays.asList(new Result(5,2), new Result(7,2), new Result(14,1));
		//when
		Rank result = Hand.checkHand(listOfCards, listOfResults);
		//then
		assertEquals(2, result.getRank());
	}
	
	@Test
	public void shouldReturnRankOne() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(5,"C"), new Card(7,"H"), new Card(9,"S"), new Card(14,"S"));
		List<Result> listOfResults = Arrays.asList(new Result(5,2), new Result(14,1), new Result(9,1), new Result(7,1));
		//when
		Rank result = Hand.checkHand(listOfCards, listOfResults);
		//then
		assertEquals(1, result.getRank());
	}
	
	@Test
	public void shouldReturnRankNull() {
		//given
		List<Card> listOfCards = Arrays.asList(new Card(5,"H"), new Card(6,"C"), new Card(7,"H"), new Card(2,"S"), new Card(14,"S"));
		List<Result> listOfResults = Arrays.asList(new Result(14,1), new Result(7,1), new Result(6,1), new Result(5,1), new Result(2,1));
		//when
		Rank result = Hand.checkHand(listOfCards, listOfResults);
		//then
		assertEquals(0, result.getRank());
	}

}
