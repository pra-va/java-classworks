package lt.prava;

import java.util.Scanner;

public class ExceptionsFive {

	public static void main(String[] args) {
		String text = "Java ...";
		getStringSize(null);
	}

	private static int getStringSize(String text) {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		scanner.hasNext();
		try {
			System.out.println("Try block.");
			return text.length();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Catch bock.");
//			System.exit(-1);
			return -1;
		} finally {
			System.out.println("Finally block.");

			return 0;
		}
	}

}
