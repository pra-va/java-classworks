package lt.prava;

public class People implements Info {
	private String name;
	private int age;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void getInfo() {
		System.out.println("Name: " + this.name + ", ID: " + this.age);
	}
}
