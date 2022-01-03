package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class TestRailSteps {

    @When("website is open {string}")
    public void websiteIsOpen(String fieldName, String fieldValue) {
        String name;
        if(fieldName.equals("Username")) name = "email";
        else name = "password";
       $(By.name(name)).sendKeys(fieldValue);
    }


    @And("for registration click button Try TestRail for Free")
    public void forRegistrationClickButtonTryTestRailForFree() {
    }

    @And("in the field {string} choose a value {string}")
    public void inTheFieldChooseAValue(String arg0, String arg1) {
    }

    @Then("choose input with text {string}")
    public void chooseInputWithText(String arg0) {
    }

    @And("click button Create TestRail Trial")
    public void clickButtonCreateTestRailTrial() {
    }

    @Given("API key {string}")
    public void apiKey(String arg0) {
    }

    @When("open way {string}")
    public void openWay(String arg0) {
    }

    @And("click on tab {string}")
    public void clickOnTab(String arg0) {
    }

    @And("clik on {string}")
    public void clikOn(String arg0) {
    }

    @And("input Name {string}")
    public void inputName(String arg0) {
    }

    @Then("click {string}")
    public void click(String arg0) {
    }

    @And("save key")
    public void saveKey() {
    }

    @When("open {string}")
    public void open(String arg0) {
    }

    @And("click button Add Project")
    public void clickButtonAddProject() {
    }

    @Then("mistake {string}")
    public void mistake(String arg0) {
    }

    @When("open all projects {string}")
    public void openAllProjects(String arg0) {
    }

    @And("click Test Runs in created project")
    public void clickTestRunsInCreatedProject() {
    }

    @And("click button Add Test Run")
    public void clickButtonAddTestRun() {
    }

    @And("choose tab Projects")
    public void chooseTabProjects() {
    }

    @And("click button Add Example Project")
    public void clickButtonAddExampleProject() {
    }

    @Then("download chart as an image")
    public void downloadChartAsAnImage() {
    }

    @Then("Return to Dashboard and detete project")
    public void returnToDashboardAndDeteteProject() {
    }
}



























