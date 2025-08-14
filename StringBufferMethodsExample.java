public class StringBufferMethodsExample {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Initial StringBuffer: " + sb);

        // 1. append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // 3. replace()
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // 4. delete()
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. length()
        System.out.println("Length: " + sb.length());

        // 7. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 8. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 9. charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 10. setCharAt()
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt(2, 'X'): " + sb);

        // 11. substring()
        String sub = sb.substring(2, 6);
        System.out.println("Substring (2, 6): " + sub);
    }
}
