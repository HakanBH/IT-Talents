package exceptions;

import java.io.IOException;
import java.util.Arrays;

public class Demo{ 
	static void printArray(int[] arr) throws ArrayIndexOutOfBoundsException{
		System.out.println("Before error");
		System.out.println(arr[4]);
		System.out.println("This will not be printed");
	}

	static void doSmth(int[] arr){
		System.out.println("Before 2");
		try {
			printArray(arr);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Exception cought in 2nd method");
		}
		System.out.println("After 2");
	}
	
	public static void doOtherThing(){
		try {
			int[] 	arr = {1,2,3,3};
			doSmth(arr);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Exception caught!");
		}
		System.out.println("After catch");
	}
	
	
	
	public static void main(String[] args){
		doOtherThing();
		
//		Grizach misho = new Grizach(3, 6.4, "Misho");
//		try{
//			misho.izqjSirene(null, 0);
//
//		}
//		catch(NullPointerException a){
//			System.out.println(a.getMessage());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}
}
