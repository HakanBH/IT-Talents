package Homework4_2DArrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int rows = in.nextInt();
		int cols = in.nextInt();
		System.out.println("Enter matrix elements: ");
		int matrix[][] = new int[rows][cols];
		for(int row=0; row<rows; row++){
			for(int col=0; col<cols; col++){
				matrix[row][col] = in.nextInt();
			}
		}
		for(int col=0; col<cols; col++){
			for(int row=rows-1; row>=0; row--){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println("");
		}
	}

}
