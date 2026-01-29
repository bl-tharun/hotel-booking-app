/**
 * =========================================================
 * ABSTRACT CLASS – Room
 * =========================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This abstract class represents a generic hotel room.
 *
 * At this stage, the class is used to model common
 * attributes shared by all room types.
 *
 * No availability or booking logic is handled here.
 * This class focuses purely on domain modeling.
 *
 * Concrete room types will extend this class.
 *
 * @version 1.0
 */
public abstract class Room {

    /**
     * Number of beds available in the room.
     */
    protected int numberOfBeds;

    /**
     * Total size of the room in square feet.
     */
    protected int squareFeet;

    /**
     * Constructor used by child classes to
     * initialize common room attributes.
     *
     * @param numberOfBeds number of beds in the room
     * @param squareFeet total room size
     */
    public Room(int numberOfBeds, int squareFeet) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
    }

    /**
     * Displays room details.
     * Concrete classes may reuse or extend this behavior.
     */
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
    }
}