package demo.spring.selenium.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.testng.Assert;

@Component
@Scope("cucumber-glue")
public class SignUpPage {
    @FindBy(css = "input[placeholder='Work email*']")
    WebElement signUpEmail;

    @FindBy(css = "input[placeholder='Password*']")
    WebElement signUpPassword;
    @FindBy(xpath = "//div[@class='strength-bar']")
    WebElement signUpStregthBar;
    @FindBy(xpath = "//*[@id=\"signup\"]/div[3]/div/div[2]/div/div/div[2]/div[2]/div[3]/div/a")
    WebElement signUpButton ;
    @FindBy(css = "input[placeholder='First name*']")
    WebElement fistName ;
    @FindBy(css = "input[placeholder='Last name*']")
    WebElement lastName ;
    @FindBy(css = ".placeholderActive.option-selected")
    WebElement industry ;
    @FindBy(css = "#item-1")
    WebElement selected ;
    @FindBy(css = ".iti__selected-dial-code")
    WebElement prefixNumber ;
    @FindBy(css = "input[placeholder='Phone number*']")
    WebElement phoneNumber ;
    @FindBy(xpath = "//*[@id=\"signup\"]/div[3]/div/div[2]/div/div/div[2]/div[2]/div[5]/div/a")
    WebElement btnStart ;
    @FindBy(css = "div[id='create-new-account-btn'] p[class='button-text paragraph button-large']")
    WebElement btnNewAccount ;
    @FindBy(css = ".button-text.paragraph.button-large")
    WebElement btnResendEmail ;

    boolean btnSignUpstatus;

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void insertEmail(String email){
        signUpEmail.sendKeys(email);
    }
    public void insertPassword(String password){
        signUpPassword.sendKeys(password);
    }
    public void clickSignUpButton(){
        if(btnSignUpstatus) signUpButton.click();
    }
    public void shouldSeePassStrengthMessage(String message) {
        Assert.assertEquals(signUpStregthBar.getText(),message);
    }

    public void verifyMessageAndStatus(String message, String status) {
        Assert.assertEquals(signUpStregthBar.getText(),message);
        if(status.equalsIgnoreCase("disabled")) {
            Assert.assertTrue(hasClass(signUpButton,status));
        }else{
            btnSignUpstatus = true;
        }
    }

    public boolean hasClass(WebElement element,String status){
        String classes = element.getAttribute("class");
        for (String cls: classes.split(" ")) {
            if(cls.equals(status)){
                return true;
            }
        }
        return false;
    }

    public void clickStart(){
        btnStart.click();
    }

    public void insertAllRequiredFields() {
        Faker faker = new Faker();
        fistName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        industry.click();
        selected.click();
        phoneNumber.sendKeys("3065601" + faker.phoneNumber().subscriberNumber(3));
    }

    public void clickCreateNewAccount() {
        btnNewAccount.click();
        verifyEmailPopUp();
    }

    private void verifyEmailPopUp() {
        Assert.assertEquals(btnResendEmail.getText(),"Resend Verification Link");
    }
}