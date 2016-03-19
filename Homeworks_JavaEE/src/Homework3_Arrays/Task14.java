package Homework3_Arrays;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
	 	double[] arr = new double[size];
	 	for(int i =0;i<size;i++){
	 		arr[i] = in.nextDouble();
	 	}
	 	for(int i=0; i<size; i++){
	 		if(arr[i]>-3.0 && arr[i]<3.0){
	 			System.out.print(arr[i] + " ");
	 		}
	 	}
	}
}
