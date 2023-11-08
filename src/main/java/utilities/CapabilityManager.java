package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityManager {

    public DesiredCapabilities getCapability() {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:automationName","uiautomator2");
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("appium:udid","RZ8M2178WWY");
        desiredCapabilities.setCapability("appium:appPackage","com.dayspringtech.envelopes");
        desiredCapabilities.setCapability("appium:appActivity","27ee6f9 u0 com.dayspringtech.envelopes/.FirstTime t1317");
        return desiredCapabilities;

    }
}
