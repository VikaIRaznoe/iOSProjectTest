package test;

import general.DriverManager;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private File app = new File("src/test/resources/QALection.zip");

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.4");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability("app",app.getAbsolutePath());
        caps.setCapability("useNewWDA", false);

        URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
        DriverManager.initializeDriver(appiumURL, caps);
    }
    @AfterClass
    public void  tearDown() {
        DriverManager.getDriver().quit();
    }
}
