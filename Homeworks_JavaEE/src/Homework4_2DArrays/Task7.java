package Homework4_2DArrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[6][6];
		System.out.println("Enter matrix(6x6) elements: ");
		for(int row = 0; row<matrix.length; row++){
			for(int col=0; col<matrix[row].length; col++){
				matrix[row][col]=in.nextInt();
			}
		}
		int sum=0;;
		int sumAllRows = 0;
		for(int i=0;i<matrix.length;i++){
			if(i<2){
				sum = matrix[i][i] + matrix[i][i+2] + matrix[i][i+4];
			}
			if(i>=2 && i<4){
				sum = matrix[i][i-2] + matrix[i][i] + matrix[i][i+2];
			}
			if(i>=4){
				sum = matrix[i][i-4] + matrix[i][i-2] + matrix[i][i];
			}
			System.out.println("Sum of row " + (i+1) + ": " + sum);
			sumAllRows+=sum;
		}
		System.out.println("Sum of all rows: " + sumAllRows);
	}

}
