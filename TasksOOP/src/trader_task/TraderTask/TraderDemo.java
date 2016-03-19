package TraderTask;

import java.util.Random;

public class TraderDemo {
	
	public static void main(String[] args) {
	
		Random r = new Random();
		Provider[] providers = new Provider[10];
		for(int i=0; i<10; i++){
			int rand = r.nextInt(1);
			if(rand==0){
				providers[i] = new Supplier("Provider "+i);
			}
			else{
				providers[i] = new Retailer("Provider " + i);
			} 
		}
		
		TradeSite[] sites = new TradeSite[20];
		for(int i=0; i<20; i++){
			int rand = r.nextInt(2);
			if(rand==0){
				sites[i] = new Stand();
			}
			if(rand==1){
				sites[i] = new Pavilion();
			} 
			if(rand==2){
				sites[i] = new MallShop();
			}
		}
	}
}
