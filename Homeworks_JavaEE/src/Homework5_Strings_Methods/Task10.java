package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String newString = new String();
		for(int index=0; index<str.length(); index++){
			newString += (char)(str.charAt(index) + 5);
		}
		System.out.println(newString);
	}
}
