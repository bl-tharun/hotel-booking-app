import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * =========================================================
 * CLASS – CancellationService
 * =========================================================
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * This class is responsible for handling
 * booking cancellations.
 *
 * It ensures that:
 * - Cancelled room IDs are tracked
 * - Inventory is restored correctly
 * - Invalid cancellations are prevented
 *
 * A stack is used to model rollback behavior.
 *
 * @version 10.0
 */
public class CancellationService {

    /**
     * Stack that stores recently released room IDs.
     *
     * LIFO order is used to reflect rollback behavior.
     */
    private Stack<String> releasedRoomIds;

    /**
     * Maps reservation ID to room type.
     *
     * This allows inventory to be restored
     * correctly during cancellation.
     */
    private Map<String, String> reservationRoomTypeMap;

    /**
     * Initializes cancellation tracking structures.
     */
    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    /**
     * Registers a confirmed booking.
     *
     * This method simulates storing confirmation
     * data that will later be required for cancellation.
     *
     * @param reservationId confirmed reservation ID
     * @param roomType allocated room type
     */
    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    /**
     * Cancels a confirmed booking and
     * restores inventory safely.
     *
     * @param reservationId reservation to cancel
     * @param inventory centralized room inventory
     */
    public void cancelBooking(String reservationId, RoomInventory inventory) {

        // Validate reservation existence
        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Cancellation failed: Invalid reservation ID.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);

        // Restore inventory count
        int currentAvailability =
                inventory.getRoomAvailability().get(roomType);

        inventory.updateAvailability(roomType, currentAvailability + 1);

        // Track released room ID for rollback history
        releasedRoomIds.push(reservationId);

        // Remove reservation record
        reservationRoomTypeMap.remove(reservationId);

        System.out.println(
                "Booking cancelled successfully. Inventory restored for room type: "
                        + roomType
        );
    }

    /**
     * Displays recently cancelled reservations.
     *
     * This method helps visualize rollback order.
     */
    public void showRollbackHistory() {

        System.out.println("\nRollback History (Most Recent First):");

        for (String reservationId : releasedRoomIds) {
            System.out.println("Released Reservation ID: " + reservationId);
        }
    }
}