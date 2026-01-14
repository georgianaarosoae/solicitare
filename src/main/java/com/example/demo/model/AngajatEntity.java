package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "angajati")
public class AngajatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;

    private boolean eDisponibil;

    public AngajatEntity() {
    }

    public AngajatEntity( String nume, boolean eDisponibil) {
        this.nume = nume;
        this.eDisponibil = eDisponibil;
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public boolean iseDisponibil() {
        return eDisponibil;
    }
}
