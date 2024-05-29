package com.mycompany.sda_assigment_04;

public class RegularUser extends User {
    public RegularUser(String username, String password, String email) {
        super(username, password, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Regular User: " + getUsername());
    }
}
