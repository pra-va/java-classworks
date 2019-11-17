package lt.prava.Singleton.logger;

public class ApplicationLogger {
	private static ApplicationLogger applicationLogger = new ApplicationLogger();
	private String loggerSummary = "My Logger...\n";

	private ApplicationLogger() {
	};

	public static synchronized ApplicationLogger getApplicationLogger() {
		if (applicationLogger == null) {
			return applicationLogger;
		}
		return applicationLogger;
	}

	public void addLogInfo(String info) {
		loggerSummary += info + " \n";
	}

	public void showAllLogs() {
		System.out.println(loggerSummary);
	}

}
