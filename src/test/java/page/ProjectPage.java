package page;

import org.openqa.selenium.WebDriver;

public class ProjectPage extends HomePage {
    private static final String PROJECT_URL = "https://testrailmailinator.testrail.io/index.php?/dashboard";
    public ProjectPage(WebDriver driver) {super(driver);}
    public void openProjectPage() {
        driver.get(PROJECT_URL);
    }
}
