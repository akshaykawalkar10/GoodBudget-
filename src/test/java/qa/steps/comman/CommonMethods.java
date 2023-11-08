package qa.steps.comman;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.AppiumDriverManger;
public class CommonMethods {
private AppiumDriverManger driverManger;

public CommonMethods()
{
	driverManger=new AppiumDriverManger();
	PageFactory.initElements(new AppiumFieldDecorator(driverManger.getAppiumDriver()), this);
}

public void sendKeys(WebElement element, String text) {
	element.clear();
	element.sendKeys(text);
}

public void click(WebElement element) {
	element.click();
}
public String getText(WebElement element)
{
	return element.getText();
}

}
