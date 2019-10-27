package lt.prava;

import java.util.Scanner;

public class ExceptionTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			String number = input.nextLine(); // String, bet negauname.
			if (number.equals("asd")) {
				try {
					throw new MyStringException("Your text is wrong.... :(");
				} catch (Exception e) {
					System.out.println("Bottom");
				}
			}
		}
	}
}
