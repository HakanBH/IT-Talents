import java.io.IOException;

public class House extends Mouse {

	@Override
	public void print() throws NullPointerException{
		System.out.println("In child class.");
	}

	public static void main(String[] args) {
		Mouse m = new Mouse();
		System.out.println(m.house);

	}
}
