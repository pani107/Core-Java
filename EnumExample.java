enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Assign an enum value
        Day today = Day.WEDNESDAY;

        // Using enum in switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day!");
                break;
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;
            default:
                System.out.println("Just another day.");
        }

        // Loop through all enum constants
        System.out.println("\nAll Days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // Get ordinal (index) of enum
        System.out.println("\nOrdinal of WEDNESDAY: " + Day.WEDNESDAY.ordinal());
    }
}
