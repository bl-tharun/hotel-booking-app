import java.util.Map;

/**
 * =========================================================
 * MAIN CLASS – UseCase3InventorySetup
 * =========================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class demonstrates how room inventory
 * can be managed using centralized data structures.
 *
 * At this stage, the application:
 * - Initializes a single inventory source
 * - Retrieves room availability and pricing
 * - Displays real-time inventory status
 *
 * No booking or mutation logic is introduced yet.
 *
 * @version 3.0
 */
public class UseCase3InventorySetup {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display application header
        System.out.println("Hotel Room Inventory Status");

        // Initialize centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Retrieve availability and pricing data
        Map<String, Integer> availability = inventory.getRoomAvailability();
        Map<String, Double> pricing = inventory.getRoomPricing();

        // Display inventory details
        for (String roomType : availability.keySet()) {
            System.out.println("\nRoom Type: " + roomType);
            System.out.println("Available Rooms: " + availability.get(roomType));
            System.out.println("Price per Night: " + pricing.get(roomType));
        }
    }
}