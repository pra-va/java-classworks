package _3_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class JavaInetAddress {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getByName("www.vtmc.lt");
			System.out.println(inetAddress.getHostName());
			System.out.println(inetAddress.getHostAddress());
			System.out.println(inetAddress.getCanonicalHostName());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
