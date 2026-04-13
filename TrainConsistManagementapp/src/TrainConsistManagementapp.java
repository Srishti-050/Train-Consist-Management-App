public class TrainConsistManagementapp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC20 - Exception Handling in Search");
        System.out.println("===================================");

        // Empty bogie array (train has no bogies)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        try {
            // 🔹 FAIL-FAST VALIDATION
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in train. Cannot perform search.");
            }

            // 🔹 SEARCH LOGIC (only runs if data exists)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("\nBogie ID " + searchId + " FOUND ✅");
            } else {
                System.out.println("\nBogie ID " + searchId + " NOT FOUND ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}