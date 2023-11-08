package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.time.Duration;

public class AppiumDriverManger {
private static ThreadLocal<AppiumDriver> appiumDriver=new ThreadLocal<>();

private static void setAppiumDriver(AppiumDriver appiumDriver1)
{
	appiumDriver.set(appiumDriver1);
}
public AppiumDriver getAppiumDriver()
{
	appiumDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	return appiumDriver.get();
}

public void initialiseDriver() {
	ServerManager serverManager=new ServerManager();
	CapabilityManager capabilityManager=new CapabilityManager();
		setAppiumDriver(new AndroidDriver(serverManager.getServer().getUrl(), capabilityManager.getCapability()));}
}
