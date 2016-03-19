package RestourantTask;

public class Table {
	private boolean isOccupied;
	private int numberOfSeats;
	
	Table(){
		numberOfSeats = (int) (Math.random()*5 + 1);
	}
	
	public void setIsOccupied(boolean b){
		isOccupied = b;
	}
	
	public boolean isOccupied(){
		return isOccupied;
	}
}
