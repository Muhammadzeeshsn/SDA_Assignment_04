package com.mycompany.sda_assigment_04;


public class AdminUser extends User {
    public AdminUser(String username, String password, String email) {
        super(username, password, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Admin User: " + getUsername());
    }

    public void manageUser(User user) {
        System.out.println("Managing user: " + user.getUsername());
    }
}
