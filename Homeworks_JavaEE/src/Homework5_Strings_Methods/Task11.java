package Homework5_Strings_Methods;

public class Task11 {
	static void printArray(int[] arr){
		for(int index = 0; index<arr.length; index++){
			System.out.print(arr[index] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {6,37,6,4,2,5,7,3,2};
		printArray(arr);
	}

}
