package project.method.logs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Generate {

	public static void logTesting() throws IOException {
		File htmlTemplateFile = new File("src\\project\\html\\template\\Log_Template.html");
		String htmlString = FileUtils.readFileToString(htmlTemplateFile, "UTF-8");
		String title = "New Page";
		String body = "This is Body";
		htmlString = htmlString.replace("$title", title);
		htmlString = htmlString.replace("$body", body);
		File newHtmlFile = new File("Automation_Logs\\Test_Log.html");
		FileUtils.writeStringToFile(newHtmlFile, htmlString, "UTF-8");
	}

}
