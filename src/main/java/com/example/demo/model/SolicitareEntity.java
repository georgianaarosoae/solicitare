package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "solicitari")
public class SolicitareEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descriereProblema;
    private String adresa;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
    @ManyToOne
    @JoinColumn(name = "animal_id")
    private AnimalEntity animal;
    @ManyToOne
    @JoinColumn(name = "angajat_id")
    private AngajatEntity angajat;
    @Enumerated(EnumType.STRING)
    private StadiuSolicitareEnum stadiu;
    private int timpEstimatDeSosire;
    private boolean eUrgenta;

    public SolicitareEntity() {
    }

    public SolicitareEntity(String descriereProblema, String adresa, ClientEntity client, AnimalEntity animal, AngajatEntity angajat, StadiuSolicitareEnum stadiu, int timpEstimatDeSosire, boolean eUrgenta) {
        this.id = id;
        this.descriereProblema = descriereProblema;
        this.adresa = adresa;
        this.client = client;
        this.animal = animal;
        this.angajat = angajat;
        this.stadiu = stadiu;
        this.timpEstimatDeSosire = timpEstimatDeSosire;
        this.eUrgenta = eUrgenta;
    }

    public SolicitareEntity( String descriereProblema, String adresa, ClientEntity client, AnimalEntity animal) {
        this.id = id;
        this.descriereProblema = descriereProblema;
        this.adresa = adresa;
        this.client = client;
        this.animal = animal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriereProblema() {
        return descriereProblema;
    }

    public void setDescriereProblema(String descriereProblema) {
        this.descriereProblema = descriereProblema;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public AnimalEntity getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalEntity animal) {
        this.animal = animal;
    }

    public AngajatEntity getAngajat() {
        return angajat;
    }

    public void setAngajat(AngajatEntity angajat) {
        this.angajat = angajat;
    }

    public StadiuSolicitareEnum getStadiu() {
        return stadiu;
    }

    public void setStadiu(StadiuSolicitareEnum stadiu) {
        this.stadiu = stadiu;
    }

    public int getTimpEstimatDeSosire() {
        return timpEstimatDeSosire;
    }

    public void setTimpEstimatDeSosire(int timpEstimatDeSosire) {
        this.timpEstimatDeSosire = timpEstimatDeSosire;
    }

    public boolean iseUrgenta() {
        return eUrgenta;
    }

    public void seteUrgenta(boolean eUrgenta) {
        this.eUrgenta = eUrgenta;
    }
}
