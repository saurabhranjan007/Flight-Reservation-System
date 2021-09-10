package com.company;

public class Passenger {
    private int id;
    private static int idCnt;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Address address;
    public static class Contact{
        String name;
        int phone;
        String email;

        public Contact (String name, int phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    private Contact contact;
    static {
        idCnt = 0;
    }

    public Passenger(String adstreet, String adcity, String adstate, String cname, int cphone, String cemail) {
        this.address = new Address(adstreet, adcity, adstate);
        this.contact = new Contact(cname, cphone, cemail);
        this.id =++ idCnt;
    }

    int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return "Street: " + address.street + " City: " + address.city + " State: " + address.state;
    }

    public String getContactDetails() {
        return "Name: " + contact.name + " Phone: " + contact.phone + " Email: " + contact.email;
    }

    public void updateAddressDetails(String ustreet, String ucity, String ustate) {
        address.street = ustreet;
        address.city = ucity;
        address.state = ustate;
    }

    public void updateContactDetails(String uname, int uphone, String uemail) {
        contact.name = uname;
        contact.phone = uphone;
        contact.email = uemail;
    }

}

