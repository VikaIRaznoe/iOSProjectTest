package pages;

import org.openqa.selenium.By;
import static general.GeneralMethods.waitElementPresent;

public class MainPage {

    By mainScreenTitle = By.id("MainScreenTitle");
    By elementPhoneField = By.id("phoneTextField");
    By elementPasswordField = By.id("passwordTextField");
    By elementSignInButton = By.id("elementSignInButton");
    By elementFive = By.name("пять");
    By elementBackButton = By.id("backButton");

//    private final static String phone = "+7 903 678 35 12";
//    private final static String password = "password";

    public void vvodTelephone(String phone){
        waitElementPresent(elementPhoneField,5).click();
        waitElementPresent(elementPhoneField,5).sendKeys(phone);
    }

    public void vvodPassword(String password){
        waitElementPresent(elementPasswordField,5).click();
        waitElementPresent(elementPasswordField,5).sendKeys(password);
    }

    public void clickSignInButton(){
        waitElementPresent(elementSignInButton,5).click();
    }

    public void clickElementByNameFive(){
        waitElementPresent(elementFive,5).click();
    }

    public void clickBackButton(){
        waitElementPresent(elementBackButton,5).click();
    }

}
