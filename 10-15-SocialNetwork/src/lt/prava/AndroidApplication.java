package lt.prava;

/**
 * Android application class. It has SocialNetwork array field that will fit
 * Facebook, Instagram and Twitter objects. This class acts as a medium between
 * user and object instances of social networks.
 * 
 * @author pra-va
 *
 */
public class AndroidApplication {

	private SocialNetwork[] networks = new SocialNetwork[3];

	/**
	 * CONSTRUCTOR
	 * 
	 * @param facebookAccount
	 * @param instagramAccount
	 * @param twitterAccount
	 */
	public AndroidApplication(SocialNetwork facebookAccount, SocialNetwork instagramAccount,
			SocialNetwork twitterAccount) {
		this.networks[0] = facebookAccount;
		this.networks[1] = instagramAccount;
		this.networks[2] = twitterAccount;
	}

	/**
	 * Will return networks array filled with SocialNetworks.
	 * 
	 * @return
	 */
	public SocialNetwork[] getNetworks() {
		return networks;
	}

}
