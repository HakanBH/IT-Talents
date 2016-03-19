package arrays;
import java.util.Scanner;

//По даден масив със 15 символа, променливи от тип char, да се провери дали някой от тези символи е малка латинска буква.

public class Zad4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char arr[] = new char[15];
		System.out.println("Enter 15 symbols: ");
		for(int i=0;i<15;i++){
			arr[i] = in.next().charAt(0);
		}
		for(int i=0;i<15;i++){
			if(arr[i] >= 'a' && arr[i] <= 'z'){
				System.out.println("Array contains a small latin letter: " + arr[i] );
				break;
			}
			if(i==14){
				System.out.println("Array doesn't contain a small latin letter");
			}
		}
	}
}
