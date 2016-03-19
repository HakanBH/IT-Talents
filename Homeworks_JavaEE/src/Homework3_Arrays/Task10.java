package Homework3_Arrays;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array elements (7 numbers)");
		int[] arr = new int[7];
		int sum = 0;
		for(int i=0;i<arr.length; i++){
			arr[i] = in.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum: " + sum);
		double avarage = (double)sum/7;
		System.out.println("Avarage: " + avarage);
		
		double minDiff = Math.abs(arr[0] - avarage);
		int closestToAvarage = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(Math.abs(arr[i] - avarage) < minDiff){
				minDiff = Math.abs(arr[i] - avarage);
				closestToAvarage = arr[i];
			}
		}
		System.out.println("Closest to avarage: " + closestToAvarage);
	}
}
