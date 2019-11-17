package lt.prava.creational.builder;

public class Contact {
	private String name;
	private String surname;
	private String email;
	private String phone;
	private String address;

	public Contact(String name, String surname, String email, String phone, String address) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
