package lt.prava.Singleton.Printer;

import java.util.List;

public class PrintSpooler {

	// Privatus, visiems vienodas, nekeiciamas
	private static final PrintSpooler PRINT_SPOOLER = new PrintSpooler();
	private static boolean initialized = false;

	private PrintSpooler() {
	};

	public void start() {
		System.out.println("Spooler initialized...");
	}

	public static PrintSpooler getInstance() {
		if (!initialized) {
			return PRINT_SPOOLER;
		}
		return PRINT_SPOOLER;
	}

	public void print(List<String> list) {
		System.out.println("Printing...");
		System.out.println(list);
	}
}
