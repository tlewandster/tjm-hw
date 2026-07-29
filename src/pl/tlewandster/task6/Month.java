package pl.tlewandster.task6;

public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30, true), JULY(31, true), AUGUST(31,true), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private final int days;
    private final boolean isHolidaySeason;

    Month(int days) {
        this.days = days;
        this.isHolidaySeason = false;
    }

    Month(int days, boolean isHolidaySeason){
        this.days = days;
        this.isHolidaySeason = isHolidaySeason;
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
