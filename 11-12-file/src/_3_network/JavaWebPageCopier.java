package _3_network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class JavaWebPageCopier {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://en.wikipedia.org/wiki/Java");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			for (int i = 1; i < 8; i++) {
				System.out.println(connection.getHeaderField(i) + " = " + connection.getHeaderFieldKey(i));
			}

			URLConnection urlConnection = url.openConnection();
			InputStream dataStream = urlConnection.getInputStream();

			File file = new File("index.html");
			FileOutputStream os = new FileOutputStream(file);

			int dataBox;

			while ((dataBox = dataStream.read()) != -1) {
				System.out.print((char) dataBox);
				os.write(dataBox);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
