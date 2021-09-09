package com.company;

public abstract class Ticket {

    protected String pnr;
    protected  String from;
    protected String to;
    Flight flight;
    String departure;
    String arrival;
    String seatNo;
    float price;
    boolean canceled = false;
    Passenger passenger;

    public Ticket(String adstreet, String adcity, String adstate, String cname, int cphone, String cemail, String fn,
                  String an, String t, String f, String d, String dep, String arr, String pnr, String st, float p) {
        this.passenger = new Passenger(adstreet, adcity, adstate, cname, cphone, cemail);
        this.flight = new Flight(fn, an);
        this.to = t;
        this.from = f;
        this.departure = dep;
        this.arrival = arr;
        this.Date = d;
        this.seatNo = st;
        this.pnr = pnr;
        this.price = p;
        flight.incrementBookingCounter();
    }

    public abstract String getDetails();
    public abstract String getTicketdetails();
    public abstract String getDuration();
    public abstract String checkedStatus();
    public abstract void cancel();

}

