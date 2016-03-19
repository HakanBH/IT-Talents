package Homework5_Strings_Methods;
import java.util.Arrays;

public class Task12 {
 	static int[] intArray(int n){
 		int[] array = new int[n];
 		for(int index=0; index<n; index++){
 			array[index] = index+1;
 		}
 		return array;
 	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intArray(5)));
	}

}
