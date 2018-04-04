package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(css = "div#eventsGridPanel div:nth-child(3) > div.x-column-header-inner")
    private WebElement nameInAlertHistory;

    @FindBy(css = "div#eventsGridPanel div:nth-child(4) > div.x-column-header-inner > span")
    private WebElement vehicleInAlertHistory;

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
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#alertControl  div:nth-child(2)> em > button > span.x-tab-inner")));
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

    public WebElement getNameInAlertHistory() {
        return nameInAlertHistory;
    }

    public WebElement getVehicleInAlertHistory() {
        return vehicleInAlertHistory;
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

}