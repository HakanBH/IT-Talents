package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 strings (letters only).");
		String str1 = in.next();
		String str2 = in.next();
		if(str1.length() + str2.length() <= 40){
			if(str1.matches("[a-zA-Z]+") && str2.matches("[a-zA-Z]+")){
				System.out.println("Upper case: ");
				System.out.println(str1.toUpperCase() + " " + str2.toUpperCase());
				System.out.println("Lower case: ");
				System.out.println(str1.toLowerCase() + " " + str2.toLowerCase());
			}
			else{
				System.out.println("Error! Strings must contain letters only.");
			}
		}
		else{
			System.out.println("Error! Strings length must be less than 40.");
		}
	}
}
