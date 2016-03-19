package PostOffice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Postman extends Citizen {
	private static final int MAX_MAILS = 50;
	private static final int MIN_EXPERIENCE = 5;
	private int experience = MIN_EXPERIENCE;
	private int numberOfMailsDelivered;

	public Postman(String firstName, String lastName, String address, PostOffice post) throws Exception {
		super(firstName, lastName, address, post);
	}

	@Override
	public void run() {
		while (true) {
			synchronized (getPostOffice()) {
				while (getPostOffice().getNumberOfMails() <= MAX_MAILS) {
					try {
						System.out.println("Postman is waiting mails number to reach " + MAX_MAILS);
						getPostOffice().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			// starts distributing;
			List<MailObject> toDistribute = getPostOffice().takeMails();
			for (MailObject mail : toDistribute) {
				try {
					Thread.sleep(mail.getDeliveryTime());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Delivered: " + mail);
				numberOfMailsDelivered++;
			}
			toDistribute.clear();
			System.out.println("Delivered all of my mails! ");

			synchronized (getPostOffice()) {
				getPostOffice().notifyAll();
			}
		}
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int e) {
		if (e > MIN_EXPERIENCE) {
			this.experience = e;
		}
	}

	public int getNumberOfMailsDeliverd() {
		return numberOfMailsDelivered;
	}
}
