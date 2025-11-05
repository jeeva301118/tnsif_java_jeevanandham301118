package airfareProject;

public class AirIndia implements Airfare {
    private String flightNumber;
    private String source;
    private String destination;
    private double baseFare;
    private double distance;

    public AirIndia() {
        this.flightNumber = "AI000";
        this.source = "Unknown";
        this.destination = "Unknown";
        this.baseFare = 0.0;
        this.distance = 0.0;
    }

    public AirIndia(String flightNumber, String source, String destination, double baseFare, double distance) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.baseFare = baseFare;
        this.distance = distance;
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public double getBaseFare() { return baseFare; }
    public void setBaseFare(double baseFare) { this.baseFare = baseFare; }

    public double getDistance() { return distance; }
    public void setDistance(double distance) { this.distance = distance; }

    @Override
    public double calculateFare() {
        double farePerKm = 5.0;
        return baseFare + (distance * farePerKm);
    }

    public void displayDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Base Fare: ₹" + baseFare);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + calculateFare());
    }
}
