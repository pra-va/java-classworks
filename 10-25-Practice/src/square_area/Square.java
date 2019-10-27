package square_area;

import java.util.Scanner;

public class Square {
	private double firstSide;
	private double secondSide;
	private double squareArea;

	public double getFirstSide() {
		return firstSide;
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void readData(double firstSide, double secondSide) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first side of a square:");
		this.firstSide = scanner.nextDouble();
		System.out.println("Enter second side of a square:");
		this.secondSide = scanner.nextDouble();
	}

	public void countSquareArea() {
		this.squareArea = this.firstSide * this.secondSide;
	}

	public void printSquareArea() {
		System.out.println("Square area: " + this.squareArea);
	}

}
