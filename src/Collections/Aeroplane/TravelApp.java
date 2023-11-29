package Collections.Aeroplane;

import java.util.ArrayList;
import java.util.Random;

public class TravelApp {
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    public TravelApp() {

        this.flights = new ArrayList<>();
        this.hotels = new ArrayList<>();
    }

    public void SearchFlights(String origin, String destination, String date, int numPassenger) {
        System.out.print("SEARCH FLIGHTS FROM " + origin + " TO " + destination + " ON " + date + " FOR " + numPassenger);
    }

    public void SearchHotels(String location, String checkIn, String checkOut, int numGuests) {
        System.out.print("SEAECH HOTELS IN " + location + " ON " + checkIn + " To " + checkOut + " FOR " + numGuests);
    }

    public void BookFlight(int flightNumber, String passengerName, String origin, String destination,
                           String date, int numPassenger, double price) {
        Flight bookFlight = new Flight(flightNumber, passengerName, origin, destination, date, numPassenger, price);
        int confirmationNumber = this.generateConfirmationNumber();
        bookFlight.setConfirmationNumber(confirmationNumber);
        this.flights.add(bookFlight);
        System.out.println("CONFIRMATION NUMBER : " + confirmationNumber);
    }

    public void BookHotel(int hotelId, String name, String location, String checkIn, String checkOut,
                          int numGuests, double price) {
        Hotel bookHotel = new Hotel(hotelId, name, location, checkIn, checkOut, numGuests, price);
        int confirmationNumber = this.generateConfirmationNumber();
        bookHotel.setConfirmationNumber(confirmationNumber);
        this.hotels.add(bookHotel);
        System.out.println("CONFIRMATION NUMBER : " + confirmationNumber);
    }

    public void CancelReservation() {
    }

    private int generateConfirmationNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 2000;
    }
        public static void main(String[] args) {
            TravelApp app = new TravelApp();
            app.SearchFlights("INDIA", "USA", "10-03-2023", 1);
            app.SearchHotels("USA", "2022-08-01", "15-03-2023", 10);
            app.BookFlight(123345, "Gowtham", "INDIA", "USA",
                    "2022-08-01", 1, 700.00);
            app.BookHotel(1234567890, "Gowtham", "USA", "2022-09-01",
                    "2022-09-05", 10, 900.00);
        }
    }
