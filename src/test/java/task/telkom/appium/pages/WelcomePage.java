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
public class WelcomePage extends BasePage{

    @FindBy(id = "fragment_home_indicator")
    WebElement sliderIndicator;

    @FindBy(id = "activity_welcome_one_tvTitle")
    WebElement textTitle;

    @FindBy(id = "activity_welcome_one_tvDes")
    WebElement textSubTitle;

    @FindBy(id = "btn_start_shop")
    WebElement btnStart;

    public WelcomePage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void assertWelcomePage() {
        Assert.assertEquals(textTitle.getText(),"THE \n" +
                "STYLE \n" +
                "YOU \n" +
                "LOVE");
        Assert.assertEquals(textSubTitle.getText(),"Clothing");
        sliderIndicator.isDisplayed();
    }

    public void swipeRight(Integer counter) {
        for (int i = 0; i < counter ; i++) {
            swipe();
        }
    }

    public void clickOnText(String text) {
        Assert.assertEquals(btnStart.getText(),text);
        btnStart.click();
    }
}
