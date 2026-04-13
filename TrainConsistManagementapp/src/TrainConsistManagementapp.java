import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementapp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("===================================");

        // Create HashMap (Bogie → Capacity)
        Map<String, Integer> capacityMap = new HashMap<String, Integer>();

        // Add bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // Display all bogies with capacity
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}