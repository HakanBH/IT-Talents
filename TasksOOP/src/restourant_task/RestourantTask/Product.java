package RestourantTask;

public abstract class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		setName(name);
		setPrice(price);
	}

	public abstract Integer timeToMake();

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public void setPrice(Double price) {
		if (price > 0) {
			this.price = price;
		}
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Price: " + price; 
	}
}
