package lt.prava;

/**
 * Client class. This class will be the main messages initializer and end
 * receiver.
 * 
 * @author pra-va
 *
 */
public class Client { // Real human
	private String name;
	private int age;
	private AndroidApplication application;
	private String[] allMessages = new String[300];
	private int messageIterator = 0;

	public Client(String name, int age, AndroidApplication applicaiton) {
		this.name = name;
		this.age = age;
		this.application = applicaiton;
	}

	/**
	 * Returns application instance belonging to end user.
	 * 
	 * @return application instance.
	 */
	public AndroidApplication getApplicaiton() {
		return application;
	}

	/**
	 * Next three methods are used to send messages to social networks. Besides
	 * sending messages, these methods will write user owns messages for user to see
	 * latter.
	 * 
	 * @param recipient
	 * @param message
	 */
	public void sendMessageTwitter(Client recipient, String message) {
		this.application.getNetworks()[2].getMessage("Twitter, (Me): " + message);
		this.application.getNetworks()[2].sendMessage(recipient, "(" + this.name + "): " + message);
	}

	/**
	 * Read sendMessageTwitter method description.
	 * 
	 * @param recipient
	 * @param message
	 */
	public void sendMessageInstagram(Client recipient, String message) {
		this.application.getNetworks()[1].getMessage("Twitter, (Me): " + message);
		this.application.getNetworks()[1].sendMessage(recipient, "(" + this.name + "): " + message);
	}

	/**
	 * Read sendMessageTwitter method description.
	 * 
	 * @param recipient
	 * @param message
	 */
	public void sendMessageFacebook(Client recipient, String message) {
		this.application.getNetworks()[0].getMessage("Twitter, (Me): " + message);
		this.application.getNetworks()[0].sendMessage(recipient, "(" + this.name + "): " + message);
	}

	/**
	 * Method that is used to record messages to allMessages object array field.
	 * 
	 * @param message
	 */
	public void getMessage(String message) {
		this.allMessages[this.messageIterator] = message;
		this.messageIterator++;
	}

	/**
	 * This method will sync up user messages with Facebook, Instagram and Twitter
	 * accounts.
	 */
	public void checkNetwork() {
		this.messageIterator = 0;
		for (int i = 0; i < application.getNetworks().length; i++) {
			for (int j = 0; j < application.getNetworks()[i].getMessages().length; j++) {
				this.allMessages[this.messageIterator] = application.getNetworks()[i].getMessages()[j];
				this.messageIterator++;
			}
		}
	}

	/**
	 * Prints all messages from clients array field allMessages.
	 */
	public void printMessages() {
		System.out.println("Printing " + this.name + " (" + this.age + " years old) messages.");
		for (int i = 0; i < allMessages.length; i++) {
			if (this.allMessages[i] != null) {
				System.out.println(allMessages[i]);
			}
		}
		System.out.println();
	}
}
