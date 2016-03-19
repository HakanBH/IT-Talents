package Homework3_Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = in.nextInt();
		int[] arr = new int[10];
		arr[0] = arr[1] = num;
		for(int i=2; i<arr.length; i++){
			arr[i]=arr[i-1] + arr[i-2];
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
