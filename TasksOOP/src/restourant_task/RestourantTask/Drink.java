package RestourantTask;

public class Drink extends Product{

	public Drink(String name, Double price) {
		super(name, price);
	}

	@Override
	public Integer timeToMake() {
		return 0;
	}

}
