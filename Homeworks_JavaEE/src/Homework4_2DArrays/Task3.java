package Homework4_2DArrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int rows = in.nextInt();
		int cols = in.nextInt();
		int[][] matrix = new int[rows][cols];
		for(int row = 0; row<rows; row++){
			for(int col=0;col<cols; col++){
				matrix[row][col] = in.nextInt();
			}
		}
		int sum = 0;
		for(int row = 0; row<rows; row++){
			for(int col=0; col<cols; col++){
				sum+=matrix[row][col];
			}
		}
		System.out.println("Sum: " + sum);
		double avarage = (double)(sum)/(rows*cols);
		System.out.println("Avarage: " + avarage);
	}
}
