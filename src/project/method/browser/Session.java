package project.method.browser;

import org.openqa.selenium.WebDriver;

public class Session {
	static private WebDriver Browser = null;

	public static WebDriver getBrowser() {
		return Browser;
	}

	public static void setBrowser(WebDriver browser) {
		Browser = browser;
	}

	public static void closeBrowser() {
		Browser.close();
	}
}
