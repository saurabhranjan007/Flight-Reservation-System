package com.company;

import java.util.Scanner;

public class TouristTicket extends Ticket{

    protected String hotelAddress;
    protected String[] touristLocation = new String[5];
    Scanner sc = new Scanner(System.in);

    public TouristTicket(String adstreet, String adcity, String adstate, String cname, int cphone, String cemail,
                         String fn, String an, String t, String f, String d, String dep, String arr, String pnr,
                         String st, float p,String hotel) {
        super(adstreet, adcity, adstate, cname, cphone, cemail, fn, an, t, f, d, dep, arr, pnr, st, p);
        this.hotelAddress = hotel;
    }

    public String getDetails() {
        return "PNR: " + this.pnr + " To: " + this.to + " from: " + this.from + "Seat No: " + this.seatNo +
                " Date: " + this.Date + " Departure Time: " + this.departure + " Arrival Time: " + arrival +
                " Price: " + this.price;
    }

    public String getTicketDetails() {
        return " " + passenger.getId() + "\n" + passenger.getContactDetails() + "\n" + flight.getFlightNumber() +
                "\n" + flight.getAirline() + "\n" + this.getDetails() + "\n";
    }

    public String getDuration() {
        int i = Integer.parseInt(departure);
        int j = Integer.parseInt(arrival);
        int k;
        float l = 0.0f;

        if (j > 1) {
            k = j - i;
            l = (float) k/100.0f;
        }

        else if (j < i) {
            k = i - j;
            l = (float) k/100.0f;
            l = l + 24.0f;
        }

        return "Duration: " + l + "Hrs.";
    }

    public String checkedStatus() {
        if (canceled == false) {
            return "Ticket Booked.";
        }

        else {
            return "Ticket Canceled."
        }
    }

    public void cancel() {
        canceled = true;
        Flight.bcnt = Flight.bcnt--;
        flight.bookedStatus = Flight.bcnt;
    }

    public void setHotelAddress(String ha) {
        this.hotelAddress = ha;
    }

    public String getHotelAddress() {
        return "Hotel: " + this.hotelAddress;
    }

    public void setTouristLocation() {

        System.out.println("Enter the 5 locations: ");
        System.out.println("\n1. Juhu 2. MahaLaxmi 3. SiddhiVinayak 4. BandStand 5. Worli 6. Sealink");

        try {
            for (int i = 0; i < 5; i++) {
                touristLocation[i] = sc.next();
            }
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public void getTouristLocation() {
        System.out.println("Tourist spot: ");

        for (String arr: touristLocation) {
            System.out.println(" " + arr);
        }
    }
}
