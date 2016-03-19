package arrays;
import java.util.Scanner;

//По дадени два масива да се провери дали първият, обърнат наобратно, е равен с втория.
public class Zad2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of the first array: ");
		int arr1Size = in.nextInt();
		int arr1[] = new int[arr1Size];
		System.out.println("Enter values for first array: ");
		for(int i=0;i<arr1Size; i++){
			arr1[i] = in.nextInt();
		}
		System.out.println("Enter size of the second array: ");
		int arr2Size = in.nextInt();
		int arr2[] = new int[arr2Size];
		System.out.println("Enter values for second array: ");
		for(int i=0; i<arr2Size; i++){
			arr2[i] = in.nextInt();
		}
		if(arr1Size != arr2Size){
			System.out.println("Array 1 in reversed order is different from array 2.");
			return;
		}
		else{
			for(int i=0;i<=arr1Size;i++){
				if(i==arr1Size){
					System.out.println("Array 1 is reversed order is equal to array 2.");
					break;
				}
				if(arr1[i]!=arr2[arr1Size-i-1]){
					System.out.println("Array 1 in reversed order is different from array 2.");
					break;
				}
			}
		}
		
		
		
	}

}
