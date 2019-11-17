package lt.prava.creational.builder.factory;

public class PhpDeveloperFactory implements DeveloperFactory {

	@Override
	public Developer createDeveloper() {
		return new PhpDeveloper();
	}
}
