package task.telkom.appium.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class DriverManager {

    @Autowired private ConfigProperties properties;

@Bean
@Scope("cucumber-glue")
public AppiumDriver appiumDriverFactory() throws MalformedURLException {
    UiAutomator2Options caps = new UiAutomator2Options()
            .setDeviceName(properties.getDeviceName())
            .setAppPackage(properties.getAppPackage())
            .setAppActivity(properties.getAppActivity())
            .setFullReset(Boolean.parseBoolean(properties.getFullReset()))
            .setNoReset(Boolean.parseBoolean(properties.getNoReset()))
            .eventTimings();
    return new AppiumDriver(new URL(properties.getAppiumURL()),caps);
}
}
