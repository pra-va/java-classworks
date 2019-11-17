package _3_map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Timi");
		map.put(3, "Kate");
		map.put(2, "Tadas");
		System.out.println(map);
		map.put(2, "Toams");
		System.out.println(map);

		Map<String, String> otherMap = new HashMap<String, String>();
		otherMap.put("Color", "Red");
		otherMap.put("ColorOne", "Red");
		otherMap.put("OtherColor", "Green");
		System.out.println(otherMap);

		for (Map.Entry<String, String> entry : otherMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
