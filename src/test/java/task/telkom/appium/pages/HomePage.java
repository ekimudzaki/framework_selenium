package task.telkom.appium.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomePage extends BasePage {
    @FindBy(id="fragment_home_tlHome")
    WebElement homeMenu;

    public HomePage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void assertHome() {
        homeMenu.isDisplayed();
    }

    public void clickOn(String textMenu) {
        clickOnText(textMenu);
    }
}
