package Homework11.LetterCount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class LetterCount {
	static public LinkedHashMap<Integer,Integer> sortMapByValues(HashMap<Integer,Integer> passedMap) {
		   List<Integer> mapKeys = new ArrayList<Integer>(passedMap.keySet());
		   List<Integer> mapValues = new ArrayList<Integer>(passedMap.values());
		   Collections.sort(mapValues,Collections.reverseOrder());
		   Collections.sort(mapKeys, Collections.reverseOrder());

		   LinkedHashMap<Integer,Integer> sortedMap = new LinkedHashMap<Integer,Integer>();

		   Iterator<Integer> valueIt = mapValues.iterator();
		   
		   while (valueIt.hasNext()) {
		       Integer val = valueIt.next();
		       Iterator<Integer> keyIt = mapKeys.iterator();

		       while (keyIt.hasNext()) {
		           Integer key = keyIt.next();
		           String comp1 = passedMap.get(key).toString();
		           String comp2 = val.toString();

		           if (comp1.equals(comp2)){
		               passedMap.remove(key);
		               mapKeys.remove(key);
		               sortedMap.put(key, val);
		               break;
		           }
		       }
		   }
		   return sortedMap;
	}

	static void letterCount(String text){
		int numberOfLetters = 0;
		text = text.toLowerCase().replaceAll("\\s+","");		
		HashMap<Integer, Integer> letters= new HashMap<Integer,Integer>();
// първия Integer е буквата, а втория е броя на срещанията му
		
		for(int i=0;i<text.length();i++){
			int c = (char)(text.charAt(i));	
			if(c>='a' && c<='z'){
				numberOfLetters++;
				if(letters.containsKey(c)){
					letters.put(c, (letters.get(c)+1));
				}
				else{
					letters.put(c, 1);	
				}
			}
		}

		LinkedHashMap<Integer,Integer> sorted = sortMapByValues(letters);
		
		System.out.println("Number of letters: " + numberOfLetters);
		for(Integer key: sorted.keySet()){
			int x = key;
			int percentege = (sorted.get(key)*100)/numberOfLetters;
			System.out.print((char)(x) + ": " + sorted.get(key) + " ");
			for(int i=0; i<percentege;i++){
				System.out.print("#");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {		
		System.out.println("Please enter some text(enter 'exit' "
				+ "\nif you want to terminate the input):");
		Scanner in = new Scanner(System.in);
	
		StringBuilder text = new StringBuilder();
		
		while(in.hasNextLine()){
			String line = in.nextLine();
			if(line.equals("exit")){
				break;
			}
			text.append(line);
			text.append("\n");
		}
		letterCount(text.toString());
	}
}
