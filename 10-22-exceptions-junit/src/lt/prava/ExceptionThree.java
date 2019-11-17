package lt.prava;

import java.io.File;

public class ExceptionThree {
	public static void main(String[] args) {
		// 1. Checked exceptions (Compiler) - klaidos, kurias turime tikrint ir
		// apdoroti.
		// 2. Unchecked exceptions (Runtime)

		File file = new File("test.txt");
//	Scanner scanner = new Scanner(file); // 1
//		int number = 10 / 0; // 2
//		divideNumbers(10, 0);
		String name = null;
		System.out.println(name.length());
	}

	public static void divideNumbers(int number1, int number2) {
		if (number2 == 0) {
			throw new ArithmeticException("Number is zero");
		}
	}
}
