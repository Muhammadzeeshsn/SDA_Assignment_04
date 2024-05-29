package com.mycompany.sda_assigment_04;

public class GeneralInquiry extends CustomerInquiry {
    public GeneralInquiry(String customerName, String inquiry) {
        super(customerName, inquiry);
    }

    @Override
    public void handleInquiry() {
        System.out.println("Handling general inquiry for customer: " + getCustomerName());
    }
}
