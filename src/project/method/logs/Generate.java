package project.method.logs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;

public class Generate {

	public static String htmlString = null; 

	public static void logTesting() throws IOException {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   		LocalDateTime localDateTime = LocalDateTime.now();
		String timestamp = dateTimeFormatter.format(localDateTime);
		File htmlTemplateFile = new File("src\\project\\html\\template\\Log_Template.html");
		String htmlString = FileUtils.readFileToString(htmlTemplateFile, "UTF-8");
		htmlString = htmlString.replace("<div hidden>$section</div>", Component.section("Test Name 1", true, "Test Description ... ...", "screenshots\\screenshot_1.png", "Test Code Line", timestamp));
		htmlString = htmlString.replace("<div hidden>$section</div>", Component.section("Test Name 2", false, "Test Description ... ... ...", "screenshots\\screenshot_2.png", "Test Code Line", timestamp));
		File newHtmlFile = new File("Automation_Logs\\Test_Log.html");
		FileUtils.writeStringToFile(newHtmlFile, htmlString, "UTF-8");
	}

	public static String startLog() throws IOException{
		File htmlTemplateFile = new File("src\\project\\html\\template\\Log_Template.html");
		String htmlString = FileUtils.readFileToString(htmlTemplateFile, "UTF-8");
		return htmlString;
	}

	public static void endLog(String htmlString) throws IOException{
		File newHtmlFile = new File("Automation_Logs\\Test_Log.html");
		FileUtils.writeStringToFile(newHtmlFile, htmlString, "UTF-8");
	}

	public static void addLog(String component) throws IOException{

		if(htmlString == null){
			htmlString = startLog();
		}	

		htmlString = htmlString.replace("<div hidden>$section</div>", component);
	}



}
