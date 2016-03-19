package PostOffice;

import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class Citizen implements Runnable {
	private static final int TIME_TO_SEND_MAIL = 1000;
	private String firstName;
	private String lastName;
	private String address;
	private PostOffice postOffice;
	
	private AtomicBoolean flag = new AtomicBoolean(true);
	
	public void setFlag(boolean flag) {
		this.flag.set(flag);
	}
	
	public Citizen(String firstName, String lastName, String address, PostOffice post) throws Exception {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setPostOffice(post);
	}

	public void run() {
		while (flag.get()) {
			try {
				Thread.sleep(TIME_TO_SEND_MAIL);
				sendRandomMail(new Citizen("Deniz", "Hyuseinov", "ul. gen. Kiril Botev 1", getPostOffice()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void sendRandomMail(Citizen receiver) {
		if (Math.random() > 0.5) {
			// send letter
			Letter letter = new Letter(this, receiver);
			if (Math.random() > 0.5) {
				// send it to post office
				postOffice.addMail(letter);
				System.out.println(this.getFirstName() + " sent a letter. ");
			} else {
				// put it in random mailbox
				Random r = new Random();
				List<Mailbox> mailboxes = postOffice.getMailboxes();
				mailboxes.get(r.nextInt(mailboxes.size())).addLetter(letter);
				System.out.println(this.getFirstName() + " put a letter in a mailbox.");
			}
		} else {
			// send package
			Package p = new Package(this, receiver);
			postOffice.addMail(p);
			System.out.println(this.getFirstName() + " sent a " + p.getType());
		}
		synchronized(getPostOffice()){
			getPostOffice().notifyAll();
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public PostOffice getPostOffice() {
		return postOffice;
	}

	public void setFirstName(String firstName) throws Exception {
		if (firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		} else {
			throw new Exception("Invalid value for first name!");
		}
	}

	public void setLastName(String lastName) throws Exception {
		if (lastName != null && !lastName.isEmpty()) {
			this.lastName = lastName;
		} else {
			throw new Exception("Invalid value for last name!");
		}
	}

	public void setAddress(String address) throws Exception {
		if (address != null && !address.isEmpty()) {
			this.address = address;
		} else {
			throw new Exception("This is not a valid address!");
		}

	}

	public void setPostOffice(PostOffice postOffice) throws Exception {
		if (postOffice != null) {
			this.postOffice = postOffice;
		} else {
			throw new Exception("Invalid value for post office!");
		}
	}

	@Override
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName + ", Address: " + this.address;
	}
}
