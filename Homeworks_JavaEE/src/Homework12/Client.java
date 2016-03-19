
package Homework12;


public class Client {
	private Shop shop;

	public Client(Shop shop) {
		if (shop != null) {
			this.shop = shop;
		}
	}
	
	void buyInstrument(String name, int quantity) {
		shop.sellInstrument(name, quantity);
	}
}