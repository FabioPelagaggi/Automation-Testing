package project.method.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static WebDriver setUpDriver() {
		System.setProperty("webdriver.edge.driver", "src\\driver\\msedgedriver.exe");

		Session.setBrowser(new EdgeDriver());

		return Session.getBrowser();
	}

}
