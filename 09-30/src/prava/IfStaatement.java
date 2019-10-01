package prava;

import java.util.Scanner;

public class IfStaatement {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
//		checkIf();
//		ifElse();
//		ifElseIf();
		ternaryIf();
		

	}

	private static void ternaryIf() {
		int number = 90;
		boolean result = (number == 100) ? true : (number == 90) ? true : false;
		System.out.println(result);
		
	}

	private static void ifElseIf() {
		System.out.println("Enter name:");
		String name = input.next();
		if (name.equals("Tomas")) {
			System.out.println("Name is Tomas");
		} else if (name.equals("Dave")) {
			System.out.println("Name is Tomas");
		} else {
			System.out.println("...");
		}
	}

	private static void ifElse() {
		System.out.println("Enter name");
		String text = input.next();
		if (input.hasNext()) {
			System.out.println(text);
		} else {
			System.out.println("nothing...");
		}
		
	}

	private static void checkIf() {
		System.out.println("Input name: ");
		String name = "Tomas";
		if (name.equals("Tomas")) {
			System.out.println("OK");
		}
		
	}
	

}
