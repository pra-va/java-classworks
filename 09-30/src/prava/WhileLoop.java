package prava;

public class WhileLoop {

	public static void main(String[] args) {
		checkWhile();
		doWhileCheck();
	}
	

	private static void doWhileCheck() {
		int number = 0;
		do {
			System.out.println(number + " labas");
			number ++;
		} while (number != 10);
		
	}


	private static void checkWhile() {
//		while (true) {
//			System.out.println("infinity");
//		}
		
		int number = 0;
		while(number != 10) {
			System.out.println(number + " labas");
			number++;
		}
	}

}
