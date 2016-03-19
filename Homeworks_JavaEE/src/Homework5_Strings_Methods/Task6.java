package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = in.nextLine();
 		String newSentence = new String();
 		String word = new String();
 		int wordIndex = 0;
 		
 		for(int index = 0;index<sentence.length();index++){
 			if(sentence.charAt(index) == ' ' || index == sentence.length()-1){
 				word = sentence.substring(wordIndex, index+1);
 				word = (char)(word.charAt(0)-32) + word.substring(1);
 				newSentence += word;
 				wordIndex = index+1;
 			}
 		}
		System.out.println(newSentence);
	}

}
