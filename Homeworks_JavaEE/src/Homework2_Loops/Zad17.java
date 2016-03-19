package Homework2_Loops;
import java.util.Scanner;

public class Zad17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина и символ");
		int length = sc.nextInt();
		char c = sc.next().charAt(0);
		
		for(int i=1;i<=length;i++){
			if(i==1 || i == length){
				for(int j=1; j<=length; j++){
					System.out.print("*");
				}
			}
			else{
				System.out.print("*");
				for(int j=1;j<=length-2;j++){
					System.out.print(c);
				}
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
