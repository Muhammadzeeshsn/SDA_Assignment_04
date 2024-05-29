package com.mycompany.sda_assigment_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PurchaseOrderFile extends File {

    public PurchaseOrderFile(String fileName) {
        super(fileName);
    }

    @Override
    public void extractData() {
        validateFile();
        System.out.println("Extracting data from purchase order file: " + fileName);

        // Simulated data extraction logic
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Simulating parsing logic
                System.out.println("Parsed Purchase Order Data: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

