package mobile.model;

public class User {
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String region;

	public User(String email, String pass, String firstName, String lastName, String region){
		setEmail(email);
		setFirstName(firstName);
		setLastName(lastName);
		setPassword(pass);
		setRegion(region);
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getRegion() {
		return region;
	}

	public void setEmail(String email) {
		if(email!=null && !email.isEmpty()){
			this.email = email;
		}
	}

	public void setPassword(String password) {
		if(password!=null && !email.isEmpty()){
			this.password = password;
		}
	}

	public void setFirstName(String firstName) {
		if(firstName!=null && !firstName.isEmpty()){
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if(lastName!=null && !lastName.isEmpty()){
			this.lastName = lastName;
		}
	}
	public void setRegion(String region) {
		if(region!=null && !region.isEmpty()){
			this.region = region;	
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Email: " + email);
		builder.append("\nPassword: " + password);
		builder.append("\nFirst Name: " + firstName);
		builder.append("\nLast Name: " + lastName);
		builder.append("\nRegion: " + region);
		return builder.toString();	
	}

}
