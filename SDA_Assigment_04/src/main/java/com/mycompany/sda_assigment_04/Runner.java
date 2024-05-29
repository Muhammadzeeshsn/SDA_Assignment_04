package com.mycompany.sda_assigment_04;



public class Runner {

    public static void main(String[] args) {
        // Initialize user management
        UserManager userManager = new UserManager();
        RegularUser regularUser = new RegularUser("john_doe", "password123", "john@example.com");
        AdminUser adminUser = new AdminUser("admin", "adminpass", "admin@example.com");

        userManager.addUser(regularUser);
        userManager.addUser(adminUser);
        userManager.displayUsers();

        // Initialize admin panel
        AdminPanel adminPanel = new AdminPanel(adminUser);
        adminPanel.addLog("System started by admin.");
        adminPanel.displayLogs();

        // Initialize system settings
        SystemSettings systemSettings = new SystemSettings();
        systemSettings.updateSetting("Max users: 100");
        systemSettings.updateSetting("Enable logging: true");
        systemSettings.displaySettings();

        // Initialize subscription management
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        Subscription subscription = new Subscription("john_doe", "Basic Plan");
        subscriptionManager.addSubscription(subscription);
        subscriptionManager.displaySubscriptions();

        // Initialize customer service
        CustomerServiceManager customerServiceManager = new CustomerServiceManager();
        CustomerInquiry generalInquiry = new GeneralInquiry("john_doe", "How do I change my password?");
        customerServiceManager.addInquiry(generalInquiry);
        customerServiceManager.displayInquiries();

        // Initialize file extraction
        FileExtractor fileExtractor = new FileExtractor();
        fileExtractor.addFile("purchaseorder", "PO1234.txt");
        fileExtractor.addFile("invoice", "INV5678.txt");
        fileExtractor.extractAllData();
    }
}


