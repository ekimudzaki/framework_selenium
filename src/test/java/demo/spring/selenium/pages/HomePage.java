package demo.spring.selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomePage {
    @FindBy(xpath = "//*[@id=\"helperLinks\"]/center/div")
    WebElement footer;

    @FindBy(name = "username_login")
    WebElement fieldUsername;

    @FindBy(name = "password_login")
    WebElement fieldPassword;

    @FindBy(xpath = "/html/body/div[1]/div[2]/form/div[4]/button")
    WebElement btnLogin;

    //elemental
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/h3")
    WebElement fileUpload;

    @FindBy(xpath = "//*[@id=\"file-upload\"]")
    WebElement chooseFile;

    @FindBy(xpath = "//*[@id=\"file-submit\"]")
    WebElement btnUpload;

    @FindBy(xpath = "//*[@id=\"uploaded-files\"]")
    WebElement uploadName;

    String fileName = "ch-0-notes.txt";

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyFooterText() {
        Assertions.assertTrue(footer.getText().contains("PT Astra Honda Motor"));
    }

    public void insertUser(String username) {
        fieldUsername.sendKeys(username);
    }

    public void insertPassword(String pass) {
        fieldPassword.sendKeys(pass);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void verifyFileUpload() {
        fileUpload.isDisplayed();
    }

    public void clickChooseFile() {
        chooseFile.sendKeys("C:\\Users\\zeeza\\Documents\\Dokumen Eki\\kode-hive-selenium-framework\\" +fileName);
//        chooseFile.click();
    }

    public void clickUpload() {
        btnUpload.click();
    }

    public void verifyFileAlreadyUploaded() {
        Assertions.assertTrue(uploadName.getText().equalsIgnoreCase(fileName));
    }
}
