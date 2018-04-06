package Enum;

public enum DriverAlertsColumn {

    HARD_BRAKING_ACCELERATION_DRIVER("Hard Braking & Acceleration (Driver)"),
    IDLE_ALERT_DRIVER("Idle Alert (Driver)"),
    INPUT_ALERT_DRIVER("Input Alert (Driver)"),
    LANDMARK_ARRIVAL_DEPARTURE_ALERT__DRIVER("Landmark Arrival / Departure Alert (Driver)"),
    ODD_HOURS_ALERT_DRIVER("Odd Hours Alert (Driver)"),
    SPEED_LIMIT_ALERT_DRIVER("Speed Limit Alert (Driver)"),
    SPEED_THRESHOLD_ALERT_DRIVER("Speed Threshold ALert (Driver)"),
    STOP_ALERT("Stop Alert (Driver)");

    private final String column;

    DriverAlertsColumn(String column) {
        this.column = column;
    }

    public String toString() {
        return this.column;
    }
}