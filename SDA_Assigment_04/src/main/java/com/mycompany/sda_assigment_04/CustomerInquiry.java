package com.mycompany.sda_assigment_04;
public abstract class CustomerInquiry {
    private String customerName;
    private String inquiry;

    public CustomerInquiry(String customerName, String inquiry) {
        this.customerName = customerName;
        this.inquiry = inquiry;
    }

    public String getCustomerName() { return customerName; }
    public String getInquiry() { return inquiry; }

    // Abstract method to handle inquiries
    public abstract void handleInquiry();
}
