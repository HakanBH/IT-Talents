package Homework2_Loops;
import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число");
		int num = sc.nextInt();
		int count = 1;
		while(count <= 10)
		{
			if(num%2==0 || num%3==0 || num%5==0){
				System.out.println(count + ":" + num);
				count++;
				num++;
			}
			else{
				num++;
			}
		}
	}
}
