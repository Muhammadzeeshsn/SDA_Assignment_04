package com.mycompany.sda_assigment_04;



import java.util.ArrayList;
import java.util.List;

public class AdminPanel {
    private AdminUser admin;
    private List<String> logs;

    public AdminPanel(AdminUser admin) {
        this.admin = admin;
        logs = new ArrayList<>();
    }

    public void addLog(String log) {
        logs.add(log);
        System.out.println("Log added: " + log);
    }

    public void displayLogs() {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
