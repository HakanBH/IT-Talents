package Homework3_Arrays;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number you want to convert to binary: ");
		int num = in.nextInt();
		int rem;
		int[] binary = new int[32];
		int index = 31;
		while(num!=0){
			rem=num%2;
			num/=2;
			binary[index]=rem;					//записваме остатъците в обратен ред в масива;
			index--;								
		}
		for(int i=index+1;i<32;i++)
		{
			System.out.print(binary[i]);
		}
	}
}
