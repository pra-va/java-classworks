package lt.prava.creational.builder.factory;

public class DeveloperCreator {
	public static void main(String[] args) {
//		DeveloperFactory developerFactory = new JavaDeveloperFactory();
		DeveloperFactory developerFactory = createDeveloperByLanguage("php");
		Developer one = developerFactory.createDeveloper();
		one.writeCode();
	}

	private static DeveloperFactory createDeveloperByLanguage(String string) {
		if (string.equalsIgnoreCase("php")) {
			return new PhpDeveloperFactory();
		} else if (string.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		} else {
			throw new RuntimeException("Language not supported...");
		}
	}

}
