package Loging;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging {

	// SL4J LOG4J

	private static Logger logger = Logger.getLogger(JavaLogging.class.getName());

	public static void main(String[] args) {
		// Simplest Java logging sample
//		loggerOne();
		loggerTwo(); // java.util.logger

	}

	private static void loggerTwo() {
		// finest, finer, fine, config, info, warning, severe, all, off
		logger.warning("Warning message");
		logger.info("Info message");
		logger.log(Level.ALL, "All messages");

	}

	private static void loggerOne() {
		try (Scanner input = new Scanner(System.in)) {
			System.setErr(new PrintStream("log.txt"));
			System.err.println("Info messge");
			System.err.println("Error messge");
			int number = input.nextInt();
			if (number == 0) {
				throw new Exception("Error message");
			} else {
				System.out.println("OK");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
