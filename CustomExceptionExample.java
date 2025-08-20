 public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    // Step 2: Method that throws the custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            // Step 3: Call method with invalid age
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        System.out.println("Program continues normally after exception handling.");
    }
}
