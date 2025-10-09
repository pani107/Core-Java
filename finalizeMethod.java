public class FinalizeExample {
    String name;

    FinalizeExample(String name) {
        this.name = name;
    }

    // Override finalize() method.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called for: " + name);
    }

    public static void main(String[] args) {
        FinalizeExample obj1 = new FinalizeExample("Object 1");
        FinalizeExample obj2 = new FinalizeExample("Object 2");

        // Nullify references so they become eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("Main method completed.");
    }
}
