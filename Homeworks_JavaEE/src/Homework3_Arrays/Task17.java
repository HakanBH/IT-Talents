package Homework3_Arrays;
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
	 	double[] arr = new double[size];
	 	for(int i =0;i<size;i++){
	 		arr[i] = in.nextDouble();
	 	}
	 	boolean isZigZag=true;
	 	for(int i=1;i<size-1;i++){
	 		if(!((arr[i]>arr[i-1] && arr[i]>arr[i+1]) || (arr[i]<arr[i-1] && arr[i]<arr[i+1]))){
	 			isZigZag=false;
	 			break;
	 		}
	 	}
	 	System.out.println(isZigZag && arr[0]<arr[1]);
	}
}
