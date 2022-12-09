package task.telkom.appium.stepsdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    public static AndroidDriver driver;

    @Before
    public void setupDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel XL API 30");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("appPackage", "com.ecommerce.service");
        caps.setCapability("appActivity", "com.ecommerce.service.Activity.WelcomeActivity");
        caps.setCapability("noReset", "false");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}
