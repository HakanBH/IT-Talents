package RestourantTask;
import java.time.LocalDateTime; 
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Cook extends Person implements Runnable{
	private Integer experience;
	public Map<LocalDateTime, Product> orders;
	public List<Product> readyMeals;
	
	public Cook(String name, Double money, Integer experience) {
		super(name, money);
		setExperience(experience);
		orders = new TreeMap<LocalDateTime, Product>();
	}
	
	@Override
	public void run() {
		while(true){
			while(orders.isEmpty()){
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			//идва поръчка.
			for(Entry<LocalDateTime, Product> prod : orders.entrySet()){
				try {
					Thread.sleep(prod.getValue().timeToMake()*getCookingSpeed());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
				readyMeals.add(prod.getValue());
				orders.remove(prod.getKey(), prod.getValue());
				
				synchronized(readyMeals){
					readyMeals.notifyAll();
				}
			}
		}
	}
	
	public Cook(String name, Integer exp){
		this(name, Math.random()*100, exp);
	}
	
	public Integer getExperience(){
		return experience;
	}
	
	public void setExperience(Integer experience) {
		if(experience>0){
			this.experience = experience;
		}
	}
	
	public int getCookingSpeed(){
		if(experience>5){
			return 1;
		}
		return  2 - experience/5;
	}
}
