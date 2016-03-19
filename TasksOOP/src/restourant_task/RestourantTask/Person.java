package RestourantTask;

public class Person {
	private String name;
	private Double money;
	
	public Person(String name, Double money){
		setName(name);
		setMoney(money);
	}
	
	public String getName() {
		return name;
	}
	
	public Double getMoney() {
		return money;
	}
	
	public void setMoney(Double money) {
		if(money>0){
			this.money = money;
		}
	}
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
	}
	
	public void changeBalance(Double sum){
		money+=sum;
	}
}
