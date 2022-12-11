package task.telkom.appium.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import task.telkom.appium.pages.AccountPage;


public class AccountSteps {
    @Autowired
    private AccountPage accountPage;

    @Then("User tap sign in on AccountPage")
    public void userTapSignInOnAccountPage() {
        accountPage.tapSignIn();
    }

    @And("I tap login button on AccountPage")
    public void iTapLoginButtonOnAccountPage() {
        accountPage.tapLogin();
    }

    @And("User will see {string} on AccountPage")
    public void userWillSeeOnAccountPage(String msg) throws InterruptedException {
        accountPage.assertMessage(msg);
    }

    @Then("User insert email with {string}")
    public void userInsertEmailWith(String email) {
        accountPage.insertEmail(email);
    }
}
