import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementapp {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("===================================");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<GoodsBogie>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // SAFETY CHECK using stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nTrain Safety Status: " +
                (isSafe ? "SAFE ✅" : "UNSAFE ❌"));

        System.out.println("\nUC12 safety check completed...");
    }
}