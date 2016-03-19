package CourtTask;

public abstract class Person{
	private String name;
	
	Person(String name){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
}
