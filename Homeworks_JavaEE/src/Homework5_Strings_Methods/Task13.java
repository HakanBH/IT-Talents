package Homework5_Strings_Methods;
import java.util.Arrays;

public class Task13 {
	static int[] concat(int[] arr1, int[] arr2){
		int[] array = new int[arr1.length + arr2.length];
		if(arr1.length == 0){
			return arr2;
		}
		if(arr2.length == 0){
			return arr1;
		}
		for(int index=0;index<arr1.length; index++){
			array[index] = arr1[index];
		}
		for(int index=0; index<arr1.length;index++){
			array[index+arr1.length] = arr2[index];
		}
		return array;
	}
	public static void main(String[] args) {
		int[] a = {1,3,6,7};
		int[] b = {6,2,3,54};
		System.out.println(Arrays.toString(concat(a,b)));
	}

}
