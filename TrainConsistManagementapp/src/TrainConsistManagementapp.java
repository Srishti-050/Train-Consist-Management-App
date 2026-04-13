import java.util.Arrays;

public class TrainConsistManagementapp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("===================================");

        // Create array of bogie IDs (can be unsorted initially)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // 🔹 Sort first (IMPORTANT for binary search)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display sorted array
        System.out.println("\nSorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // 🔹 BINARY SEARCH
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("\n\nBogie ID " + key + " FOUND ✅");
        } else {
            System.out.println("\n\nBogie ID " + key + " NOT FOUND ❌");
        }

        System.out.println("\nUC19 search completed...");
    }
}