package qa.steps.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps extends LoginPageObject{
    @Given("I launch the app")
    public void I_launch_the_app() {
        System.out.println("App is launch");
    }

    @And("I tap on the login button")
    public void iTapOnTheButton() {
        clickLoginButton();
    }

    @And("I enter the {string} in the email field")
    public void iEnterTheInTheFieldEmail(String arg0) {
        enterUserName(arg0);
    }

    @And("I enter the {string} in the password field")
    public void iEnterTheInTheFieldPassword(String arg0) {
        enterPassword(arg0);
    }

    @When("I tap on the loginTo button")
    public void iTapOnTheLoginToButton() {
        clickLoginButtonToLogin();
    }
}
