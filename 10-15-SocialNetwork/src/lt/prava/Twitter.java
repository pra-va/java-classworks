package lt.prava;

/**
 * Twitter social network implementation. This class is created in main class
 * and used as parameter while creating AndroidApplication object.
 * 
 * @author pra-va
 *
 */
public class Twitter implements SocialNetwork {
	private String[] messages = new String[100];
	private int messageIterator = 0;

	/**
	 * This method will send a certain String message to a recipient, provided as a
	 * method parameter.
	 */
	@Override
	public void sendMessage(Client recipient, String message) {
		recipient.getApplicaiton().getNetworks()[2].getMessage("Twitter " + message);
	}

	/**
	 * This method will accept sent message and will add it to messages array.
	 */
	@Override
	public void getMessage(String message) {
		messages[messageIterator] = message;
		messageIterator++;
	}

	/**
	 * Method that returns messages array.
	 */
	@Override
	public String[] getMessages() {
		return messages;
	}
}
