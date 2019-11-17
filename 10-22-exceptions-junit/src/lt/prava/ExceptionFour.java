package lt.prava;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionFour {

	public static void main(String[] args) {
//		try {
//			run();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

		try {
			run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

	}

	private static void run() throws IOException, ParseException {

	}

}
