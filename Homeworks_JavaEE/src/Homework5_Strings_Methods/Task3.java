package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		int minLen = (str1.length()<str2.length())?str1.length():str2.length();
		if(str1.length()==str2.length()){
			System.out.println("The two strings have equal lengths.");
		}
		else{
			if(str1.length()>str2.length()){
				System.out.println("String 1 is longer than string 2");
			}
			else{
				System.out.println("String 2 is longer than string 1.");
			}
		}
		System.out.println("The strings differ at positions: ");				
		for(int index=0; index<minLen; index++){
			if(str1.charAt(index) != str2.charAt(index)){
				System.out.println("Pos "+ (index+1) + ": " + str1.charAt(index)+ " - " + str2.charAt(index));
			}
		}
	}

}
