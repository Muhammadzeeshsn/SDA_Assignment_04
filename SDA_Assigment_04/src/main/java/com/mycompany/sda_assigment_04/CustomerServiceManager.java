package com.mycompany.sda_assigment_04;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceManager {
    private List<CustomerInquiry> inquiries;

    public CustomerServiceManager() {
        inquiries = new ArrayList<>();
    }

    public void addInquiry(CustomerInquiry inquiry) {
        inquiries.add(inquiry);
        System.out.println("Inquiry added for customer: " + inquiry.getCustomerName());
    }

    public void displayInquiries() {
        for (CustomerInquiry inquiry : inquiries) {
            System.out.println("Inquiry from customer: " + inquiry.getCustomerName() + " - " + inquiry.getInquiry());
        }
    }}
