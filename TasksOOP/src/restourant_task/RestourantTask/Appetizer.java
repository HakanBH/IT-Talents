package RestourantTask;

public class Appetizer extends Product{
	private static final int TIME_TO_MAKE = 200;

	public Appetizer(String name, Double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer timeToMake() {
		return TIME_TO_MAKE;
	}

}
