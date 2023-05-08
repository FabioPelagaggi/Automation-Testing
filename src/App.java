import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import project.method.logs.Component;
import project.method.logs.DateTime;
import project.method.logs.Generate;

public class App {
    public static void main(String[] args) throws Exception {

        // Launch.page("https://petstore.octoperf.com/", Edge.setUpDriver());

        // Page.enterStore();
        // Screenshot.takeAndSave();
        // Page.clickFish();
        // Screenshot.takeAndSave();
        // Page.clickDogs();
        // Screenshot.takeAndSave();
        // Page.clickReptiles();
        // Screenshot.takeAndSave();
        // Page.clickCats();
        // Screenshot.takeAndSave();
        // Page.clickBirds();
        // Screenshot.takeAndSave();

        // Session.closeBrowser();
        
        Generate.addLog(Component.section("Test Name 1", true, "Test Description ... ...", "screenshots\\screenshot_1.png", "Test Code Line"));
        Generate.addLog(Component.section("Test Name 2", false, "Test Description ... ... ...", "screenshots\\screenshot_2.png", "Test Code Line"));
        Generate.addLog(Component.section("Test Name 3", true, "Test Description ... ... ... ...", "screenshots\\screenshot_3.png", "Test Code Line"));
        Generate.addLog(Component.section("Test Name 4", false, "Test Description ... ... ... ... ...", "screenshots\\screenshot_4.png", "Test Code Line"));

        Generate.endLog(Generate.htmlString);

    }
}
