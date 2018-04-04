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

    public void loginOperation() {
        username.sendKeys("hychiu3@spireon.com");
        password.sendKeys("123456");
        loginButton.click();

    }
}