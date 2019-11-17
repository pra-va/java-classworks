package lt.prava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaArrayList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Tomas");
		names.add("Katy");
		names.add("Teddy");
		names.add(1, "New");
		System.out.println(names);
		names.add("Katinas");
		System.out.println(names);
		names.add(3, "Katinas");
		System.out.println(names);
		System.out.println(names.indexOf("Katinas"));
		System.out.println(names.size());
		names.set(0, "Katinas");
		System.out.println(names);

		ArrayList<People> peoples = new ArrayList<People>();
		peoples.add(new People("Tomas", 30));
		peoples.add(new People("Teddy", 15));
		System.out.println(peoples);

		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(12);

	}

}
