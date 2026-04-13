public class TrainConsistManagementapp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("===================================");

        // Create array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.println("\nOriginal Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // 🔹 BUBBLE SORT
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}