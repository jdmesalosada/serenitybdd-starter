package com.jmconsultant.models;

public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName, String address, String emailAddress, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phone = phone;
    }

    private String address;
    private String emailAddress;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
