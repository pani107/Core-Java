import java.util.Vector;

public class VectorMethodsExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // 1. add()
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("After add: " + vector);

        // 2. addElement()
        vector.addElement("Date");
        System.out.println("After addElement: " + vector);

        // 3. insertElementAt()
        vector.insertElementAt("Mango", 1);
        System.out.println("After insertElementAt: " + vector);

        // 4. get()
        System.out.println("Element at index 2: " + vector.get(2));

        // 5. elementAt()
        System.out.println("Element at index 3 (elementAt): " + vector.elementAt(3));

        // 6. set()
        vector.set(0, "Apricot");
        System.out.println("After set: " + vector);

        // 7. remove()
        vector.remove("Banana");
        System.out.println("After remove(Banana): " + vector);

        // 8. removeElement()
        vector.removeElement("Date");
        System.out.println("After removeElement(Date): " + vector);

        // 9. removeElementAt()
        vector.removeElementAt(1);
        System.out.println("After removeElementAt(1): " + vector);

        // 10. size()
        System.out.println("Size: " + vector.size());

        // 11. capacity()
        System.out.println("Capacity: " + vector.capacity());

        // 12. contains()
        System.out.println("Contains Cherry? " + vector.contains("Cherry"));

        // 13. indexOf()
        System.out.println("Index of Cherry: " + vector.indexOf("Cherry"));

        // 14. firstElement() & lastElement()
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // 15. clear()
        vector.clear();
        System.out.println("After clear: " + vector);
    }
}
