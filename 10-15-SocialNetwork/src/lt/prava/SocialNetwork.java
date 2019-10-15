package lt.prava;

public interface SocialNetwork {

	void sendMessage(Client recipient, String message);

	void getMessage(String message);

	String[] getMessages();

}
