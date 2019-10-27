package lt.prava;

import java.io.IOException;

public class ExceptionExercise {

	public static void main(String[] args) {
		exception();
	}

	private static void exception() {
		try {
			try {
				throw new Exception("1");
			} finally {
				if (true) {
					throw new Exception("2");
				}
				System.err.println("3");
			}
		} catch (IOException e) {
			System.err.println("4");
		} catch (Exception e) {
			System.err.println("5");
		} finally {
			System.out.println("6");
		}
	}

}
