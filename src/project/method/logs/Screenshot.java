package project.method.logs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import project.method.browser.Session;

public class Screenshot {

	public static int count = 01;

	public static void takeAndSave() throws IOException {
		save(take());
	}

	public static File take() {
		return ((TakesScreenshot) Session.getBrowser()).getScreenshotAs(OutputType.FILE);
	}

	public static void save(File screenshot) throws IOException {
		FileUtils.copyFile(screenshot, new File("Automation_Logs\\screenshots\\screenshot_" + count + ".png"));
		count++;
	}
}
