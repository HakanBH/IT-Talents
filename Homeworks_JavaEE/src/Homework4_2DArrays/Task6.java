package Homework4_2DArrays;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[6][6];
		for(int row = 0; row<matrix.length; row++){
			for(int col=0; col<matrix[row].length; col++){
				matrix[row][col]=in.nextInt();
			}
		}
		int sum=0;
		int sumOfEvenRows = 0;
		for(int row = 0; row<matrix.length; row++){
			if((row+1)%2==0){
				for(int col=0; col<matrix[row].length; col++){
					sum+=matrix[row][col];
				}
				System.out.println("Sum of row " + (row+1) + ": " + sum);
			}
			sumOfEvenRows += sum;
			sum = 0;
		}
		System.out.println("Sum of even rows: " + sumOfEvenRows);
	}

}
