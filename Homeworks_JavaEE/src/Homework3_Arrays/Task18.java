package Homework3_Arrays;
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the arrays:");
		int size = in.nextInt();
		System.out.println("Enter array A elements: ");
		int[] a = new int[size];
		for(int i=0;i<size;i++){
			a[i] = in.nextInt();
		}
		System.out.println("Enter array B elements: ");
		int[] b = new int[size];
		for(int i=0;i<size;i++){
			b[i] = in.nextInt();
		}
		int[] c = new int[size];
		for(int i=0;i<size;i++){
			if(a[i]>=b[i]){
				c[i]=a[i];
			}
			else{
				c[i]=b[i];
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		for(int i=0;i<size;i++){
			System.out.print(b[i] + " ");
		}		
		System.out.println("");
		for(int i=0;i<size;i++){
			System.out.print(c[i] + " ");
		}
	}
}
