package test;

import org.testng.annotations.*;
import pages.MainPage;
import java.io.File;

public class FirstTest extends BaseTest{

    private final static File app = new File("src/test/resources/QALection.zip");

    MainPage mainPage = new MainPage();

    @Test(priority = 1)
    public void testOne() {
        mainPage.vvodTelephone("+7 903 678 35 12");
        mainPage.vvodPassword("password");
        mainPage.clickSignInButton();
    }

    @Test(priority = 2)
    public void testTwo() {
        mainPage.clickElementByNameFive();
        mainPage.clickBackButton();
    }
}