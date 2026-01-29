/**
 * =========================================================
 * MAIN CLASS – UseCase2RoomInitialization
 * =========================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This class demonstrates room initialization
 * using domain models before introducing
 * centralized inventory management.
 *
 * Availability is represented using
 * simple variables to highlight limitations.
 *
 * @version 2.1
 */
public class UseCase2RoomInitialization {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display application header
        System.out.println("Hotel Room Initialization");

        // Initialize room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability counts
        int singleRoomsAvailable = 5;
        int doubleRoomsAvailable = 3;
        int suiteRoomsAvailable = 2;

        // Display room details and availability
        System.out.println("\nSingle Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleRoomsAvailable);

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleRoomsAvailable);

        System.out.println("\nSuite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteRoomsAvailable);
    }
}