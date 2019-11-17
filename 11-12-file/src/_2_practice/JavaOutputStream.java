package _2_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaOutputStream {

	public static void main(String[] args) {
		// file -> console -> new file

		try (InputStream is = new FileInputStream("props.txt");
				OutputStream os = new FileOutputStream("copyoflabas.txt")) {
			int charbox;
			while ((charbox = is.read()) != -1) {
				System.out.print(Character.toChars(charbox));
				os.write(charbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
