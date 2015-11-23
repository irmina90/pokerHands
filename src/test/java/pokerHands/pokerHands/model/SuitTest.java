package pokerHands.pokerHands.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SuitTest {

	@Test
	public void shouldReturnTrueIfTheListHaveTheSameSuit() {
		//given
		List<String> list = new ArrayList<String>(Arrays.asList("D","D","D","D","D"));
		//when
		boolean result = Suit.findSuit(list);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnFalseIfTheListDoesntHaveTheSameSuit() {
		//given
		List<String> list = new ArrayList<String>(Arrays.asList("D","S","D","S","D"));
		//when
		boolean result = Suit.findSuit(list);
		//then
		assertEquals(false, result);
	}

}
