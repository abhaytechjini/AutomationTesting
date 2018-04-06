package Enum;

public enum VehicleAlertsColumn {

    HARD_BRAKING_ACCELERATION_ALERT("Hard Braking & Acceleration Alert"),
    IDLE_ALERT("Idle Alert"),
    INPUT("Input"),
    LANDMARK_ARRIVAL_DEPARTURE_ALERT("Landmark Arrival/Departure Alert"),
    LOW_BATTERY_ALERT("Low Battery Alert"),
    MAINTENANCE_ALERT_DISTANCE("Maintenance Alert - Distance"),
    MAINTENANCE_ALERT_ENGINE("Maintenance Alert - Engine Hours"),
    MAINTENANCE_ALERT_TIME("Maintenance Alert - Time Period"),
    ODD_HOURS_ALERT("Odd Hours Alert"),
    POWER_RECONNECT_ALERT("Power Reconnect Alert"),
    SPEED_LIMIT_ALERT("Speed Limit Alert"),
    SPEED_THRESHOLD_ALERT("Speed Threshold Alert"),
    STOP_ALERT("Stop Alert"),
    TEMPERATURE_ALERT("Temperature Alert"),
    UNAUTHORIZED_MOVEMENT_ALERT("Unauthorized Movement Alert");

    private final String column;

    VehicleAlertsColumn(String column) {
        this.column = column;
    }

    public String toString() {
        return this.column;
    }
}