package com.mycompany.sda_assigment_04;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getUsername());
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("User removed: " + user.getUsername());
    }

    public void displayUsers() {
        for (User user : users) {
            user.displayRole();
        }
    }
}