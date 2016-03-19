package mobile.model;

public class Truck extends MotorVehicle {
	private int numberOfSeats;
	private int numberOfAxels;
	private int loadCapacity;
	
	public Truck(String cond, String brand, String model, String currency, String color, int price, String engine,
			String gearbox, String category, int mileage, int power, int year, String month,
			int seats, int axels, Integer load) {
		super(cond, brand, model, currency, color, price, engine, gearbox, category, mileage, power, year, month);

		setNumberOfSeats(seats);
		setNumberOfAxels(axels);
		setLoadCapacity(load);
	}

	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public int getNumberOfAxels() {
		return numberOfAxels;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		if (numberOfSeats > 0) {
			this.numberOfSeats = numberOfSeats;
		}
	}
	
	public void setNumberOfAxels(int numberOfAxels) {
		if (numberOfAxels > 0) {
			this.numberOfAxels = numberOfAxels;
		}
	}
	
	public void setLoadCapacity(int loadCapacity) {
		if (loadCapacity > 0) {
			this.loadCapacity = loadCapacity;
		}
	}
}
