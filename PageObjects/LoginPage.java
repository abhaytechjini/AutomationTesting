package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

    private static WebDriver driver;

    @FindBy(id = "username")
    private WebElement username;


    @FindBy(id = "password")
    private WebElement password;


    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void LoginPage(WebDriver Mydriver) {
        this.driver = Mydriver;
    }


    public void loginOperation(String uid, String pass) {
        username.sendKeys(uid);
        password.sendKeys(pass);
        loginButton.click();

    }
}