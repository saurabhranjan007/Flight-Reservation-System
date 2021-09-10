package com.company;

public class RegularTicket extends Ticket{

    public String specialServices;

    public RegularTicket(String adstreet, String adcity, String adstate, String cname, int cphone, String cemail,
                         String fn, String an, String t, String f, String d, String dep, String arr, String pnr,
                         String st, float p, String sps) {
        super(adstreet, adcity, adstate, cname, cphone, cemail, fn, an, t, f, d, dep, arr, pnr, st, p);
        this.specialServices = sps;
    }

    public RegularTicket(String mg_road, String mumbai, String maharashtra, String ram, int cphone, String cemail,
                         String ic8086, String air_india, String bang, String f, String d, String dep, String a08878,
                         String a10, int i, String snacks) {
        super(mg_road, mumbai, maharashtra, ram, cphone, cemail, ic8086, air_india, bang, f, d, dep, a08878, a10, i, snacks);
    }

    public String getDetails() {
        return "PNR: " + this.pnr + " To: " + this.to + " From: " + this.from + " Seat No: " + this.seatNo +
                " Date: " + this.Date + " Departure Time: " + this.departure + " Arrival Time: " + this.arrival +
                " Price: " + this.price;
    }

    public  String getTicketDetails() {
        return " " + passenger.getId() + "\n" + passenger.getContactDetails() + "\n" + passenger.getAddressDetails() +
                "\n" + flight.getFlightNumber() + "\n" + flight.getAirline() + "\n" + this.getDetails() + "\n";
    }

    public String getDuration() {
        int i = Integer.parseInt(departure);
        int j = Integer.parseInt(arrival);

        int k;
        float l = 0.0f;
        if (j > i) {
            k = j - i;
            l = (float) k/100.0f;
        }
        else if (j < i) {
            k = i - j;
            l = l + 24.0f;
        }

        return "Duretion: " + l + "Hrs.";
    }

    public String checkedStatus() {
        if (canceled == false) {
            return "Ticket Booked.";
        }
        else {
            return "Ticket Canceled.";
        }

    }

    public void cancel() {
        canceled = true;
        Flight.bcnt = Flight.bcnt--;
        flight.bookedSeats = Flight.bcnt;
    }

    public String getSpecialServices(int i) {
        return  "Specail Services: " + specialServices;
    }

    public void updateSpecialServices(int i) {
        switch(i) {
            case 1: specialServices = "snacks";
            break;
            case 2: specialServices = "food";
            break;
            case 3: specialServices = "Water";
            break;
            default: specialServices = "Happy Flying..";
            break;
        }
    }
}

