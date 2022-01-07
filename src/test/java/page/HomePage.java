package page;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private static final String HOME_URL = "https://www.gurock.com/testrail/";
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openPage() {
        driver.get(HOME_URL);
    }


}
