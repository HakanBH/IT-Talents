package Homework3_Arrays;
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		System.out.println("Enter array size: ");						// предполага се, че са въведени поне 3 различни числа
		int size = in.nextInt();
		double[] arr = new double[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i] = in.nextDouble();
		}
		double temp;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(Math.abs(arr[j])> Math.abs(arr[i])){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		int count=0;													//брои колко различни числа са изведени до момента
		for(int i=1;i<size;i++){
			if((Math.abs(arr[i-1])!= Math.abs(arr[i])) || (i == size-1)){
				System.out.print(arr[i-1] + " ");
				count++;
			}
			if(count==3){
				break;
			}
		}
	}
}
