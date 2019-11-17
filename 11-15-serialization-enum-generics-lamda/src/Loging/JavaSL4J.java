package Loging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaSL4J {
	private static final Logger LOGGER = LoggerFactory.getLogger(JavaSL4J.class);

	public static void main(String[] args) {
		methodOne();
		methodTwo();
		People people = new People("Tomas");
		people.getName();
	}

	private static void methodTwo() {
		LOGGER.error("Message three...");

	}

	private static void methodOne() {
		LOGGER.info("Message one...");
		LOGGER.warn("Warning message...");
	}
}
