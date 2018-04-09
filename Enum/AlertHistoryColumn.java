package Enum;

public enum AlertHistoryColumn {

    DATETIME("Date / Time"),
    ALERT_TYPE("Alert Type"),
    LOCATION("Location"),
    DETAILS("Details");

    private final String column;

    AlertHistoryColumn(String column) {
        this.column = column;
    }

    public String toString() {
        return this.column;
    }
}
