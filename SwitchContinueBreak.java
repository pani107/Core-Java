public class SwitchContinueBreak {
    public static void main(String[] args) {
        for (int day = 1; day <= 7; day++) { //for loop
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Day " + day + " = Weekday");
                    break;    // exits the switch block and continues with the loop

                case 6:
                    System.out.println("Day " + day + " = Saturday");
                    continue; // skips the rest of the loop body and moves to next iteration

                case 7:
                    System.out.println("Day " + day + " = Sunday");
                    break;    // exits switch and reaches below if, which breaks the loop entirely
            }

            // This line will be skipped when day==6 because of continue
            if (day == 7) {
                System.out.println("Stopping loop on day " + day);
                break; // stops the for-loop completely
            }
        }
    }
}
