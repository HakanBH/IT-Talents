package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next("[a-zA-Z0-9]+?");
		String str2 = in.next("[a-zA-Z0-9]+");
		if((str1.length() + str2.length() <= 20) && (str1.length() + str2.length() >= 10) ){
			String tempStr = str1.substring(0,5);
			str1 = str2.substring(0,5) + str1.substring(5);
			str2 = tempStr + str2.substring(5);
			System.out.println(str1.length()>str2.length()?str1.length():str2.length());
			System.out.println(str1 + " " + str2);
		}
	}
}
