package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t\t\t\t.........FLIGHT RESERVATION SYSTEM..........");
        System.out.println("\n Flight Information::::");

        Flight f = new Flight(IC8080, "AIR INDIA");
        System.out.println(f.getFlightDetails());


        System.out.println("Customer Option " + "for regular ticket::::");

        RegularTicket regular = new RegularTicket("MG ROAD", "MUMBAI", "MAHARASHTRA", "RAM",
                2020245, "ram@example.com", "IC8086", "AIR INDIA", "BANG", "10/10/21",
                "0900", "1420", "A08878", "A10", 4500, "SNACKS");

        System.out.println("------------------------------------");
        System.out.println(regular.getTicketDetails());
        System.out.println(regular.getDuration());
        System.out.println(regular.getSpecialServices());
        System.out.println(regular.checkedStatus());
        System.out.println("----------------------------");
        System.out.println("Happy Flying");

        System.out.println("\n\n\n\n");
        System.out.println("Customer Options for Tourist Ticket::::\n");

        TouristTicket tt = new TouristTicket("MG ROAD", "MUMBAI", "MAHARASHTRA", "RAM",
                202024, "ram@example.com", "IC2021", "AIR INDIA", "NUM", "BANG", "15/10/21",
                "1200", "7800", "689A78", "B21", 3500, "GRAND HYATT");

        System.out.println("----------------------------------");
        System.out.println(tt.getTicketDetails());
        System.out.println(tt.getDuration());
        System.out.println();
        tt.getTouristLocation();
        System.out.println(tt.checkedStatus());
        System.out.println("----------------------------------");
        System.out.println("Happy Flying\n");
        System.out.println(f.getFlightDetails());

        System.out.println("\n\n.......Cancel Ticket..........");
        tt.cancel();
        System.out.println("\n\n" + tt.getTicketDetails());
        System.out.println(tt.checkedStatus());
        System.out.println("\n\n" + f.getFlightDetails());
    }
}
