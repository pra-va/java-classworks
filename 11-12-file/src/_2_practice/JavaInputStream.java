package _2_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JavaInputStream {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("props.txt")) {
			int charbox;
			while ((charbox = is.read()) != -1) {
				System.out.print(Character.toChars(charbox));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
