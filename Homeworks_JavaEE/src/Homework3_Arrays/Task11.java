package Homework3_Arrays;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array elements (7 numbers): ");
		int[] arr = new int[7];
		for(int i=0;i<arr.length;i++){
			arr[i] = in.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0 && arr[i] > 5){
				System.out.println(arr[i]+ " ");
			}
		}
	}

}
