package prava;

import java.util.Scanner;

public class Switch {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
//		checkSwitch();
		checkSwitchDifficult();

	}

	private static void checkSwitchDifficult() {
		System.out.println("Enter number:");
		int number = input.nextInt();
		switch(number) {
		
		case 10:
			System.out.println("first level of switch");
			System.out.println("Enter second number.");
			number = input.nextInt();
			switch(number) {
			case 20:
				System.out.println("second level");
				break;
			}
			break;
		default:
				System.out.println("...");
		}
		
	}

	private static void checkSwitch() {
		String color = "green";
		int number = 10;
		switch (color) {
		case "red":
			System.out.println("red");
			break;
		case "green":
			System.out.println("green");
			break;
		default:
			System.out.println("...");
		}

	}

}
