/**
 * =========================================================
 * MAIN CLASS – UseCase7AddOnServiceSelection
 * =========================================================
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * This class demonstrates how optional
 * services can be attached to a confirmed
 * booking.
 *
 * Services are added after room allocation
 * and do not affect inventory.
 *
 * @version 7.0
 */
public class UseCase7AddOnServiceSelection {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display application header
        System.out.println("Add-On Service Selection");

        // Simulated confirmed reservation ID
        String reservationId = "Single-1";

        // Initialize service manager
        AddOnServiceManager serviceManager = new AddOnServiceManager();

        // Create add-on services
        Service breakfast = new Service("Breakfast", 300.0);
        Service spa = new Service("Spa", 1200.0);

        // Attach services to reservation
        serviceManager.addService(reservationId, breakfast);
        serviceManager.addService(reservationId, spa);

        // Calculate total add-on cost
        double totalCost = serviceManager.calculateTotalServiceCost(reservationId);

        // Display service cost summary
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}