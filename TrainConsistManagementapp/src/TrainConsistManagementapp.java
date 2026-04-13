import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementapp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (list of bogies)
        List<String> trainConsist = new ArrayList<String>();

        // Display initial bogie count
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues...
        System.out.println("Train consist initialized successfully.");
    }
}