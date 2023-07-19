package roam_air;

public class DriverControl {
    private RideMode rideMode;

    DriverControl() {
        rideMode = null;
    }

    void setRideMode(RideMode mode) {
        this.rideMode = mode;
    }

    public void drive() {
        if (rideMode != null) {
            rideMode.drive();
        } else {
            // Default behavior if no mode is selected
            System.out.println("Driving in default mode anyway");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // Create an instance of DriverControl
        DriverControl driverControl = new DriverControl();

        // Set the desired riding mode
        driverControl.drive(); // Motorcycle drives in default  if no mode is set

        driverControl.setRideMode(new EcoMode()); // Switch to ECO mode
        driverControl.drive(); // Motorcycle drives in ECO mode

        driverControl.setRideMode(new SportMode()); // Switch to SPORT mode
        driverControl.drive(); // Motorcycle drives in SPORT mode

        driverControl.setRideMode(new OffRoadMode()); // Switch to OFF-ROAD mode
        driverControl.drive(); // Motorcycle drives in OFF-ROAD mode

    }
}
