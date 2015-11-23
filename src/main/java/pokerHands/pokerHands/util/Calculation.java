package pokerHands.pokerHands.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pokerHands.pokerHands.model.Card;
import pokerHands.pokerHands.model.Result;


public class Calculation {
	
 	public static List<Result> checkCardsOccurs(List<Card> cards){
		int occurs = 0;
		List<Result> resultList = new ArrayList<Result>();
		Collections.sort(cards);
		
		for(int it=0; it<cards.size(); it++) {
			occurs = valueOccurs(cards,cards.get(it).getValue());
			if(!containsCardInResult(resultList, cards.get(it).getValue())) {
				resultList.add(new Result(cards.get(it).getValue(),occurs));	
			}
		}		
		
		Collections.sort(resultList);
		return resultList;
	}
	
    private static int valueOccurs(List<Card> values, int val) {
        int count = 0;
        for(int it = 0; it<values.size(); it++) {
          if (values.get(it).getValue() == val) {
            count++;
          }
        }
        return count;
      }
    
    private static boolean containsCardInResult(List<Result> resultList, int cardNumber){
    	 for(Result o : resultList) {
    	        if(o.getCardNumber() == cardNumber) {
    	                return true;
    	            }
    	 }
    	 return false;
    } 
    
}
	
	