
public class Main {
    public static void main(String[] args) {
        for(Empty e : Empty.values()) {
            System.out.println(e);
        }

        Day day = Day.WEDNESDAY;
        System.out.println(day.ordinal());

        System.out.println(Day.TUESDAY.compareTo(Day.SUNDAY));

        for (Day d : Day.values()) {
            System.out.println(d);
        }

        Day.valueOf("asdf");
        System.out.println(Enum.valueOf(Day.class, "MONDAY"));

        System.out.println(Empty.values().length);

    }
}
