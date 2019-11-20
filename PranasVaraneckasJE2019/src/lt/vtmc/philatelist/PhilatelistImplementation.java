package lt.vtmc.philatelist;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import philatelist.Philatelist;
import philatelist.PostStamp;

/**
 * My exam implementation of philatelist. Class implements Philatelist interface
 * provided in exam task.
 * 
 * @author Pranas Varaneckas
 *
 */
public class PhilatelistImplementation implements Philatelist {
	/**
	 * log4j is used to log to a file. Stamps ArrayList is created to store the
	 * collection of post stamps.
	 * 
	 */
	private static final Logger LOGGER = Logger.getLogger(PhilatelistImplementation.class);
	private List<PostStamp> stamps = new ArrayList<PostStamp>();

	/**
	 * Will add new post stamp to a stamps field collection. Logger will print a
	 * message that post stamp is added to philatelists stamps collection.
	 * 
	 * @param postStamp an object to add to collection.
	 */
	@Override
	public void addToCollection(PostStamp postStamp) {
		System.out.println(postStamp);
		if (postStamp == null || postStamp.getName() == null || postStamp.getName().equals("")) {
			LOGGER.error(
					"IllegalArgumentException while trying to add post stamp to a collection: post stamp name or post stamp itself is null or post stamp name is empty.");
			throw new IllegalArgumentException();
		}

		if (this.stamps.contains(postStamp)) {
			return;
		} else {
			LOGGER.info("Philatelist is adding new post stamp to collection. Name: " + postStamp.getName()
					+ "; market price: " + postStamp.getMarketPrice() + "; nominal price: "
					+ postStamp.getNominalPrice());
			this.stamps.add(postStamp);
		}
	}

	/**
	 * Calculates average philatelists post stamp market price.
	 * 
	 * @return average market price for post stamp collection.
	 */
	@Override
	public double getAveragePostStampPrice() {
		double totalPrice = 0.0;
		for (PostStamp postStamp : this.stamps) {
			totalPrice += postStamp.getMarketPrice();
		}
		return totalPrice / this.stamps.size();
	}

	/**
	 * @return integer size of the post stamp collection.
	 */
	@Override
	public int getNumberOfPostStampsInCollection() {
		return this.stamps.size();
	}

	/**
	 * Finds the most expensive post stamp in the collection.
	 * 
	 * @return most expensive post stamp.
	 */
	@Override
	public PostStamp getTheMostExpensivePostStamByMarketValue() {
		if (this.stamps.size() == 0) {
			LOGGER.warn("Trying to get the most expensive post stamp from an empy list.");
			return null;
		}

		PostStamp mostExpensiveStamp = stamps.get(0);
		for (PostStamp postStamp : this.stamps) {
			if (postStamp.getMarketPrice() > mostExpensiveStamp.getMarketPrice()) {
				mostExpensiveStamp = postStamp;
			}
		}

		return mostExpensiveStamp;
	}

	/**
	 * Will find cheapest post stamp in the collection.
	 * 
	 * @return cheapest post stamp.
	 */
	public PostStamp getTheCheapestPostStamByMarketValue() {
		if (this.stamps.size() == 0) {
			LOGGER.warn("Trying to get the cheapest post stamp from an empy list.");
			return null;
		}

		PostStamp cheapeStamp = stamps.get(0);
		for (PostStamp postStamp : this.stamps) {
			if (postStamp.getMarketPrice() < cheapeStamp.getMarketPrice()) {
				cheapeStamp = postStamp;
			}
		}

		return cheapeStamp;
	}

}
