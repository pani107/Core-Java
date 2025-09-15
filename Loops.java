public class AllLoopsExample {
    public static void main(String[] args) {

        // 1. FOR LOOP.
        System.out.println("---- For Loop ----");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop count: " + i);
        }

        // 2. WHILE LOOP.
        System.out.println("\n---- While Loop ----");
        int w = 1;
        while (w <= 5) {
            System.out.println("While Loop count: " + w);
            w++;
        }

        // 3. DO-WHILE LOOP
        System.out.println("\n---- Do-While Loop ----");
        int d = 1;
        do {
            System.out.println("Do-While Loop count: " + d);
            d++;
        } while (d <= 5);

        // 4. FOR-EACH LOOP
        System.out.println("\n---- For-Each Loop ----");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 5. NESTED LOOPS
        System.out.println("\n---- Nested Loops ----");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
