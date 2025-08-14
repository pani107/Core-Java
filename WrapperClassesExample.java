public class WrapperClassesExample {
    public static void main(String[] args) {
        // Primitive data types
        int intValue = 10;
        double doubleValue = 20.5;
        char charValue = 'A';
        boolean boolValue = true;

        // Boxing (primitive → wrapper)
        Integer intObj = Integer.valueOf(intValue);
        Double doubleObj = Double.valueOf(doubleValue);
        Character charObj = Character.valueOf(charValue);
        Boolean boolObj = Boolean.valueOf(boolValue);

        System.out.println("Boxing:");
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);

        // Unboxing (wrapper → primitive)
        int num = intObj.intValue();
        double d = doubleObj.doubleValue();
        char c = charObj.charValue();
        boolean b = boolObj.booleanValue();

        System.out.println("\nUnboxing:");
        System.out.println("int: " + num);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + b);

        // Auto-boxing and auto-unboxing
        Integer autoInt = 50;   // Auto-boxing
        int autoNum = autoInt;  // Auto-unboxing

        System.out.println("\nAuto-boxing & Auto-unboxing:");
        System.out.println("autoInt: " + autoInt);
        System.out.println("autoNum: " + autoNum);
    }
}
