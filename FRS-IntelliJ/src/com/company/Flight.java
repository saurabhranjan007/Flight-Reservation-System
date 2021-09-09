package com.company;

public class Flight {

    private String flightNumber;
    private String airline;
    private static int cap;
    public int bookedSeates;
    public static int bcnt;

    public Flight(String fn, String al) {
        this.flightNumber = fn;
        this.airline = al;
    }

    public String getFlightDetails() {
        return "Flight Number: " + flightNumber + " Airline: " + airline + " Capacity: " + cap +
                " Booked Seats: " + bookedSeates;
    }

    public boolean checkAvailability() {
        if ((cap-bookedSeates) > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    static {
        cap = 50;
        bcnt = 0;
    }

    void incrementBookingCounter() {
        bookedSeates = ++bcnt;
    }


}