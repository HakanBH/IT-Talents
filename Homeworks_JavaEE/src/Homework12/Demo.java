package Homework12;

public class Demo {
	public static void main(String[] args){
		Shop shop = new Shop();
		InstrumentSupplier supplier = new InstrumentSupplier(shop);
		shop.setSupplier(supplier);
		new Thread(supplier).start();
		
		Client c = new Client(shop);
		c.buyInstrument("kitara", 5);
		c.buyInstrument("kitara", 5);
		c.buyInstrument("kitara", 2);
		c.buyInstrument("kitara", 2);
		c.buyInstrument("piano", 5);
		c.buyInstrument("gaida", 1);
		
		for(Instrument instr : shop.getSoldItemsSorted()){
			System.out.println(instr);
		}
		
//		Изкарва актуална информация за продуктите в магазина		
//		shop.catalogue();
	
//		Изкарва информация за продадените продукти
//		shop.soldItemsInfo();
	}
}
