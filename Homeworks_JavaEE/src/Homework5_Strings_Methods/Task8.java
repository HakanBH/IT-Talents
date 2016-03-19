package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sequence of symbols: ");
		String word = in.next();
		boolean isPalyndrome = true;
		System.out.println(word.length()/2);
		for(int index=0; index<word.length()/2; index++){
			if(word.charAt(index) != word.charAt(word.length()-index-1)){
				isPalyndrome = false;
				break;
			}
		}
		if(isPalyndrome){
			System.out.println("The word is a palyndrome.");
		}
		else{
			System.out.println("The word is not a palyndrome.");
		}
	}
}
