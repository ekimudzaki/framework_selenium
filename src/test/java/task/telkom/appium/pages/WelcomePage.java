package task.telkom.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    @AndroidFindBy(id="fragment_home_indicator")
    private WebElement sliderIndicator;

    public WelcomePage(AndroidDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void assertSlide(){
        sliderIndicator.isDisplayed();
    }
}
