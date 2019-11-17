package lt.prava.behavioral.web;

public class WebsiteTester {
	public static void main(String[] args) {
		NewsPage news = new NewsPage();
		WelcomePage welcome = new WelcomePage();

		news.showPage();
		System.out.println("------------");
		welcome.showPage();
	}

}
