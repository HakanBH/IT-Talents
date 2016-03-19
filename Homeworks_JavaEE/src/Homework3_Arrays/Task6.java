package Homework3_Arrays;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array A size:");
		int sizeOfA = in.nextInt();
		System.out.println("Enter array A elements: ");
		int[] a = new int[sizeOfA];
		for(int i=0;i<sizeOfA;i++){
			a[i] = in.nextInt();
		}
		
		System.out.println("Enter array B size:");
		int sizeOfB = in.nextInt();
		System.out.println("Enter array B elements: ");
		int[] b = new int[sizeOfB];
		for(int i=0;i<sizeOfB;i++){
			b[i] = in.nextInt();
		}
		boolean isEqual = true;
		if(sizeOfA != sizeOfB){
			isEqual = false;
		}
		else{
			for(int i=0;i<sizeOfA; i++){
				if(a[i] != b[i]){
					isEqual = false;
				}
			}
		}
		if(isEqual){
			System.out.println("Array A and B are equal.");
		}
		else{
			System.out.println("Arrays A and B are different.");
		}
	}
}
