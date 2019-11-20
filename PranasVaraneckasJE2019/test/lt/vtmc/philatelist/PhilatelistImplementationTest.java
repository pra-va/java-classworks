package lt.vtmc.philatelist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import philatelist.PostStamp;

/**
 * Unit test class for PhilatelistImplementation class.
 * 
 * @author Pranas Varaneckas
 *
 */
public class PhilatelistImplementationTest {

	/**
	 * getCheapestPostStamp should return post stamp with the smallest market price.
	 */
	@Test
	public void shouldReturnCheapestPostStamp() {
		PhilatelistImplementation philatelist = new PhilatelistImplementation();
		philatelist.addToCollection(new PostStamp("Test stamp 1", 1.22, 5.23));
		philatelist.addToCollection(new PostStamp("Test stamp 1", 10.0, 0.1));
		philatelist.addToCollection(new PostStamp("Test stamp 1", 10.0, 2.23));
		assertEquals(0.1, philatelist.getTheCheapestPostStamByMarketValue().getMarketPrice(), .2);
	}

	/**
	 * While getCheapestPostStamp is initiated with empty post stamp list, method
	 * should return null.
	 */
	@Test
	public void shouldReturnNullIfListIsEmptyWhileLookingForCheapestStamp() {
		PhilatelistImplementation philatelist = new PhilatelistImplementation();
		assertNull(philatelist.getTheCheapestPostStamByMarketValue());
	}

}
