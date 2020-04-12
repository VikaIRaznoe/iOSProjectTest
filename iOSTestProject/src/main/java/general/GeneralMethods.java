package general;

import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralMethods extends DriverManager {

    public static IOSElement waitElementPresent(By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), timeoutInSeconds);
        return (IOSElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }
}
