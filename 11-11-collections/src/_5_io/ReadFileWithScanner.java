package _5_io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {
	private String path;
	private File fileObject;
	private Scanner readFile;

	public ReadFileWithScanner(String path) {
		if (path != null) {
			this.fileObject = new File(path);
			readDataFromFile();
		} else {
			throw new NullPointerException("Invalid path.");
		}
	}

	private void readDataFromFile() {
		try {
			this.readFile = new Scanner(this.fileObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getFileLine() {
		return readFile.nextLine();
	}

}
