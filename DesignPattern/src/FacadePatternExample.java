import java.sql.Driver;

/*properties:-structural design pattern
 * used when there are multiple interfaces of similar kinds of jobs, then we add a facade interface,
 * which provide better interface to these interfaces and clients. It basically helps in routing to
 * related interface.
 * examples: drivers, databases
 */

/*Implementation:-
 * we will implement a facade helper class, which will route to method related to specific class based on input.
 * 
 */
class Firefox {
	public static Driver getFirefoxDriver() {
		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {
		System.out.println("Generating HTML report for Firefox driver");
	}

	public static void generateJUnitReport(String test, Driver driver) {
		System.out.println("Generating JUNIT report for Firefox driver");
	}

}

class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {
		System.out.println("Generating HTML report for Chrome driver");
	}

	public static void generateJUnitReport(String test, Driver driver) {
		System.out.println("Generating JUNIT report for Chrome driver");
	}

}

class WebExplorerHelperFacade {
	public static void generateReports(String explorer, String report, String test) {
		Driver driver = null;
		switch (explorer) {
		case "firefox":
			driver = Firefox.getFirefoxDriver();
			switch (report) {
			case "html":
				Firefox.generateHTMLReport(test, driver);
				break;
			case "junit":
				Firefox.generateJUnitReport(test, driver);
				break;
			}
			break;

		case "chrome":
			driver = Chrome.getChromeDriver();
			switch (report) {
			case "html":
				Chrome.generateHTMLReport(test, driver);
				break;
			case "junit":
				Chrome.generateJUnitReport(test, driver);
				break;
			}
			break;
		}
	}
}

public class FacadePatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "CheckElementPresent";
		
		WebExplorerHelperFacade.generateReports("firefox", "html", test);
		WebExplorerHelperFacade.generateReports("firefox", "junit", test);
		WebExplorerHelperFacade.generateReports("chrome", "html", test);
		WebExplorerHelperFacade.generateReports("chrome", "junit", test);
		
	}

}
