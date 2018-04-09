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

    // Access URL from chrome
    private static WebDriver driver = BrowserFactory.startbrowser("Chrome", "http://amw1v2localfleet1.stage.spireon.com");
    private NavBarTab navBarTab = PageFactory.initElements(driver, NavBarTab.class);
    private AlertsPage alertsPage = PageFactory.initElements(driver, AlertsPage.class);


    @BeforeTest
    public void loginPage() {
        // Page Object created using Page Factory
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        // Calling the method using object and calling method
        loginPage.loginOperation();
    }

    @Test
    public void verification() {

        // Validation of icons in Navigation Bar tab
        assertTrue(navBarTab.getMap().isDisplayed(), "Map icon is not present");
        assertTrue(navBarTab.getDashBoard().isDisplayed(), "Dashboard icon is not present");
        assertTrue(navBarTab.getAlerts().isDisplayed(), "Alerts icon is not present");
        assertTrue(navBarTab.getReports().isDisplayed(), "Reports icon is not present");
        assertTrue(navBarTab.getAdmin().isDisplayed(), "Admin icon is not present");
        assertTrue(navBarTab.getCompliance().isDisplayed(), "Compliance icon is not present");

        // Validation of logo
        assertTrue(navBarTab.getLogo().isDisplayed(), "Logo is not Present");

        // Validation of username
        assertTrue(navBarTab.getUsername().isDisplayed(), "Username is not displayed");
    }

    @Test
    public void alertsTab() {

        // Click on alerts icon
        navBarTab.getAlerts().click();

        // Validation of elements under vehicle alerts tab
        Assert.assertTrue(alertsPage.getVehicleAlerts().isDisplayed(), "Vehicle alerts is not present");
        assertTrue(alertsPage.getDevicePowerDisconnectAlert().isDisplayed(), "Device Power disconnect is not present");
        assertTrue(alertsPage.getHardBreakingAccelerationAlert().isDisplayed(), "Hard braking is not present");
        assertTrue(alertsPage.getIdleAlert().isDisplayed(), "Idle alerts is not present");
        assertTrue(alertsPage.getInput().isDisplayed(), "Input alerts is not present");
        assertTrue(alertsPage.getLandmarkArrivalDepartureAlert().isDisplayed(), "Landmark Arr&Dep alert is not present");
        assertTrue(alertsPage.getLowBatteryAlert().isDisplayed(), "Low battery alert is not present");
        assertTrue(alertsPage.getMaintenanceAlertDistance().isDisplayed(), "Maintenance Distance is not present");
        assertTrue(alertsPage.getMaintenanceAlertEngine().isDisplayed(), "Maintenance Engine is not present");
        assertTrue(alertsPage.getMaintenanceAlertTime().isDisplayed(), "Maintenance Time is not present");
        assertTrue(alertsPage.getOddHoursAlert().isDisplayed(), "Odd hours alert is not present");
        assertTrue(alertsPage.getPowerReconnectAlert().isDisplayed(), "Power Reconnect is not present");
        assertTrue(alertsPage.getSpeedLimitAlert().isDisplayed(), "Speed Limit is not present");
        assertTrue(alertsPage.getSpeedThresholdAlert().isDisplayed(), "Speed Threshold limit is not present");
        assertTrue(alertsPage.getStopAlert().isDisplayed(), "Stop Alert is not present");
        assertTrue(alertsPage.getTemperatureAlert().isDisplayed(), "Temp Alert is not present");

        // Validation of elements under driver alerts tab
        alertsPage.clickDriverAlerts();
        assertTrue(alertsPage.getDriverAlerts().isDisplayed(), "Driver alerts is not present");
        assertTrue(alertsPage.getHardBrakingAccelerationAlertDriver().isDisplayed(), "Hard braking driver alerts is not present");
        assertTrue(alertsPage.getIdleAlertDriver().isDisplayed(), "Idle driver alerts is not present");
        assertTrue(alertsPage.getInputAlertDriver().isDisplayed(), "Input alerts driver is not present");
        assertTrue(alertsPage.getLandmarkArrivalDepartureAlertDriver().isDisplayed(), "Landmark Arrival Dep Driver is not present");
        assertTrue(alertsPage.getOddHoursAlertDriver().isDisplayed(), "Odd hours alert driver is not present");
        assertTrue(alertsPage.getSpeedLimitAlertDriver().isDisplayed(), "Speed limit alert driver is not present");
        assertTrue(alertsPage.getSpeedThresholdAlertDriver().isDisplayed(), "Speed Threshold Alert Driver is not present");
        assertTrue(alertsPage.getStopAlertDriver().isDisplayed(), "Stop alerts driver is not present");

        // Validation of elements under alert history tab
        alertsPage.clickAlertHistory();
        assertTrue(alertsPage.getAlertHistory().isDisplayed(), "Alert History is not present");
        assertTrue(alertsPage.getDateTime().isDisplayed(), "DateTime is not present");
        assertTrue(alertsPage.getAlertTypeInAlertHistory().isDisplayed(), "Alert type not present");
        assertTrue(alertsPage.getLocationInAlertHistory().isDisplayed(), "Location is not present");
        assertTrue(alertsPage.getDetailsInAlertHistory().isDisplayed(), "Details is not present");

        // Validation of elements under saved alerts tab
        alertsPage.clickSavedAlerts();
        assertTrue(alertsPage.getSavedAlerts().isDisplayed(), "Saved alerts is not present");
        assertTrue(alertsPage.getNameInSavedAlerts().isDisplayed(), "Name is not present");
        assertTrue(alertsPage.getDateCreatedInSavedAlerts().isDisplayed(), "Date created is not present");
        assertTrue(alertsPage.getRecipientsInSavedAlerts().isDisplayed(), "Recipients is not present");
        assertTrue(alertsPage.getViewButtonInSavedAlerts().isDisplayed(), "View is not present");

        // validation of logout button
        assertTrue(navBarTab.getlogout().isDisplayed(), "Logout button not present");
    }

    @Test
    public void checkTabs() {
        navBarTab.getAlerts().click();
        alertsPage.vehicleAlertsColumnExists();
        alertsPage.clickDriverAlerts();
        alertsPage.driverAlertsColumnExists();
        alertsPage.alertHistoryColumnExists();
        alertsPage.clickSavedAlerts();
        alertsPage.savedAlertsColumnExists();
    }

        // logout from website
    @AfterTest
    public void logout() {
        navBarTab.logout();
        driver.quit();
    }
}