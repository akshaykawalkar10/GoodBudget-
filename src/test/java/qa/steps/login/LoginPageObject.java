package qa.steps.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import qa.steps.comman.CommonMethods;

public class LoginPageObject extends CommonMethods {
    @AndroidFindBy(id = "com.dayspringtech.envelopes:id/login")
    private WebElement loginButton;
    @AndroidFindBy(id = "com.dayspringtech.envelopes:id/login_household_name")
    private WebElement emailInputField;
    @AndroidFindBy(id = "com.dayspringtech.envelopes:id/login_password")
    private WebElement passwordInputField;
    @AndroidFindBy(id = "com.dayspringtech.envelopes:id/login_button")
    private WebElement loginButtonToLogin;

    public void clickLoginButton() {
        click(loginButton);
    }
    public void enterUserName(String userNAme) {
        sendKeys(emailInputField, userNAme);
    }
    public void enterPassword(String password) {
        sendKeys(passwordInputField, password);
    }
    public void clickLoginButtonToLogin() {
        click(loginButtonToLogin);
    }
    public String getLoginButtonText()
    {
        return getText(loginButton);
    }
}
