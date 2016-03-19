package simpleTasks_Arrays;
import java.util.Scanner;

// Напишете програма, която сортира (подрежда елементите във	възходящ ред) масив, съдържащ само 0 и 1.	

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr = new int[size];
		for(int index = 0; index<size; index++){
			arr[index] = in.nextInt();
		}
		for(int i=0; i<size-1; i++){
			for(int j=i; j<size; j++){
				if(arr[j] < arr[i]){
					arr[j] += arr[i];
					arr[i] = arr[j] - arr[i];
					arr[j] -= arr[i];
				}
			}
		}
		for(int index=0; index<size; index++){
			System.out.print(arr[index] + " ");
		}
	}
}
