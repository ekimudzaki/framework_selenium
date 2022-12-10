package task.telkom.appium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            glue = "task/telkom/appium/stepsdefinitions",
            features = "src/test/resources/features")
    public class CucumberRunner extends AbstractTestNGCucumberTests {
    }

