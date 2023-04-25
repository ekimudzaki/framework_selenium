package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class SignUpStepsDef {
    @Autowired
    private SignUpPage signUpPage;

    @Given("user open sign up page")
    public void userOpenSignUpPage() {

    }

    @And("user insert {}")
    public void userInsertEmail(String email) {
        signUpPage.insertEmail(email);
    }

    @Then("user should be able to click sign up")
    public void userShouldBeAbleToClickSignUp() {
        signUpPage.clickSignUpButton();
    }

    @And("user should see {} on strength bar")
    public void userShouldSeeOnStrengthBar(String message) {
        signUpPage.shouldSeePassStrengthMessage(message);
    }

    @Then("user fill in {}")
    public void userFill(String pass) {
        signUpPage.insertPassword(pass);
    }

    @And("user should see {} on strength bar and verify sign up button is {}")
    public void userShouldSeeOnStrengthBarAndVerifySignUpButtonIs(String message, String btnStatus) {
        signUpPage.verifyMessageAndStatus(message,btnStatus);
    }

    @Then("user click on start using autobahn button")
    public void userClickOnStartUsingAutobahnButton() {
        signUpPage.clickStart();
    }

    @And("user input all required fields")
    public void userInputAllRequiredFields() {
        signUpPage.insertAllRequiredFields();
    }
}
