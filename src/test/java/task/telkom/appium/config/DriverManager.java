package task.telkom.appium.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class DriverManager {

@Bean
@Scope("cucumber-glue")
public AppiumDriver appiumDriverFactory() throws MalformedURLException {
    UiAutomator2Options caps = new UiAutomator2Options()
            .setDeviceName("Android Emulator")
            .setAppPackage("com.ecommerce.service")
            .setAppActivity("com.ecommerce.service.Activity.SplashActivity")
            .setFullReset(false);
    return new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
}
}
