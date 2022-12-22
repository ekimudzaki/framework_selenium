package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

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


    @Given("I open upload page")
    public void iOpenUploadPage() {
        homePage.verifyFileUpload();
    }

    @When("I choose file")
    public void iChooseFile() {
        homePage.clickChooseFile();
    }

    @Then("I click upload")
    public void iClickUpload() {
        homePage.clickUpload();
    }

    @And("I should see file")
    public void iShouldSeeFile() {
        homePage.verifyFileAlreadyUploaded();
    }
}
