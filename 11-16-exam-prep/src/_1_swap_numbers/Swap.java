package _1_swap_numbers;

public class Swap {

	int number = 100;

	public void calculate(int number) {
		this.number = number * 10;
	}

	public void printNumber() {
		System.out.println(number);
	}

	public static void main(String[] args) {
		Exam object = new Exam();
		object.calculate(2);
		object.printNumber();
	}

}
