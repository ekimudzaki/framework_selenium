package task.telkom.appium.stepsdefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import task.telkom.appium.SpringContextConfiguration;

import java.time.Duration;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class Hooks {
    @Autowired
    private AppiumDriver driver;

    @Before
    public void setupDriver() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}
