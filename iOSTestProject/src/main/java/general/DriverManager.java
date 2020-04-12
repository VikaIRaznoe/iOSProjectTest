package general;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverManager {
    private static IOSDriver<IOSElement> driver;

    public static IOSDriver<IOSElement> getDriver(){
        return driver;
    }

    public static void initializeDriver(URL url, DesiredCapabilities capabilities){
        driver = new IOSDriver<IOSElement>(url, capabilities);
    }
}
