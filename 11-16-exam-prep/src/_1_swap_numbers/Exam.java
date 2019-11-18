package _1_swap_numbers;

import java.io.IOException;

public class Exam {
	public static void main(String[] args) {
		try {
			throw new IOException("Hello World!");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}