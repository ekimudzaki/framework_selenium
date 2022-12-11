package task.telkom.appium.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.testng.Assert;

@Component
@Scope("cucumber-glue")
public class AccountPage extends BasePage{
    @FindBy(id="fragment_myaccount_tvLoginLogout")
    WebElement btnSignIn;
    @FindBy(id="btn_start_shop")
    WebElement btnLogIn;
    @FindBy(id="snackbar_text")
    WebElement popupMsg;
    @FindBy(id="activity_login_etemailaddress")
    WebElement emailField;

    public AccountPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void tapSignIn() {
        btnSignIn.click();
    }

    public void tapLogin() {
        btnLogIn.click();
    }

    public void assertMessage(String msg) throws InterruptedException {
        Assert.assertEquals(popupMsg.getText(),msg);
    }

    public void insertEmail(String text) {
        emailField.sendKeys(text);
    }
}
