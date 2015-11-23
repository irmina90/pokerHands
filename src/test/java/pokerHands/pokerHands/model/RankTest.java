package pokerHands.pokerHands.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RankTest {

	@Test
	public void shouldReturnSevenPoints() {
		//given
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4,1));
		//when
		Rank result = Rank.findRankNumberByList(list);
		//then
		assertEquals(7, result.getRank());
	}
	
	@Test(expected= NullPointerException.class) 
	public void shouldThrowNullPointerException() {
		//given
		List<Integer> list = new ArrayList<Integer>();
		//when
		Rank result = Rank.findRankNumberByList(list);
		//then
		assertEquals(null, result);
	}

}
