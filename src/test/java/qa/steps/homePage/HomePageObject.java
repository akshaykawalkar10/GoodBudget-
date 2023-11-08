package qa.steps.homePage;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import qa.steps.comman.CommonMethods;

public class HomePageObject extends CommonMethods {
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(0)")
    private WebElement userName;
    @AndroidFindBy(accessibility = "More options")
    private WebElement settingsIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RelativeLayout\").instance(4)")
    private WebElement settings;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/title\").instance(3)")
    private WebElement logoutButton;
    @AndroidFindBy(id = "android:id/button1")
    private WebElement logoutOkButton;
    public String getUserName()
    {
      return  getText(userName);
    }
    public void clickSettingsIcon()
    {
        click(settingsIcon);
    }
    public void clickSettingsButton()
    {
        click(settings);
    }
    public void clickLogoutButton()
    {
        click(logoutButton);
    }
    public void clickLogoutOkButton()
    {
        click(logoutOkButton);
    }
}
