package _4_lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaLambdaExpressions {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Katy");
		names.add("Teddy");
		names.add("Richard");

		names.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(names);

		names.sort((o1, o2) -> {
			if (o1.length() < o2.length())
				return 1;
			else if (o1.length() > o2.length())
				return -1;
			else
				return 0;
		});
		System.out.println(names);
	}

}
