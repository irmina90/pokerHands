package pokerHands.pokerHands.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

	private String path;
	private List<List<String[]>> data = new ArrayList<List<String[]>>();
	private int numberOfLines = 0;
	
	public FileReader(String path) throws FileNotFoundException {
		this.path = path;
	}
	
	private List<String[]> convertStringToArraysOfCards(Scanner in) {
		List<String[]> returnValue = new ArrayList<String[]>();
		String[] split = in.nextLine().split(" ");
		String[] valuesA = new String [5], valuesB = new String [5];
		
        for(int it=0; it<split.length; it++)  {
    	   if(it < 5)  {
    		   valuesA[it] = split[it];   
    	   } else {
    		   valuesB[it-5] = split[it];
    	   }
        }
        
        returnValue.add(valuesA);
        returnValue.add(valuesB);
       
		return returnValue;		
	}
	
	public void readCardsFromFile() throws FileNotFoundException {
		File file = new File(this.path);
		Scanner in = new Scanner(file);

		while (in.hasNextLine()) {
			numberOfLines++;
			List<String[]> tokens = convertStringToArraysOfCards(in);
			data.add(tokens);
		}
		in.close();	
	}
	
	public List<String[]> getOneLineCards(int noOfLine){
		return data.get(noOfLine);
	}
	
	public int getNumberOfLines(){
		return numberOfLines;
	}
}
