package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBarTab {

    @FindBy(css = "span#mapCardButton-btnInnerEl")
    private WebElement mapButton;

    @FindBy(id = "dashboardCardButton")
    private WebElement dashboardButton;

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

    public WebElement getMap() {
        return mapButton;
    }

    public WebElement getDashBoard() {
        return dashboardButton;
    }

    public WebElement getAlerts() {
        return alertsButton;
    }

    public WebElement getReports() {
        return reportsButton;
    }

    public WebElement getAdmin() {
        return adminButton;
    }

    public WebElement getCompliance() {
        return eldButton;
    }

    public WebElement getLogo() {
        return logo;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getlogout() {
        return logout;
    }

    public void logout() {
        logout.click();
    }
}