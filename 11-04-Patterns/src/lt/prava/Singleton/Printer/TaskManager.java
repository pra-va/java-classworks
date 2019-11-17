package lt.prava.Singleton.Printer;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	public static void main(String[] args) {

		PrintSpooler printSpooler = PrintSpooler.getInstance();
		PrintSpooler printSpoolerTwo = PrintSpooler.getInstance();

		System.out.println(printSpooler);
		System.out.println(printSpoolerTwo);

		printSpooler.start();

		List<String> names = new ArrayList<String>();
		names.add("Tomas");
		names.add("Katinas");

		printSpooler.print(names);
	}

}
