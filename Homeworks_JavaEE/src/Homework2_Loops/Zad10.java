package Homework2_Loops;
import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����");
		int num = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<num; i++){
			if(num%i==0){
				isPrime = false;
			}
		}
		if (!isPrime || num == 1)
			System.out.println("������� �� � ������");
		else
			System.out.println("������� � ������");
	}
}
