package lt.prava.creational.builder.factory;

public class JavaDeveloperFactory implements DeveloperFactory {

	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

}
