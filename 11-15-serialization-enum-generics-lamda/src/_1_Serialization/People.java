package _1_Serialization;

import java.io.Serializable;

public class People implements Serializable {
	private static final long serialVersionUID = -1379876998622124955L;
	private int id;
	private String name;
	private String surname;
	private int age;
//	private transient String name;

	public People(int id, String name, String surname, int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
	}

}
