package task.telkom.appium.stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import task.telkom.appium.pages.WelcomePage;

public class WelcomeSteps {
    @Autowired
    private WelcomePage welcomePage;

    @Given("^I open App$")
    public void openApp() {
        welcomePage.assertWelcomePage();
    }

    @Then("I slide it {int} times")
    public void iSlideItTimes(Integer counter) {
        welcomePage.swipeRight(counter);
    }

    @Then("I click {string} button")
    public void iClickButton(String text) {
        welcomePage.clickOnText(text);
    }
}
