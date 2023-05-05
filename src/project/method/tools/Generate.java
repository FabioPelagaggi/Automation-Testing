package project.method.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import project.method.browser.Session;

public class Generate {

	static public String xpath(String tag, String text) {
		return tag(tag) + text(text) + notAncestor();
	}

	static public String xpath(String tag, String attribute, String value) {
		return tag(tag) + attribute(attribute, value) + notAncestor();
	}

	static public String xpath(String tag, String attribute, String value, String text) {
		return tag(tag) + attribute(attribute, value) + text(text) + notAncestor();
	}

	static public By by(String xpath) {
		return By.xpath(xpath);
	}

	static public WebElement element(String xpath) {
		return Session.getBrowser().findElement(by(xpath));
	}

	static public WebElement element(By by) {
		return Session.getBrowser().findElement(by);
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
