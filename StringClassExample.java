// File: StringClassExample.java
public class StringClassExample {
    public static void main(String[] args) {
        
        // Creating String objects
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "  Java Programming  ";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. concat()
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + combined);

        // 3. toUpperCase() & toLowerCase()
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Lowercase: " + combined.toLowerCase());

        // 4. trim()
        System.out.println("Before trim: \"" + str3 + "\"");
        System.out.println("After trim: \"" + str3.trim() + "\"");

        // 5. substring()
        System.out.println("Substring from index 2: " + str1.substring(2));

        // 6. charAt()
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 7. equals() & equalsIgnoreCase()
        String str4 = "hello";
        System.out.println("str1 equals str4? " + str1.equals(str4));
        System.out.println("str1 equalsIgnoreCase str4? " + str1.equalsIgnoreCase(str4));

        // 8. replace()
        System.out.println("Replace 'Java' with 'Python': " + str3.replace("Java", "Python"));

        // 9. contains()
        System.out.println("Does str3 contain 'Java'? " + str3.contains("Java"));

        // 10. startsWith() & endsWith()
        System.out.println("Does str1 start with 'He'? " + str1.startsWith("He"));
        System.out.println("Does str2 end with 'ld'? " + str2.endsWith("ld"));
    }
}
