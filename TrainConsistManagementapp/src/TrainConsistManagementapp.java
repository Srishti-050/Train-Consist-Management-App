public class TrainConsistManagementapp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("===================================");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // ID to search
        String searchId = "BG309";

        // Display all bogie IDs
        System.out.println("\nAvailable Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // 🔹 LINEAR SEARCH
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop when found
            }
        }

        // Display result
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND ✅");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND ❌");
        }

        System.out.println("\nUC18 search completed...");
    }
}