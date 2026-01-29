import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * CLASS – RoomInventory
 * =========================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class acts as the single source of truth
 * for all room availability and pricing data.
 *
 * Instead of using scattered variables, room
 * counts and prices are stored in HashMaps.
 *
 * This ensures:
 * - Consistent inventory updates
 * - Fast lookups
 * - Better scalability
 *
 * @version 3.0
 */
public class RoomInventory {

    /**
     * Stores available room count for each room type.
     * Key   -> Room type name
     * Value -> Available room count
     */
    private Map<String, Integer> roomAvailability;

    /**
     * Stores price per night for each room type.
     * Key   -> Room type name
     * Value -> Price per night
     */
    private Map<String, Double> roomPricing;

    /**
     * Constructor initializes the inventory maps
     * and sets up default room data.
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        roomPricing = new HashMap<>();

        initializeInventory();
    }

    /**
     * Initializes room types, availability counts,
     * and pricing information.
     *
     * This method centralizes inventory setup
     * in one controlled location.
     */
    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);

        roomPricing.put("Single", 1500.0);
        roomPricing.put("Double", 2500.0);
        roomPricing.put("Suite", 5000.0);
    }

    /**
     * Returns the current availability map.
     *
     * @return map of room type to available count
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Returns the pricing map.
     *
     * @return map of room type to price per night
     */
    public Map<String, Double> getRoomPricing() {
        return roomPricing;
    }

    /**
     * Updates the available room count
     * for a given room type.
     *
     * @param roomType the room type to update
     * @param count new availability count
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}