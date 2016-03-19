package Homework_Warehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Client implements Runnable {
	private static final int TIME_TO_BUY_PRODUCT = 5000;
	public static final int MAX_PRODUCTS_TO_BUY = 4;
	private Shop shop;

	private ArrayList<String> products = new ArrayList<String>(
			Arrays.asList("potato", "eggplant", "cucumber", "pork", "beef", "chicken", "banana", "orange", "apple"));

	public Client(Shop shop) {
		setShop(shop);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(TIME_TO_BUY_PRODUCT);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			Random r = new Random();
			String randomProduct = products.get(r.nextInt(products.size()));
			Integer randomQuantity = r.nextInt(MAX_PRODUCTS_TO_BUY) + 1;
			
			System.out.println("Client wants to buy " + randomQuantity + " " + randomProduct + "s");

			while (shop.getProductQuantity(randomProduct) < randomQuantity) {
				try {
					synchronized (this) {
						System.out.println("Client is waiting for " + randomProduct);
						this.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			shop.sellProduct(randomProduct, randomQuantity);
			
			System.out.println("Client bought " + randomQuantity + " " + randomProduct + "s");
		}
	}

	public void setShop(Shop shop) {
		if (shop != null) {
			this.shop = shop;
		}
	}
}
