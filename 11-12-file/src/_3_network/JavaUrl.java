package _3_network;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaUrl {

	public static void main(String[] args) {
		try {
			URL url = new URL(
					"https://images-na.ssl-images-amazon.com/images/I/41Gi3n9lRrL._SX331_BO1,204,203,200_.jpg");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getAuthority());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
