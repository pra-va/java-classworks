package lt.vtmc.philatelist;

import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

/**
 * Java Exam Solution for philatelist implementation.
 * 
 * @author Pranas Varaneckas
 *
 */
public class MyPhilatelist extends PhilatelistBaseTest {

	/**
	 * @return my implementation of Philatelist interface.
	 */
	@Override
	protected Philatelist getPhilatelist() {
		return new PhilatelistImplementation();
	}

}
