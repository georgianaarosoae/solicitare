package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "animale")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;
    private String rasa;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity proprietar;

    public AnimalEntity() {
    }

    public AnimalEntity( String nume, String rasa, ClientEntity proprietar) {
        this.id = id;
        this.nume = nume;
        this.rasa = rasa;
        this.proprietar = proprietar;
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getRasa() {
        return rasa;
    }

    public ClientEntity getProprietar() {
        return proprietar;
    }
}
