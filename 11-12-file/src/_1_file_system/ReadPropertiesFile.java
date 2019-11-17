package _1_file_system;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("props.txt")) {
			Properties props = new Properties();
			props.load(is);
			System.out.println("name: " + props.getProperty("name"));
			System.out.println("domain: " + props.getProperty("domain"));
			System.out.println("email: " + props.getProperty("email"));
			System.out.println(props.getProperty("name", "No such name exists"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
