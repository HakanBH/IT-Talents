package Homework5_Strings_Methods;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int num = 0;
		int sum = 0;
		boolean flag = false;
		for(int index=0; index<str.length(); index++){
			while(index<str.length() && Character.isDigit(str.charAt(index))){
				if(index>0 && str.charAt(index-1) == '-'){
					flag = true;
				}
				num*=10;
				num += ((int)(str.charAt(index)) - (int)('0'));
				index++;
			}
			if(flag){
				num*=(-1);
			}
			sum+=num;
			flag = false;
			num=0;
		}
		System.out.println("Sum = " + sum);
	}
}

