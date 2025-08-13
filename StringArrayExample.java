// File: StringArrayExample.java
public class StringArrayExample {
    public static void main(String[] args) {

        // Declare and initialize a String array.
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango", "Orange"};

        // Display array elements using for loop.
        System.out.println("Fruits list using for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }

        // Display array elements using enhanced for loop.
        System.out.println("\nFruits list using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Accessing a specific element.
        System.out.println("\nMy favorite fruit is: " + fruits[2]); // Cherry
    }
}
