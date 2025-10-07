public class ArrayExample {
    public static void main(String[] args) {

        // 1️ Declaration and initialization
        int[] numbers = {10, 20, 30, 40, 50};

        // 2️ Accessing elements by index.
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 3️Using for loop
        System.out.println("\nArray elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 4️ Using for-each loop
        System.out.println("\nArray elements using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 5️ Modifying an element
        numbers[2] = 99;
        System.out.println("\nAfter modification:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
