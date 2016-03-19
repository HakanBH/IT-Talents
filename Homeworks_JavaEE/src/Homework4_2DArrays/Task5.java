package Homework4_2DArrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int rows = in.nextInt();
		int cols = in.nextInt();
		System.out.println("Enter matrix elements: ");
		int matrix[][] = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		int maxSumRows=0;
		int maxSumCols=0;
		int sumRow=0;
		int sumCol=0;
		for(int row=0; row<rows; row++){
			for(int col=0; col<cols; col++){
				sumRow+=matrix[row][col];
				sumCol+=matrix[col][row];
			}
			if(sumCol>maxSumCols){
				maxSumCols=sumCol;
			}
			if(sumRow>maxSumRows){
				maxSumRows=sumRow;
			}
			sumRow=0;
			sumCol=0;
		}
		System.out.println("Largest sum by rows: " + maxSumRows);
		System.out.println("Largest sum by columns: " + maxSumCols);
		if(maxSumRows>maxSumCols){
			System.out.println("Largest sum by rows is > than largest sum by columns. ");
		}
		else{
			System.out.println("Largest sum by columns is > than largest sum by rows. ");
		}
	}
}
