package task.telkom.appium.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;
import java.util.Arrays;

public class BasePage {
    @Autowired
    private AppiumDriver driver;

    public Dimension getDimension(){
        return driver.manage().window().getSize();
    }

    public void swipe(){

        int x = (int) (getDimension().getWidth() * 0.9);
        int y = getDimension().getHeight()/2;
        Point source = new Point(x,y);
        Point target = new Point(0,y);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swiping = new Sequence(finger,1);
        swiping.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        swiping.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swiping.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), target.x, target.y));
        swiping.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swiping));
    }
}
