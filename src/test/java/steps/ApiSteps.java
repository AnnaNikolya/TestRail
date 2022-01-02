package steps;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.testng.Assert;


public class ApiSteps {
    private String var;
    public String getVar(){
        return var;
}

    @When("sent a request {string}")
    public void sentRequest(String url) {
       var = String.valueOf(RestAssured.given().get(url).statusCode());
    }

    @When("checked the value of the variable equal 200")
    public void checkedTheValueOfTheVariableEqual() {
        Assert.assertEquals("   ", getVar());
    }
}















