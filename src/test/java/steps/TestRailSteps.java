package steps;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestRailSteps {
    // @When("^website is open \"([^\"]*)\"$") добавлять любую строку с помощью регулярки
    @When("website is open {string}")
    public void websiteIsOpen(String url) {
        // Configuration.startMaximized = true;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver =  new ChromeDriver(options);
        open(url);
    }

    @When("in the field {string} enter a value {string}")
    public void input(String fieldName, String fieldValue) {
        String name;
        if(fieldName.equals("Username")) name = "email";
        else name = "password";
       $(By.name(name)).sendKeys(fieldValue);
    }

    @When("click button {string}")
    public void clickButton(String buttonName) {
      // Configuration.startMaximized = true;
        $("Login").click();
    }

    @Then("check the site address is {string}")
    public void chekTheSiteAddress(String url) {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, url);
    }
}

























