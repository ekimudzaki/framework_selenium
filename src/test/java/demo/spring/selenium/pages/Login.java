//package demo.spring.selenium.pages;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//public class Login {
//    WebDriver driver;
//
//    @BeforeEach
//    public void prepareBrowser(){
//        //firefox
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//    }
//
//    @AfterEach
//    public void tearDown(){
//        driver.quit();
//    }
//
//    @Test
//    void test() {
//        // Exercise
//        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // Verify page login
//        String getData = driver.findElement(By.xpath("//*[@id=\"helperLinks\"]/center/div")).getText();
//        Assert.assertTrue(getData.contains("PT Astra Honda Motor"));
//
//        //login
//        driver.findElement(By.name("username_login")).sendKeys("userName");
//        driver.findElement(By.name("password_login")).sendKeys("password");
//
//        //click login button
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
//
//        //verify error
//        Assertions.assertEquals(driver.findElement(By.id("error-login")).getText(),"Invalid username / password");
//    }
//
//    @Test
//    void testLogin() {
//        // Exercise
//        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // Verify page login
//        String getData = driver.findElement(By.xpath("//*[@id=\"helperLinks\"]/center/div")).getText();
//        Assertions.assertTrue(getData.contains("PT Astra Honda Motor"));
//
//        //login
//        driver.findElement(By.name("username_login")).sendKeys("m.dummy.i0");
//        driver.findElement(By.name("password_login")).sendKeys("Honda2020!");
//
//        //click login button
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
//
//        //verify error
////        Assert.assertEquals(driver.findElement(By.id("error-login")).getText(),"Invalid username / password");
//
//        //verify after login
//        WebElement homeTab = driver.findElement(By.xpath("/html/body/div[1]/div[5]/ul/li/a"));
//        Assertions.assertEquals(homeTab.getText(),"Home");
//
//    }
//
//    @Test
//    void testSearching() throws InterruptedException {
//        testLogin();
//
//        // searching
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/input")).sendKeys("scp002");
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/button")).click();
//
//        //click Menu
//        driver.findElement(By.xpath("//*[@id=\"ahmdsh1_menu_ul\"]/li[14]/ul/li[1]/ul/li[1]/a/div")).click();
//        driver.findElement(By.xpath("//*[@id=\"tablink_AHMFASCP002\"]/a[1]")).isDisplayed();
//
//
//        //insert date 01-Sep-2020
//        driver.findElement(By.id("AHMFASCP002_P01_FilterTransferDateStart")).click();
//        driver.findElement(By.id("AHMFASCP002_P01_FilterTransferDateStart")).sendKeys("01-Sep-2020");
//
//        driver.findElement(By.xpath("//*[@id=\"AHMFASCP002_P01_PageMain\"]/div/div[1]/div[3]/div/button[1]")).click();
//
//        //check invisibility
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        WebElement loading = driver.findElement(By.xpath("//*[@id=\"AHMFASCP002_P00ViewTableContainer\"]/div[1]/div[2]/div[2]/div"));
//        wait.until(ExpectedConditions.invisibilityOf(loading));
//
//        WebElement totalDisc = driver.findElement(By.xpath("//*[@id=\"ahmfascp002_TableMonitoring\"]/tbody/tr[1]/td[19]"));
//        totalDisc.isDisplayed();
//        Assertions.assertEquals(totalDisc.getText(),"170,000");
//
//        System.out.println(totalDisc.getCssValue("text-align"));
//
//
//        Thread.sleep(Long.parseLong("10000"));
//
//
//    }
//}
