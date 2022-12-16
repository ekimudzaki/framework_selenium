package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePageSteps {

//    private HomePage homePage = new HomePage(Hooks.driver);

    @Autowired
    private HomePage homePage;

    @Given("^I open web portalpasti AHM$")
    public void iOpenLoginPage() {
        homePage.verifyFooterText();
    }

    @Given("I fill in {string} as username")
    public void insertUsername(String username) {
        homePage.insertUser(username);
    }

    @Given("I fill in {string} as password")
    public void insertPassword(String pass) {
        homePage.insertPassword(pass);
    }

    @Given("I click login button")
    public void clickLogin() {
        homePage.clickLogin();
    }

    @Given("And I should see {string} text")
    public void assertText(String text) {

    }


}
