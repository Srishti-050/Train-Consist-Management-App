import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementapp {

    // 🔹 Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // 🔹 Passenger Bogie class with validation
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC14 - Handle Invalid Capacity");
        System.out.println("===================================");

        List<PassengerBogie> bogies = new ArrayList<PassengerBogie>();

        try {
            // Valid bogie
            bogies.add(new PassengerBogie("Sleeper", 72));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("AC Chair", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : bogies) {
            System.out.println(b.type + " -> " + b.capacity);
        }

        System.out.println("\nUC14 execution completed...");
    }
}