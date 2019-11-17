package lt.prava.structural.adapterTry;

import java.util.ArrayList;

public class JavaApplication {
	private ArrayList<People> peoples = new ArrayList<People>();

	public void savePeople(People people) {
		this.peoples.add(people);
		System.out.println("Adding " + people.getName() + " to a list.");
	}

	public void readPeople() {
		System.out.println(this.peoples);
	}

	public void updatePeople(String name, People people) {
		for (int i = 0; i < peoples.size(); i++) {

		}
	}

	public void deletePeople() {
		System.out.println("Deleting people...");
	}

}
