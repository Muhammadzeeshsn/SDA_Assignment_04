package com.mycompany.sda_assigment_04;

public class Subscription implements SubscriptionActions {
    private String user;
    private String plan;

    // Constructor
    public Subscription(String user, String plan) {
        this.user = user;
        this.plan = plan;
    }

    @Override
    public void createSubscription(String plan) {
        this.plan = plan;
        System.out.println("Subscription created for user: " + user + " with plan: " + plan);
    }

    @Override
    public void cancelSubscription() {
        this.plan = null;
        System.out.println("Subscription cancelled for user: " + user);
    }

    public String getPlan() {
        return plan;
    }
}
