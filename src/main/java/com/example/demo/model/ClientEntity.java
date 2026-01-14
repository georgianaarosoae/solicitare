package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clienti")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;

    public ClientEntity() {
    }

    public ClientEntity(String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }
}
