package com.mycompany.sda_assigment_04;

import java.util.ArrayList;
import java.util.List;

public class SystemSettings {
    private List<String> settings;

    public SystemSettings() {
        settings = new ArrayList<>();
    }

    public void updateSetting(String setting) {
        settings.add(setting);
        System.out.println("Setting updated: " + setting);
    }

    public void displaySettings() {
        for (String setting : settings) {
            System.out.println("Setting: " + setting);
        }
    }
}
