package lt.prava.Singleton.logger;

public class MyProgram {

	public static void main(String[] args) {
		System.out.println(ApplicationLogger.getApplicationLogger());
		System.out.println(ApplicationLogger.getApplicationLogger());
		ApplicationLogger.getApplicationLogger().addLogInfo("Good day");
		ApplicationLogger.getApplicationLogger().showAllLogs();
		MyOtherApp myOtherProgram = new MyOtherApp();
		myOtherProgram.run();
		ApplicationLogger.getApplicationLogger().showAllLogs();
	}

}
