package accessdemo;
// Example: Access Modifiers in Java.
// Author: Pranav Kuber Wadkar.
class AccessExample {

    public String publicVar = "Public Variable";       // Accessible everywhere
    private String privateVar = "Private Variable";    // Accessible only inside this class
    String defaultVar = "Default (Package-Private)";   // Accessible in same package
    protected String protectedVar = "Protected Variable"; // Accessible in same package + subclasses

    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default (Package-Private) Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void showPrivate() {
        // Accessing private member inside same class
        System.out.println(privateVar);
        privateMethod();
    }
}

// Subclass in the same file
class SubClassExample extends AccessExample {
    public void testSubclassAccess() {
        System.out.println(publicVar);      //  Allowed
        System.out.println(protectedVar);   //  Allowed
        // System.out.println(defaultVar);  //  Not allowed if different package (but here same package so works)
        // System.out.println(privateVar);  // Not allowed

        publicMethod();
        protectedMethod();
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        // Accessing members from same class
        System.out.println(obj.publicVar);     // Allowed
        System.out.println(obj.defaultVar);    //  Allowed
        System.out.println(obj.protectedVar);  // Allowed
        obj.publicMethod();
        obj.defaultMethod();
        obj.protectedMethod();

        // Accessing private members (only through public method)
        obj.showPrivate();

        // Testing subclass
        SubClassExample sub = new SubClassExample();
        sub.testSubclassAccess();
    }
}
