package _1_file_system;

import java.io.File;
import java.io.IOException;

public class JavaFileSystem {

	public static void main(String[] args) {

//		try {
////			createNewFile();	
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		createNewDirectory();

//		createNewDirectories();

		removeFile();

	}

	private static void removeFile() {
		File deleteFile = new File("hello.txt");
		boolean isFileDeleted = deleteFile.delete();
		System.out.println("File is removed: " + isFileDeleted);

	}

	private static void createNewDirectories() {
		File newDirectory = new File("resourses/A/B/C");
		boolean isDirectoryCreated = newDirectory.mkdirs();
		System.out.println("Directory is created: " + isDirectoryCreated);
	}

	private static void createNewDirectory() {
		File newDirectory = new File("resourses");
		boolean isDirectoryCreated = newDirectory.mkdir();
		System.out.println("Directory is created: " + isDirectoryCreated);

	}

	private static void createNewFile() throws IOException {
		File newFile = new File("hello.txt");
		boolean checkCreateNewFile = newFile.createNewFile();
		System.out.println("File is created: " + checkCreateNewFile);
	}

}
