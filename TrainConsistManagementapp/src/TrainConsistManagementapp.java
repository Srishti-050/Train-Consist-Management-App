import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementapp {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC10 - Count Total Seats");
        System.out.println("===================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<Bogie>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // TOTAL SEATS using Stream
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 operations completed successfully...");
    }
}