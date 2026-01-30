/**
 * =========================================================
 * MAIN CLASS – UseCase10BookingCancellation
 * =========================================================
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * This class demonstrates how confirmed
 * bookings can be cancelled safely.
 *
 * Inventory is restored and rollback
 * history is maintained.
 *
 * @version 10.0
 */
public class UseCase10BookingCancellation {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display application header
        System.out.println("Booking Cancellation");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize cancellation service
        CancellationService cancellationService = new CancellationService();

        // Simulate confirmed bookings
        cancellationService.registerBooking("Single-1", "Single");
        cancellationService.registerBooking("Double-1", "Double");

        // Cancel a booking
        cancellationService.cancelBooking("Single-1", inventory);

        // Display rollback history
        cancellationService.showRollbackHistory();

        // Display updated inventory
        System.out.println(
                "\nUpdated Single Room Availability: "
                        + inventory.getRoomAvailability().get("Single")
        );
    }
}