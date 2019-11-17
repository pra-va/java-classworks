package lt.prava.creational.builder.builderGood;

public class Contact {
	private String name;
	private String surname;
	private String email;
	private String phone;
	private String address;

	public Contact(ContactBuilder contactBuilder) {
		this.name = contactBuilder.getName();
		this.surname = contactBuilder.getSurname();
		this.email = contactBuilder.getEmail();
		this.phone = contactBuilder.getPhone();
		this.address = contactBuilder.getAddress();
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}

}
