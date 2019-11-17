package _5_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopier {

	public static void main(String[] args) {
		// Byte, char, string streams
//		copyByteByByte();
//		copyCharByChar();
		copyLineByLine();

	}

	private static void copyLineByLine() {
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("labas.txt"));
			PrintWriter outputStram = new PrintWriter(new FileWriter("newtest.txt"));
			String dataBox;
			while ((dataBox = inputStream.readLine()) != null) {
				outputStram.println(dataBox);
			}
			outputStram.flush();
		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

	private static void copyCharByChar() {
		try (FileReader fr = new FileReader("labas.txt"); FileWriter fw = new FileWriter("hihello.txt")) {
			int dataBox;
			while ((dataBox = fr.read()) != -1) {
				fw.write(dataBox);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private static void copyByteByByte() {
		try (FileInputStream fis = new FileInputStream("pic.jpg")) {
			FileOutputStream fos = new FileOutputStream("newpic.jpg");
			int dataBox;
			while ((dataBox = fis.read()) != -1) {
				fos.write(dataBox);
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

}
