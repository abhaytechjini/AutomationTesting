package PageObjects;

import Enum.AlertHistoryColumn;
import Enum.DriverAlertsColumn;
import Enum.SavedAlertsColumn;
import Enum.VehicleAlertsColumn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertsPage {

    private static WebDriver driver;

    @FindBy(css = "div#alertControl  div:nth-child(1)> em > button > span.x-tab-inner")
    private WebElement vehicleAlerts;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(1) > table > tbody > tr > td > span")
    private WebElement devicePowerDisconnectAlert;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(2) > table > tbody > tr > td > span")
    private WebElement hardBrakingAndAccelerationAlert;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(3) > table > tbody > tr > td > span")
    private WebElement idleAlert;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(4) > table > tbody > tr > td > span")
    private WebElement input;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(5) > table > tbody > tr > td > span")
    private WebElement landmarkArrivalDepatureAlert;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(6) > table > tbody > tr > td > span")
    private WebElement lowBatteryAlert;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(7) > table > tbody > tr > td > span")
    private WebElement maintainanceAlertDistance;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div:nth-child(8) > table > tbody > tr > td > span")
    private WebElement maintainanceAlertEngine;

    @FindBy(css = "div#alertControl div:nth-child(9) > table > tbody > tr > td")
    private WebElement maintainanceAlertTime;

    @FindBy(css = "div#alertControl div:nth-child(10) > table > tbody > tr > td")
    private WebElement oddHoursAlert;

    @FindBy(css = "div#alertControl div:nth-child(11) > table > tbody > tr > td > span")
    private WebElement powerReconnectAlert;

    @FindBy(css = "div#alertControl div:nth-child(12) > table > tbody > tr > td > span")
    private WebElement speedLimitAlert;

    @FindBy(css = "div#alertControl div:nth-child(13) > table > tbody > tr > td")
    private WebElement speedThresholdAlert;

    @FindBy(css = "div#alertControl div:nth-child(14) > table > tbody > tr > td > span")
    private WebElement stopAlert;

    @FindBy(css = "div#alertControl div:nth-child(15) > table > tbody > tr > td > span")
    private WebElement temperatureAlert;

    @FindBy(css = "div#alertControl div:nth-child(16) > table > tbody > tr > td")
    private WebElement unauthorisedMovementAlert;

    @FindBy(css = "div#alertControl  div:nth-child(2)> em > button > span.x-tab-inner")
    private WebElement driverAlerts;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(1) > table > tbody > tr > td > span")
    private WebElement hardBrakingAccelerationAlertDriver;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(2) > table > tbody > tr > td")
    private WebElement idleAlertDriver;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(3) > table > tbody > tr > td > span")
    private WebElement inputAlertDriver;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(4) > table > tbody > tr > td")
    private WebElement landmarkArrivalDepartureAlertDriver;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(5) > table > tbody > tr > td > span")
    private WebElement oddHoursAlertDriver;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(6) > table > tbody > tr > td")
    private WebElement speedLimitAlertDriver;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(7) > table > tbody > tr > td > span")
    private WebElement speedThresholdAlertDriver;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div:nth-child(8) > table > tbody > tr > td > span")
    private WebElement stopAlertDriver;

    @FindBy(css = "button#tab-1465-btnEl")
    private WebElement alertHistory;

    @FindBy(css = "span#gridcolumn-1442-textEl")
    private WebElement dateTime;

    @FindBy(css = "div#eventsGridPanel div:nth-child(2) > div.x-column-header-inner > span")
    private WebElement alertTypeInAlertHistory;

    @FindBy(css = "div#eventsGridPanel div:nth-child(5) > div.x-column-header-inner")
    private WebElement locationInAlertHistory;

    @FindBy(css = "div#eventsGridPanel div.x-unselectable.x-column-header-align-left.x-box-item.x-column-header.x-unselectable-default.x-column-header-last > div.x-column-header-inner > span")
    private WebElement detailsInAlertHistory;

    @FindBy(css = "button#tab-1466-btnEl")
    private WebElement savedAlerts;

    @FindBy(css = "span#gridcolumn-1461-textEl")
    private WebElement nameInSavedAlerts;

    @FindBy(css = "span#gridcolumn-1463-textEl")
    private WebElement dateCreatedInSavedAlerts;

    @FindBy(css = "span#gridcolumn-1464-textEl")
    private WebElement recipientsInSavedAlerts;

    @FindBy(css = "span#button-1460-btnInnerEl")
    private WebElement viewButtonInSavedAlerts;

    @FindBy(css = "div#alertControl div:nth-child(1) > div > div> table > tbody > tr > td > span")
    private List<WebElement> vehicleAlertsList;

    @FindBy(css = "div#alertControl div:nth-child(2) > div > div> table > tbody > tr > td > span")
    private List<WebElement> driverAlertsList;

    @FindBy(css = "tab-1465-btnInnerEl")
    private List<WebElement> alertHistoryTabs;

    @FindBy(css = "tab-1466-btnInnerEl")
    private List<WebElement> savedAlertsTabs;


    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVehicleAlerts() {
        return vehicleAlerts;
    }

    public WebElement getDevicePowerDisconnectAlert() {
        return devicePowerDisconnectAlert;
    }

    public WebElement getHardBreakingAccelerationAlert() {
        return hardBrakingAndAccelerationAlert;
    }

    public WebElement getIdleAlert() {
        return idleAlert;
    }

    public WebElement getInput() {
        return input;
    }

    public WebElement getLandmarkArrivalDepartureAlert() {
        return landmarkArrivalDepatureAlert;
    }

    public WebElement getLowBatteryAlert() {
        return lowBatteryAlert;
    }

    public WebElement getMaintenanceAlertDistance() {
        return maintainanceAlertDistance;
    }

    public WebElement getMaintenanceAlertEngine() {
        return maintainanceAlertEngine;
    }

    public WebElement getMaintenanceAlertTime() {
        return maintainanceAlertTime;
    }

    public WebElement getOddHoursAlert() {
        return oddHoursAlert;
    }

    public WebElement getPowerReconnectAlert() {
        return powerReconnectAlert;
    }

    public WebElement getSpeedLimitAlert() {
        return speedLimitAlert;
    }

    public WebElement getSpeedThresholdAlert() {
        return speedThresholdAlert;
    }

    public WebElement getStopAlert() {
        return stopAlert;
    }

    public WebElement getTemperatureAlert() {
        return temperatureAlert;
    }

    public WebElement getDriverAlerts() {
        return driverAlerts;
    }

    public void clickDriverAlerts() {
        driverAlerts.click();
    }

    public WebElement getHardBrakingAccelerationAlertDriver() {
        return hardBrakingAccelerationAlertDriver;
    }

    public WebElement getIdleAlertDriver() {
        return idleAlertDriver;
    }

    public WebElement getInputAlertDriver() {
        return inputAlertDriver;
    }

    public WebElement getLandmarkArrivalDepartureAlertDriver() {
        return landmarkArrivalDepartureAlertDriver;
    }

    public WebElement getOddHoursAlertDriver() {
        return oddHoursAlertDriver;
    }

    public WebElement getSpeedLimitAlertDriver() {
        return speedLimitAlertDriver;
    }

    public WebElement getSpeedThresholdAlertDriver() {
        return speedThresholdAlertDriver;
    }

    public WebElement getStopAlertDriver() {
        return stopAlertDriver;
    }

    public WebElement getAlertHistory() {

        return alertHistory;
    }

    public void clickAlertHistory() {
        alertHistory.click();
    }

    public WebElement getDateTime() {

        return dateTime;
    }

    public WebElement getAlertTypeInAlertHistory() {
        return alertTypeInAlertHistory;
    }

    public WebElement getLocationInAlertHistory() {
        return locationInAlertHistory;
    }

    public WebElement getDetailsInAlertHistory() {
        return detailsInAlertHistory;
    }

    public WebElement getSavedAlerts() {

        return savedAlerts;
    }

    public void clickSavedAlerts() {
        savedAlerts.click();
    }

    public WebElement getNameInSavedAlerts() {
        return nameInSavedAlerts;
    }

    public WebElement getDateCreatedInSavedAlerts() {
        return dateCreatedInSavedAlerts;
    }

    public WebElement getRecipientsInSavedAlerts() {
        return recipientsInSavedAlerts;
    }

    public WebElement getViewButtonInSavedAlerts() {
        return viewButtonInSavedAlerts;
    }

    public void vehicleAlertsColumnExists() {
        int i = 0;
        boolean chkFlag = false;
        for (VehicleAlertsColumn column : VehicleAlertsColumn.values()) {
            String columnTitle = column.toString();
            WebElement vehicleAlerts = vehicleAlertsList.get(i);

            if (!vehicleAlerts.getText().matches(columnTitle)) {
                chkFlag = true;
                System.out.println("Does Not Match " + vehicleAlerts.getText());
            }
            i++;
        }

        if (chkFlag == false) {
            System.out.println("Everything Matches");
        }
    }

    public void driverAlertsColumnExists() {
        int i = 0;
        boolean chkFlag = false;
        for (DriverAlertsColumn column : DriverAlertsColumn.values()) {
            String columnTitle = column.toString();
            WebElement driverAlerts = driverAlertsList.get(i);

            if (!driverAlerts.getText().matches(columnTitle)) {
                chkFlag = true;
                System.out.println("Does Not Match " + driverAlerts.getText());
            }
            i++;
        }

        if (chkFlag == false) {
            System.out.println("Everything Matches");
        }
    }

    public void alertHistoryColumnExists() {
        int i = 0;
        boolean chkFlag = false;
        for (AlertHistoryColumn column : AlertHistoryColumn.values()) {
            String columnTitle = column.toString();
            WebElement alertsHistory = alertHistoryTabs.get(i);

            if (!alertsHistory.getText().matches(columnTitle)) {
                chkFlag = true;
                System.out.println("Does Not Match " + alertsHistory.getText());
            }
            i++;
        }

        if (chkFlag == false) {
            System.out.println("Everything Matches");
        }
    }

    public void savedAlertsColumnExists() {
        int i = 0;
        boolean chkFlag = false;
        for (SavedAlertsColumn column : SavedAlertsColumn.values()) {
            String columnTitle = column.toString();
            WebElement savedAlerts = savedAlertsTabs.get(i);

            if (!savedAlerts.getText().matches(columnTitle)) {
                chkFlag = true;
                System.out.println("Does Not Match " + savedAlerts.getText());
            }
            i++;
        }

        if (chkFlag == false) {
            System.out.println("Everything Matches");
        }
    }
}