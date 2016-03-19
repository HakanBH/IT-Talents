package Homework4_2DArrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr2d = new int[5][6];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int row = 0; row<arr2d.length; row++){
			for(int col=0; col<arr2d[row].length; col++){
				arr2d[row][col] = in.nextInt();
			}
		}
		for(int row=0; row<arr2d.length ;row++){
			for(int col=0; col<arr2d[row].length; col++){
				if(arr2d[row][col] > max){
					max = arr2d[row][col];
				}
				if(arr2d[row][col] < min){
					min = arr2d[row][col];
				}
			}
		}
		System.out.println("Smallest: " + min);
		System.out.println("Largest: " + max);
	}
}
	
