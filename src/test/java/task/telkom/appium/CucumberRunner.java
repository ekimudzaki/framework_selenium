package task.telkom.appium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            glue = "task/telkom/appium/stepsdefinitions",
            features = "src/test/resources/features",
            plugin = {
                "pretty",
                "html:build/test-results/html-report.html",
                "json:build/test-results/json-report.json"
            })
    public class CucumberRunner extends AbstractTestNGCucumberTests {
    }

