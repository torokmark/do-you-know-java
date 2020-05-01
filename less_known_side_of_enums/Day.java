

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public Day from(String value) {
        for (Day day : Day.values()) {
            if (day.name().equalsIgnoreCase(value)) {
                return day;
            }
        }
        return null;
    }
}
