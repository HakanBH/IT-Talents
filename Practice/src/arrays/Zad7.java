package arrays;
import java.util.Scanner;

// Имате предварително въведени стойности на елементи в двумерен масив от естествени числа. Да се състави програма, чрез която се
// извеждат стойностите на елементите в двумерен масив след обръщането му на +90 градуса.
// Example: 	1 2 3 4				13 9 5 1
// 				5 6 7 8	     ->		14 10 6 2 
// 				9 10 11 12			15 11 7 3 
// 				13 14 15 16			16 12 8 4 

public class Zad7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int row = in.nextInt();
		int column = in.nextInt();
		System.out.println("Enter matrix elements: ");
		int matrix[][] = new int[row][column];
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		for(int i=0; i<column; i++){
			for(int j=row-1; j>=0; j--){
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println("");
		}
	}
}
