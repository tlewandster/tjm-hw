package pl.tlewandster.task6;

public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private final int days;
    private boolean isHolidaySeason = false;

    Month(int days) {
        this.days = days;
        if (this.name().equals("JULY") || this.name().equals("JUNE") || this.name().equals("AUGUST")) {
            this.isHolidaySeason = true;
        }
    }

    public boolean isHolidaySeason() {
        return isHolidaySeason;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return String.format("%s (days: %d)",this.name(), this.getDays());
    }
}
