package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word sequence: ");
		String str = in.nextLine();
		int wordCount = 0;
		int maxWordLength = 0;
		int wordLength = 0;
		for(int index = 0; index<str.length();index++){
			if(Character.isLetter(str.charAt(index))){
				wordCount++;
				while(index < str.length() && str.charAt(index)!=' '){
					wordLength++;
					index++;
				}
				if( wordLength > maxWordLength){
					maxWordLength = wordLength;
				}
				wordLength = 0;
			}
		}
		System.out.println("Words: " + wordCount);
		System.out.println("Longest word: " + maxWordLength);
	}

}
