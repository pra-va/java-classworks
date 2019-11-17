package Loging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class People {
	private String name;
	private static final Logger LOGGER = LoggerFactory.getLogger(JavaSL4J.class);

	public People(String name) {
		LOGGER.info("People object created.");
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}

	public String getName() {
		LOGGER.error("Name is null.");
		return name;
	}

}
