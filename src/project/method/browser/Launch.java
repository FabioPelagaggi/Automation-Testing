package project.method.browser;

import org.openqa.selenium.WebDriver;

public class Launch {

    public static void page(String HTML, WebDriver driver) {
        driver.get(HTML);
        //driver.manage().window().maximize();
    }
}
