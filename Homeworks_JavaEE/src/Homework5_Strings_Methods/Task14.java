package Homework5_Strings_Methods;

public class Task14 {
	static int fact(int n){
		if(n==1 || n==0){
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
