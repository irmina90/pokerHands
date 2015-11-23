package pokerHands.pokerHands.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultTest {

	public void shouldReturnResult() {
		//given
		Result result= new Result(6,1);
		//when		
		//then
		assertEquals(6, result.getCardNumber());
		assertEquals(1, result.getOccurs());
	}
	
	@Test
	public void shouldReturnDiffBeetweenTwoOccurs() {
		//given
		Result resultOne = new Result(6,1);
		Result resultTwo = new Result(10,2);
		//when		
		//then
		assertEquals(1, resultOne.compareTo(resultTwo));
	}

}
