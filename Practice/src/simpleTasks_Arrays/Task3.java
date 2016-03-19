package simpleTasks_Arrays;
import java.util.Scanner;

// Напишете програма, която за даден масив от символи arr и символ ch, въведен от потребителя, проверява али arr съдържа ch.
// Ако се съдържа, отпечатайте индекса на елемента. Ако не, отпечатайте подходящо избрана от вас стойност.

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = in.nextInt();
		System.out.println("Enter array elements: ");
		char[] arr = new char[size];
		for(int index = 0; index<size; index++){
			arr[index] = in.next().charAt(0);
		}
		System.out.println("Enter symbol you want to search for: ");
		char ch = in.next().charAt(0);
		for(int index=0; index<size; index++){
			if(arr[index]==ch){
				System.out.println("Symbol '" + ch + "' found at position " + (index+1));
				break;
			}
			if(index == size-1){
				System.out.println("Symbol " + ch + " not found.");
			}
		}
	}

}
