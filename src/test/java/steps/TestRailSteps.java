package steps;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.ProjectPage;
import page.SignUpPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;


public class TestRailSteps {
    public static final String HOME_URL = "https://www.gurock.com/testrail/";// ка сдесь не прописывать а вытянуть с HomePage
    private static final String PROJECT_URL = "https://testrailmailinator.testrail.io/index.php?/dashboard";
    private WebDriver driver;
    private SignUpPage signUpPage;
    private ProjectPage projectPage;
    private HomePage homePage;

@Before
    public void init(){
        WebDriverManager.chromedriver().setup();
    }

    @Given("User opens TestRail home page {string}")
    public void openPage() {
        open(HOME_URL);
    }
    @And("click button {string}")
    public void clickTryTestRailForFree() {
    $(By.xpath("//*[@id='et_builder_outer_content']/div/div/div[5]/div/div[1]/div[2]")).click();}
    @And("in the field {string} enter a value {string}")
    public void inTheFieldEnterAValue(String arg0, String arg1) {
    $("webAddress").shouldHave(exactText("Some text"));
        $("firstName").shouldHave(exactText("Some text"));
        $("lastName").shouldHave(exactText("Some text"));
        $("email").shouldHave(exactText("Some text"));
        $("expectedUsers").shouldHave(exactText("Some text"));
    }
    @And("in the field {string} choose a value {string}")
    public void inTheFieldChooseAValue(String arg0, String arg1) {
    }
    @And("choose input with text {string}")
    public void chooseInputWithText(String arg0) {

    }
    @When("User clicks button {string}")
    public void userClicksButtonCreateTestRailTrial() {
    }
    @Then("Verify .... и тут описываешь свою проверку")
    public void verifyИТутОписываешьСвоюПроверку() {
    }





    @When("open {string}")
    public void open(String arg0) {
    }
    @And("click Add Project")
    public void clickAddProject() {
    }
    @And("click button Add Project")
    public void clickButtonAddProject() {
    }
    @Then("mistake {string}")
    public void mistake(String arg0) {
    }


    @When("open page {string}")
    public void openPage(String arg0) {
    }
    @And("click button an Add Project")
    public void clickButtonAnAddProject() {
    }
    @And("in the field {string} enter a value {string}")
    public void inTheFieldEnterAValue2(String arg0, String arg1) {
    }
    @And("click button name Add Project")
    public void clickButtonNameAddProject() {
    }


    @When("open all projects {string}")
    public void openAllProjects(String arg0) {
    }
    @And("click Test Runs in created project")
    public void clickTestRunsInCreatedProject() {
    }
    @And("click Add Test Run")
    public void clickAddTestRun() {
    }
    @And("click button Add Test Run")
    public void clickButtonAddTestRun() {
    }


    @When("open a {string}")
    public void openA(String arg0) {
    }
    @And("choose tab Projects")
    public void chooseTabProjects() {
    }
    @And("click Add Example Project")
    public void clickAddExampleProject() {
    }
    @And("click button Add Example Project")
    public void clickButtonAddExampleProject() {
    }
    @Then("download chart as an image")
    public void downloadChartAsAnImage() {
    }
    @Then("Return to Dashboard and delete project")
    public void returnToDashboardAndDeleteProject() {
    }
}














