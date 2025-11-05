package airfareProject;

public class AirfareMain {
    public static void main(String[] args) {
        AirIndia flight1 = new AirIndia("AI202", "Chennai", "Delhi", 2000.0, 1800.0);
        flight1.displayDetails();

        System.out.println("\n--- Another Flight ---");

        AirIndia flight2 = new AirIndia();
        flight2.setFlightNumber("AI303");
        flight2.setSource("Mumbai");
        flight2.setDestination("Bangalore");
        flight2.setBaseFare(1500.0);
        flight2.setDistance(850.0);
        flight2.displayDetails();
    }
}
