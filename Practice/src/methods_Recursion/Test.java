package methods_Recursion;

public class Test {

	static void isCube(int num){
		for(int i=1;i<=num;i++){
			if(Math.pow(i,3) == num){
				System.out.println(num + " is cube of " + i);
				return;
			}
			if(i>=num/2){
				System.out.println(num + " is not a cube.");
				return;
			}
		}
	}
	static int pow(int x,int y){
		if(y==0){
			return 1;
		}
		if(y==1){
			return x;
		}
		int sum=0;
		for(int i= 0; i<x; i++){
			sum += pow(x,y-1);
		}
		return sum;
	}
	static void f(String str){
		int maxWordLen = Integer.MIN_VALUE;
		int wordLen = 0;
		int wordCount = 0;
		for(int i=0;i<str.length();i++){
			wordLen = 0;
			while(str.charAt(i) != ' ' && i<str.length()-1){
				wordLen++;
				i++;
			}
			if(wordLen>maxWordLen){
				maxWordLen=wordLen;
			}
			wordCount++;
		}
		for(int i=0; i<maxWordLen+2; i++){
			System.out.print("*");
		}
		System.out.println("");
		for(int i=0; i<str.length(); i++){
			wordLen=0;
			System.out.print("*");
			while(i<str.length() && str.charAt(i)!=' '){
				wordLen++;
				System.out.print(str.charAt(i));
				i++;
			}
			for(int j=0;j<maxWordLen-wordLen;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
		for(int j=0;j<maxWordLen+2; j++){
			System.out.print("*");
		}
	}
	static int fibNumbers(int n){
		if(n==1) return 0;
		if(n==2) return 1;
		return fibNumbers(n-1) + fibNumbers(n-2);
	}
	public static void main(String[] args) {
		//isCube(1);
		//System.out.println(pow(5,0));
		
		//String str = "Hello World in a frame";
		//f(str);
		int n = 10;
		int sum = 0;
		for(int i = 1; i<n; i++){
			int fib = fibNumbers(i);
			if(fib < n ){
				System.out.print(fib + "  ");
				sum += fib;
			}
			else{
				break;
			}
		}
		System.out.println("Sum: " + (sum-1));
	}
}
