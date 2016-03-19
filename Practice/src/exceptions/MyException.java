package exceptions;

public class MyException extends Exception {
	private static final long serialVersionUID = 620676343787817836L;
	
	public MyException() {
		super();
	}
	
	MyException(String msg){
		super(msg);
	}
	
	MyException(Throwable x){
		super(x);
	}
	
	MyException(String msg, Throwable x){
		super(msg,x);
	}
}
