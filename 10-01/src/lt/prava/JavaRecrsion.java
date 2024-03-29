package lt.prava;

public class JavaRecrsion {

	public static void main(String[] args) {
//		makeSimpleRecursion(5);
		makeDifficultRecursion(5);
	}

	private static void makeSimpleRecursion(int number) {
		number--;
		System.out.println("Easy method start section; number = " + number);
		if (number != 0) {
			makeSimpleRecursion(number);
		}
	}

	private static void makeDifficultRecursion(int number) {
		System.out.println("Easy method start section; number = " + number);
		makeRecursion(number);
	}

	private static void makeRecursion(int number) {
		number--;
		System.out.println("Hard method start section; number = " + number);
		if (number != 0) {
			makeRecursion(number); // !!!
			makeDifficultRecursion(number); // !!!
		}
	}

}
