package qa.steps.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.steps.login.LoginPageObject;

public class HomePageSteps extends HomePageObject {
    LoginPageObject loginPageObject;
    public HomePageSteps()
    {
        loginPageObject=new LoginPageObject();
    }
    @Then("I should verify user name as {string}")
    public void iShouldVerifyUserNameAs(String arg0) {
        System.out.println("Actual :-"+arg0);
        Assert.assertEquals(arg0,getUserName());
    }
    @Given("I tap on settings icon")
    public void iTapOnSettingsIcon() {
        clickSettingsIcon();
    }
    @And("I tap on the settings button")
    public void iTapOnTheSettingsButton() {
        clickSettingsButton();
    }
    @When("I tap on the logout button")
    public void iTapOnTheLogoutButton() {
        clickLogoutButton();
    }
    @And("I tap on the ok button")
    public void iTapOnTheOkButton() {
        clickLogoutOkButton();
    }
    @Then("I should verify login button")
    public void iShouldVerifyLoginButton() {
        String loginText=loginPageObject.getLoginButtonText();
        Assert.assertEquals("LOG IN",loginText);
    }
}
