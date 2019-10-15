package lt.prava;

public class Main {
	public static void main(String[] args) {
		// Creating new social networks.
		SocialNetwork fbOne = new Facebook();
		SocialNetwork instaOne = new Instagram();
		SocialNetwork twitOne = new Twitter();
		SocialNetwork fbTwo = new Facebook();
		SocialNetwork instaTwo = new Instagram();
		SocialNetwork twitTwo = new Twitter();
		SocialNetwork fbThree = new Facebook();
		SocialNetwork instaThree = new Instagram();
		SocialNetwork twitThree = new Twitter();

		// Creating new applications
		AndroidApplication applicationOne = new AndroidApplication(fbOne, instaOne, twitOne);
		AndroidApplication applicationTwo = new AndroidApplication(fbTwo, instaTwo, twitTwo);
		AndroidApplication applicationThree = new AndroidApplication(fbThree, instaThree, twitThree);

		// Creating new clients
		Client humanOne = new Client("Tomas", 23, applicationOne);
		Client humanTwo = new Client("Vaclav", 26, applicationTwo);
		Client humanThree = new Client("Tadas", 19, applicationThree);

		// Sending messages
		humanOne.sendMessageFacebook(humanTwo, "Labas. Kaip laikaisi?");
		humanTwo.sendMessageFacebook(humanOne, "Aciu, puikiai. Kaip Tu?");
		humanOne.sendMessageInstagram(humanTwo, "Ar matei mano nauja nuotrauka?");
		humanThree.sendMessageTwitter(humanOne, "As myliu twiteri");
		humanOne.sendMessageTwitter(humanThree, "Labas. Ar skaitei nauja Donaldo Trumpo posta?");
		humanThree.sendMessageFacebook(humanOne, "Taip, maciau!!!");

		// Printing out messages. Some of messages will be rubbish because accounts do
		// not have separate chats with each other.
		humanOne.checkNetwork();
		humanOne.printMessages();

		humanTwo.checkNetwork();
		humanTwo.printMessages();

		humanThree.checkNetwork();
		humanThree.printMessages();

	}
}
