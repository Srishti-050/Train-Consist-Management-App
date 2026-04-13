import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementapp {

    // Reusing Bogie class (from UC7)
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
        System.out.println("UC8 - Filter Passenger Bogies");
        System.out.println("===================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<Bogie>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // FILTER bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC8 operations completed successfully...");
    }
}