package demo.spring.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class WebDriverManager {
    @Bean
    @Scope("cucumber-glue")
    public WebDriver webDriverFactory() throws MalformedURLException {
//        return new FirefoxDriver();
//        final String DOCKER_HOST = "http://127.0.0.1";
//        final String SELENIUM_PORT = "4444";
//        String remote = String.format("%s:%s/wd/hub", DOCKER_HOST, SELENIUM_PORT);
        final String DOCKER_HOST = "http://localhost:4444";
        String remote = String.format("%s/wd/hub", DOCKER_HOST);
        return new RemoteWebDriver(new URL(remote), new ChromeOptions());
    }
}
