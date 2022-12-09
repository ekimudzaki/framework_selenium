package task.telkom.appium.stepsdefinitions;

import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import task.telkom.appium.pages.HomePage;

public class HomePageSteps {
    @Autowired
    HomePage homePage;

    @Then("I see HomePage")
    public void i_see_home_page() {
        homePage.assertHome();
    }

}
