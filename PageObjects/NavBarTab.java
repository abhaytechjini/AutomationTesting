package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NavBarTab {

    @FindBy(css = "span#mapCardButton-btnInnerEl")
    private WebElement mapButton;

    @FindBy(id = "dashboardCardButton")
    private WebElement dashBoardButton;

    @FindBy(id = "reportsCardButton")
    private WebElement reportsButton;

    @FindBy(id = "adminCardButton")
    private WebElement adminButton;

    @FindBy(id = "eldCardButton")
    private WebElement eldButton;

    @FindBy(css = "div#card-menu-targetEl div:nth-child(1) > img")
    private WebElement logo;

    @FindBy(css = "div#ui_header_user_identity span")
    private WebElement username;

    @FindBy(css = "div#ui_header_user_actions span:nth-child(2) > a")
    private WebElement logout;

    @FindBy(id = "alertsCardButton")
    private WebElement alertsButton;


    public NavBarTab() {
    }

    public WebElement map() {
        return mapButton;
    }

    public WebElement dashBoard() {
        return dashBoardButton;
    }

    public WebElement alerts() {
        return alertsButton;
    }

    public WebElement reports() {
        return reportsButton;
    }

    public WebElement admin() {
        return adminButton;
    }

    public WebElement compliance() {
        return eldButton;
    }

    public WebElement getLogo() {
        return logo;
    }

    public WebElement checkUsr() {
        return username;
    }


    public WebElement logout() {
        return logout;
    }

    public void logoutOfWebsite() {
        logout.click();
    }
}