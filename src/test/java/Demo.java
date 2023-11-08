import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Demo {

    AndroidDriver androidDriver;
    public static void main(String[] args) throws MalformedURLException {
        Demo demo=new Demo();
        demo.initiatedAndroidDriver();
        demo.login();
    }
    public void initiatedAndroidDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName","uiautomator2");
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("appium:udid","RZ8M2178WWY");
//        desiredCapabilities.setCapability("appium:appPackage","com.dayspringtech.envelopes");
//        desiredCapabilities.setCapability("appium:appActivity","27ee6f9 u0 com.dayspringtech.envelopes/.FirstTime t1317");
            URL url=new URL("http://0.0.0.0:4723");
         androidDriver=new AndroidDriver(url, desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void login()
    {
        androidDriver.findElement(AppiumBy.id("com.dayspringtech.envelopes:id/login")).click();
        androidDriver.findElement(AppiumBy.id("com.dayspringtech.envelopes:id/login_household_name")).sendKeys("akshay");
        androidDriver.findElement(AppiumBy.id("com.dayspringtech.envelopes:id/login_password")).sendKeys("12345");
        androidDriver.findElement(AppiumBy.id("com.dayspringtech.envelopes:id/login_button")).click();

    }


}
