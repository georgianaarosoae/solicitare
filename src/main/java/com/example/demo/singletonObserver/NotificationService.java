package com.example.demo.singletonObserver;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class NotificationService {

    private final List<Consumer<String>> subscribers = new ArrayList<>();

    // Angajații se abonează la notificări
    public void subscribe(Consumer<String> subscriber) {
        subscribers.add(subscriber);
    }

    // Trimite notificare la toți abonații
    public void notifyAll(String message) {
        for (Consumer<String> subscriber : subscribers) {
            subscriber.accept(message);
        }
    }
}
