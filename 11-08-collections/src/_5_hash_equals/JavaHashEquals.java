package _5_hash_equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHashEquals {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		Set<Integer> set = new HashSet<>();

		map.put(1, "Tomas");
		map.put(1, "Tomas");
//		map.put(2, "Tadas");

		set.add(1);
		set.add(1);
//		set.add(2);

//		System.out.println(map);
//		System.out.println(set);

		Map<Human, Integer> mapObjects = new HashMap<>();
		Set<Human> setObjects = new HashSet<Human>();

		Human one = new Human(1, "Tomas");
		Human two = new Human(1, "Tomas");

		mapObjects.put(one, 1);
		mapObjects.put(two, 1);

		setObjects.add(one);
		setObjects.add(two);

		System.out.println(mapObjects);
		System.out.println(setObjects);
	}

}
