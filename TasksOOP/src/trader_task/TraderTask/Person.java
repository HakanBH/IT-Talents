package TraderTask;

public abstract class Person {
	private String name;
	private String address;
	
	Person(String name){
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}
	}
}
