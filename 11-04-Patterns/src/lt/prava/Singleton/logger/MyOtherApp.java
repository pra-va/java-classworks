package lt.prava.Singleton.logger;

public class MyOtherApp {

	public void run() {
		ApplicationLogger.getApplicationLogger().addLogInfo("Java is cool");
	}
}
