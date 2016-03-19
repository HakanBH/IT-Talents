package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String name1 = input.substring(0,input.indexOf(","));
		String name2 = input.substring(input.indexOf(",")+2);
		int sumName1=0;
		int sumName2=0;
		for(int i=0;i<name1.length();i++){
			if(Character.isLetter(name1.charAt(i))){						//за да не пресмята интервалите 					
				sumName1 += (int)(name1.charAt(i));
			}
		}
		for(int i=0; i<name2.length();i++){
			if(Character.isLetter(name2.charAt(i))){
				sumName2 += (int)(name2.charAt(i));
			}
		}
		if(sumName1==sumName2){
			System.out.println("Sum of ASCII codes of the 2 names is equal");
		}
		else{
			if(sumName1 > sumName2){
				System.out.println(name1);
			}
			else{
				System.out.println(name2);
			}	
		}	
	}
}
