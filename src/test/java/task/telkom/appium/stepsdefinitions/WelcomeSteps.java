package task.telkom.appium.stepsdefinitions;

import io.cucumber.java.en.Given;
import task.telkom.appium.pages.WelcomePage;

public class WelcomeSteps {
    private WelcomePage welcomePage = new WelcomePage(Hooks.driver);

    @Given("^I open App$")
    public void openApp(){
        welcomePage.assertSlide();
    }
}
