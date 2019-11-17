package _1_file_system;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) {

		Properties props = new Properties();
		props.setProperty("name", "vtmc");
		props.setProperty("domain", "www.vtmc.lt");
		props.setProperty("email", "admin@vtmc.lt");

		try (OutputStream os = new FileOutputStream("MyApp.xml")) {
//			props.store(os, "My props file");
			props.storeToXML(os, "My xml props file.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
