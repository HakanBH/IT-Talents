package Homework3_Arrays;
import java.util.Scanner;

public class Task16 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array elements(10 numbers of type double): ");
		float[] arr = new float[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = in.nextFloat();
		}

		for(int i=0;i<arr.length;i++){
				System.out.print(arr[i] + " ");
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<-0.231){
				arr[i]=(i+1)*(i+1)+41.25f;
			}
			else{
				arr[i]*=(i+1);
			}
		}
		System.out.println("");
		int sum=0,count=0;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
			if(arr[i]!=0){
				sum+=arr[i];
				count++;
			}
		}
		System.out.println("\nAvarage of elements different from 0: " + ((float)sum/count));
	}
}
