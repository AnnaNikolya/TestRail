package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends HomePage{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='et_builder_outer_content']/div/div/div[5]/div/div[1]/div[2]") // или вынести в HomePage
    private WebElement buttonTryTestRailforFree;

    public void clickButton(){buttonTryTestRailforFree.click();}

    @FindBy(id = "hostname")
    public WebElement webAddress;
    @FindBy(id = "first_name")
    public WebElement firstName;
    @FindBy(id = "last_name")
    public WebElement lastName;
    @FindBy(id = "")
    public WebElement country;//не пойму каким методом нажимать и выбирать нужную страну
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "organization")
    public WebElement organization;
    @FindBy(id = "organization")
    public WebElement expectedUsers;//не пойму каким методом нажимать и выбирать нужное количество человек
    @FindBy(id = "tos")
    public WebElement agree;//не пойму каким методом нажимать и поставить галочку для согласия
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div//form/div[8]")
    private WebElement buttonTCreateTestRailTrial;

    public void createTestRailTrial(String keyword){
        webAddress.sendKeys("testrail");
        firstName.sendKeys("Student");
        lastName.sendKeys("StudentQA08");
        country.click();// как выбрать Беларусь
        email.sendKeys("testrail@mailinator.com");
        organization.sendKeys("QA08");
        expectedUsers.sendKeys("1");
        agree.click();
        buttonTCreateTestRailTrial.click();
    }
}
