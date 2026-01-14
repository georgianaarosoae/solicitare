package com.example.demo.singletonObserver;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AngajatListener {

    private final NotificationService notificationService;
    private final List<String> notificari = new ArrayList<>();

    public AngajatListener(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostConstruct
    public void init() {
        notificationService.subscribe(this::receiveNotification);
    }

    private void receiveNotification(String message) {
        notificari.add(message);
        System.out.println("Angajat a primit notificare: " + message);
    }

    public List<String> getNotificari() {
        return notificari;
    }
}
