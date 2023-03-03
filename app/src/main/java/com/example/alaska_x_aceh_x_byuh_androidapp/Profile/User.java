package com.example.alaska_x_aceh_x_byuh_androidapp.Profile;

public class User {

    String name, phoneNumber, birth, location;

    public User() {
    }

    public User(String name, String phoneNumber, String birth, String location) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirth() {
        return birth;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
