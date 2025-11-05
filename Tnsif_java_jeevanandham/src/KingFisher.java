package kingFisher;

public class KingFisher implements Airfare {

    // Private attributes
    private String flightNumber;
    private String source;
    private String destination;
    private double baseFare;
    private double distance; // in kilometers

    // Default constructor
    public KingFisher() {
        this.flightNumber = "KF000";
        this.source = "Unknown";
        this.destination = "Unknown";
        this.baseFare = 0.0;
        this.distance = 0.0;
    }

    // Parameterized constructor
    public KingFisher(String flightNumber, String source, String destination, double baseFare, double distance) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.baseFare = baseFare;
        this.distance = distance;
    }

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    // Implement method from Airfare interface
    @Override
    public double calculateFare() {
        double farePerKm = 6.0; // KingFisher charges ₹6 per km
        return baseFare + (distance * farePerKm);
    }

    // Display details method
    public void displayDetails() {
        System.out.println("✈️  KingFisher Flight Details:");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Base Fare: ₹" + baseFare);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + calculateFare());
    }
}
