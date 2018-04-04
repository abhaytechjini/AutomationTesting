package Tests;

import BrowserFactory.BrowserFactory;
import PageObjects.AlertsPage;
import PageObjects.LoginPage;
import PageObjects.NavBarTab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class TestClass {

    private static WebDriver driver = BrowserFactory.startbrowser("Chrome", "http://amw1v2localfleet1.stage.spireon.com");

    @BeforeTest
    public void loginPage() {
        // Page Object created using Page Factory
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        // Calling the method using object and passing specific login ID and password values
        loginPage.loginOperation("hychiu3@spireon.com", "123456");
    }


    @Test
    public void verification() {

        // This set of codes is used to check whether icons are present on the Navigation tab in the page
        NavBarTab checkIcons = PageFactory.initElements(driver, NavBarTab.class);

        assertTrue(checkIcons.map().isDisplayed(), "Map icon is not present");
        assertTrue(checkIcons.dashBoard().isDisplayed(), "Dashboard icon is not present");
        assertTrue(checkIcons.alerts().isDisplayed(), "Alerts icon is not present");
        assertTrue(checkIcons.reports().isDisplayed(), "Reports icon is not present");
        assertTrue(checkIcons.admin().isDisplayed(), "Admin icon is not present");
        assertTrue(checkIcons.compliance().isDisplayed(), "Compliance Tab is not present");


        // This set of code is used to check whether Logo is present or not
        NavBarTab checkLogo = PageFactory.initElements(driver, NavBarTab.class);
        assertTrue(checkLogo.getLogo().isDisplayed(), "Logo is not Present");

        // This set of code is used to check whether username is displayed or not
        NavBarTab checkUserName = PageFactory.initElements(driver, NavBarTab.class);
        assertTrue(checkUserName.checkUsr().isDisplayed(), "Username is not displayed");

    }


    @Test
    public void checkAlertsTab() {

        NavBarTab alertsicon = PageFactory.initElements(driver, NavBarTab.class);
        alertsicon.alerts().click();

        AlertsPage alertTabObjects = PageFactory.initElements(driver, AlertsPage.class);

        // This set of codes is used to check the presence of all the elements under vehicle alerts tab
        Assert.assertTrue(alertTabObjects.vehicleAlerts().isDisplayed(), "Vehicle alerts is not present");
        assertTrue(alertTabObjects.devicePowerDisconnectAlert().isDisplayed(), "Device Power disconnect is not present");
        assertTrue(alertTabObjects.hardBreakingAccelerationAlert().isDisplayed(), "Hard braking is not present");
        assertTrue(alertTabObjects.idleAlert().isDisplayed(), "Idle alerts is not present");
        assertTrue(alertTabObjects.input().isDisplayed(), "Input alerts is not present");
        assertTrue(alertTabObjects.landmarkArrivalDepartureAlert().isDisplayed(), "Landmark Arr&Dep alert is not present");
        assertTrue(alertTabObjects.lowBatteryAlert().isDisplayed(), "Low battery alert is not present");
        assertTrue(alertTabObjects.maintenanceAlertDistance().isDisplayed(), "Maintenance Distance is not present");
        assertTrue(alertTabObjects.maintenanceAlertEngine().isDisplayed(), "Maintenance Engine is not present");
        assertTrue(alertTabObjects.maintenanceAlertTime().isDisplayed(), "Maintenance Time is not present");
        assertTrue(alertTabObjects.oddHoursAlert().isDisplayed(), "Odd hours alert is not present");
        assertTrue(alertTabObjects.powerReconnectAlert().isDisplayed(), "Power Reconnect is not present");
        assertTrue(alertTabObjects.speedLimitAlert().isDisplayed(), "Speed Limit is not present");
        assertTrue(alertTabObjects.speedThresholdAlert().isDisplayed(), "Speed Threshold limit is not present");
        assertTrue(alertTabObjects.stopAlert().isDisplayed(), "Stop Alert is not present");
        assertTrue(alertTabObjects.temperatureAlert().isDisplayed(), "Temp Alert is not present");


        // This set of codes is used to check the presence of all the elements under driver alerts tab
        alertTabObjects.clickDriverAlerts();
        assertTrue(alertTabObjects.driverAlerts().isDisplayed(), "Driver alerts is not present");
        assertTrue(alertTabObjects.hardBrakingAccelerationAlertDriver().isDisplayed(), "Hard braking driver alerts is not present");
        assertTrue(alertTabObjects.idleAlertDriver().isDisplayed(), "Idle driver alerts is not present");
        assertTrue(alertTabObjects.inputAlertDriver().isDisplayed(), "Input alerts driver is not present");
        assertTrue(alertTabObjects.landmarkArrivalDepartureAlertDriver().isDisplayed(), "Landmark Arrival Dep Driver is not present");
        assertTrue(alertTabObjects.oddHoursAlertDriver().isDisplayed(), "Odd hours alert driver is not present");
        assertTrue(alertTabObjects.speedLimitAlertDriver().isDisplayed(), "Speed limit alert driver is not present");
        assertTrue(alertTabObjects.speedThresholdAlertDriver().isDisplayed(), "Speed Threshold Alert Driver is not present");
        assertTrue(alertTabObjects.stopAlertDriver().isDisplayed(), "Stop alerts driver is not present");


        // This set of codes is used to check the presence of all the elements under alert history tab
        alertTabObjects.clickAlertHistory();
        assertTrue(alertTabObjects.alertHistory().isDisplayed(), "Alert History is not present");
        assertTrue(alertTabObjects.dateTime().isDisplayed(), "DateTime is not present");
        assertTrue(alertTabObjects.alertTypeInAlertHistory().isDisplayed(), "Alert type not present");
        assertTrue(alertTabObjects.nameInAlertHistory().isDisplayed(), "Name is not present");
        assertTrue(alertTabObjects.vehicleInAlertHistory().isDisplayed(), "Vehicle tab is not present");
        assertTrue(alertTabObjects.locationInAlertHistory().isDisplayed(), "Location is not present");
        assertTrue(alertTabObjects.detailsInAlertHistory().isDisplayed(), "Details is not present");


        // This set of codes is used to check the presence of all the elements under saved alerts tab
        alertTabObjects.clickSavedAlerts();
        assertTrue(alertTabObjects.savedAlerts().isDisplayed(), "Saved alerts is not present");
        assertTrue(alertTabObjects.nameInSavedAlerts().isDisplayed(), "Name is not present");
        assertTrue(alertTabObjects.dateCreatedInSavedAlerts().isDisplayed(), "Date created is not present");
        assertTrue(alertTabObjects.recipientsInSavedAlerts().isDisplayed(), "Recipients is not present");
        assertTrue(alertTabObjects.viewButtonInSavedAlerts().isDisplayed(), "View is not present");

    }


    // This set of codes is used to Logout from the website.
    @AfterTest
    public void logoutFromWebsite() {
        NavBarTab checkLogout = PageFactory.initElements(driver, NavBarTab.class);
        assertTrue(checkLogout.logout().isDisplayed(), "Logout button is not displayed");
        checkLogout.logoutOfWebsite();
        driver.close();
        driver.quit();
    }
}