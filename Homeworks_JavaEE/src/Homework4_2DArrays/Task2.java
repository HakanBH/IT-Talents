package Homework4_2DArrays;
import java.util.Scanner;

public class Task2 {

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
		for(int row = 0; row<rows; row++){
			for(int col=0;col<cols; col++){
				if(row==col){
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
		System.out.println("");
		for(int row = 0; row<rows; row++){
			for(int col=0;col<cols; col++){
				if(row+col == rows-1){
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
	}

}
