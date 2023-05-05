package project.method.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import project.method.browser.Session;

public class Generate {

	static public String xpath(String tag, String text) {
		String xpath = tag(tag) + text(text) + notAncestor();
		return xpath;
	}

	static public String xpath(String tag, String attribute, String value) {
		String xpath = tag(tag) + attribute(attribute, value) + notAncestor();
		return xpath;
	}

	static public String xpath(String tag, String attribute, String value, String text) {
		String xpath = tag(tag) + attribute(attribute, value) + text(text) + notAncestor();
		return xpath;
	}

	static public By by(String xpath) {
		By by = By.xpath(xpath);
		return by;
	}

	static public WebElement element(String xpath) {
		WebElement element = Session.getBrowser().findElement(by(xpath));
		return element;
	}

	static public WebElement element(By by) {
		WebElement element = Session.getBrowser().findElement(by);
		return element;
	}

	static private String tag(String tag) {
		return "//" + tag;
	}

	static private String attribute(String attribute, String value) {
		return "[contains(@" + attribute + ", '" + value + "')]";
	}

	static private String text(String text) {
		return "[text()[contains(.,'" + text + "')]]";

	}

	static private String notAncestor() {
		return "[not(ancestor-or-self::*[contains(@style,'display: none;')])]";
	}
}
