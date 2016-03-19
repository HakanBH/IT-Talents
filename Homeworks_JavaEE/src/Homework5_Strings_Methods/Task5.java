package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 words.");
		String word1 = in.next();
		String word2 = in.next();
		int word1Index = -1;
		int word2Index = 0;
		label:			
		for(int i=0;i<word1.length();i++){
			for(int j=0;j<word2.length();j++){
				if(word1.charAt(i)==word2.charAt(j)){
					word1Index=i;
					word2Index = j;
					break label;
				}
			}
		}
		
		if(word1Index == -1){
			System.out.println("No matching letters.");
		}
		else{
			for(int i=0;i<word2.length();i++){
				if(i==word2Index){
					System.out.println(word1);
				}
				else{
					for(int j=0;j<word1Index; j++){
						System.out.print(" ");
					}
					System.out.println(word2.charAt(i));
				}
			}
		}
	}
}
