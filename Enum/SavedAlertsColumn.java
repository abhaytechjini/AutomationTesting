package Enum;

public enum SavedAlertsColumn {

    NAME("Name"),
    DATE_CREATED("Date Created"),
    RECIPIENTS("Recipients"),
    VIEW("View");

    private final String column;

    SavedAlertsColumn(String column) {
        this.column = column;
    }

    public String toString() {
        return this.column;
    }

}
