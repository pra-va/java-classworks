package lt.prava;

public class JavaSwapingNumber {

	public static void main(String[] args) {
		// int a = 10; int b = 20;
//		numberChangerOne(10, 20);
//		numberChangerTwo(5, 10);
//		numberChangerThree(12, 5);
		numberChangerFour(12, 5);
	}

	private static void numberChangerFour(int numberOne, int numberTwo) {
		System.out.println(numberOne + ", " + numberTwo);
		numberOne = numberOne ^ numberTwo;
		numberTwo = numberOne ^ numberTwo;
		numberOne = numberOne ^ numberTwo;
		System.out.println(numberOne + ", " + numberTwo);
	}

	private static void numberChangerThree(int numberOne, int numberTwo) {
		System.out.println(numberOne + ", " + numberTwo);
		if (numberTwo == 0) {
			numberChangerOne(numberOne, numberTwo);
		} else {
			numberOne = numberOne * numberTwo;
			numberTwo = numberOne / numberTwo;
			numberOne = numberOne / numberTwo;
			System.out.println(numberOne + ", " + numberTwo);
		}
	}

	private static void numberChangerTwo(int numberOne, int numberTwo) {
		System.out.println(numberOne + ", " + numberTwo);
		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;
		System.out.println(numberOne + ", " + numberTwo);
	}

	private static void numberChangerOne(int numberOne, int numberTwo) {
		System.out.println(numberOne + ", " + numberTwo);
		int temp = numberOne;
		numberOne = numberTwo;
		numberTwo = temp;
		System.out.println(numberOne + ", " + numberTwo);
	}

}
 