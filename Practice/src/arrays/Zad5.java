package arrays;
import java.util.Scanner;

// По дадена матрица от цели числа, изведете числото, което се среща най-често. 
// Ако има повече от едно такова – изведете първото срещнато.

public class Zad5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter matrix scale (rows and columns): ");
		int rows = in.nextInt();
		int columns = in.nextInt();
		int matrix[][] = new int[rows][columns];
		int arr[] = new int[rows*columns];
		
		System.out.println("Enter matrix: ");
		int k = 0;
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				matrix[i][j] = in.nextInt();
				arr[k] = matrix[i][j];
				k++;
			}
		}
		
		int count = 1;
		int maxCount = 1;
		int current = 0;
		int mostCommon = 0;
		for(int i=0; i<rows*columns; i++)
		{
			count = 1;
			current = arr[i];
			for(int j = i; j<rows*columns; j++){
				if(arr[j] == current){
					count++;
				}
			}
			if(count>maxCount){
				maxCount=count;
				mostCommon = current;
			}
		}
		System.out.println("Most common element is " + mostCommon);
	}
}
