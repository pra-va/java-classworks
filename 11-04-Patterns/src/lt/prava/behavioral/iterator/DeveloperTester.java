package lt.prava.behavioral.iterator;

public class DeveloperTester {
	String[] skills = { "HTMl" };
	JavaDeveloper tomas = new JavaDeveloper("Tomas", skills);
	Iterator iterator = tomas.getIterator();

	while(iterator.hasNext())
	{

	}
}
