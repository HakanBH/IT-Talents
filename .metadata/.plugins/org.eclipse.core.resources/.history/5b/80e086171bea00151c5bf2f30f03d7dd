package mobile.model;

public class Motorcycle extends MotorVehicle {
	
	private int cubage;
	private int engineTacts;
	private String coolingType;

	public Motorcycle(String cond, String brand, String model, String currency, String color, int price,
			String engine, String gearbox, String category, int mileage, int power, int year, String month,
			int cubage, int tacts, String cooling)
	{
		super(cond, brand, model, currency, color, price, engine, gearbox, category, mileage, power, year, month);
		setCubage(cubage);
		setEngineTacts(tacts);
		setCoolingType(cooling);
	}

	public int getCubage() {
		return cubage;
	}
	
	public int getEngineTacts(){
		return engineTacts;
	}
	
	public String coolingType(){
		return coolingType;
	}
	
	public void setCubage(int cubage) {
		if (cubage > 0) {
			this.cubage = cubage;
		}
	}
	
	public void setEngineTacts(int engineTacts) {
		if (engineTacts > 0) {
			this.engineTacts = engineTacts;
		}
	}
	
	public void setCoolingType(String cooling) {
		if(cooling!=null && !cooling.isEmpty()){
			this.coolingType= cooling;
		}
	}
		
	
}
