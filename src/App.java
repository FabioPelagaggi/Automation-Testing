import project.method.browser.Edge;
import project.method.browser.Launch;
import project.method.browser.Session;
import project.method.logs.Generate;
import project.method.logs.Screenshot;
import project.page.Page;

public class App {
    public static void main(String[] args) throws Exception {

        Launch.page("https://petstore.octoperf.com/", Edge.setUpDriver());

        Page.enterStore();
        Screenshot.takeAndSave();
        Page.clickFish();
        Screenshot.takeAndSave();
        Page.clickDogs();
        Screenshot.takeAndSave();
        Page.clickReptiles();
        Screenshot.takeAndSave();
        Page.clickCats();
        Screenshot.takeAndSave();
        Page.clickBirds();
        Screenshot.takeAndSave();

        Session.closeBrowser();

        Generate.logTesting();

    }
}
