package com.mycompany.sda_assigment_04;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionManager {
    private List<Subscription> subscriptions;

    public SubscriptionManager() {
        subscriptions = new ArrayList<>();
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
        System.out.println("Subscription added for user: " + subscription.getPlan());
    }

    public void removeSubscription(Subscription subscription) {
        subscriptions.remove(subscription);
        System.out.println("Subscription removed for user.");
    }

    public void displaySubscriptions() {
        for (Subscription subscription : subscriptions) {
            System.out.println("User: " + subscription.getPlan());
        }
    }
}