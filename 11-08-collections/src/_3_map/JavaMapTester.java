package _3_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMapTester {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();

		fillMap(hashMap);
		fillMap(linkedHashMap);
		fillMap(treeMap);

		System.out.println(hashMap);
		System.out.println(linkedHashMap);
		System.out.println(treeMap);
	}

	private static void fillMap(Map<Integer, String> map) {
		map.put(1, "cat");
		map.put(5, "dog");
		map.put(3, "bird");
		map.put(15, "frog");
	}

}
