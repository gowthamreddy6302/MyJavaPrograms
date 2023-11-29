package Collections.Aeroplane;

public class Flight {
    private int flightNumber;
    private String PassengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassenger;
    private double price;
    private int confirmationNumber;

    public Flight(int flightNumber, String PassengerName, String origin, String destination, String date) {
        this.flightNumber = flightNumber;
        this.PassengerName = PassengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
    }

    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassenger, double price) {
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    public double getPrice() {
        return price;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}
