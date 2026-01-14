package com.example.demo.dto;

import com.example.demo.model.StadiuSolicitareEnum;

public class SolicitareResponse {
    private Long id;
    private String client;
    private String animal;
    private String descriereProblema;
    private String adresa;
    private StadiuSolicitareEnum stadiu;
    private boolean urgenta;
    private int timpEstimatDeSosire;

    public SolicitareResponse(Long id, String client, String animal, String descriereProblema, String adresa, StadiuSolicitareEnum stadiu, boolean urgenta, int timpEstimatDeSosire) {
        this.id = id;
        this.client = client;
        this.animal = animal;
        this.descriereProblema = descriereProblema;
        this.adresa = adresa;
        this.stadiu = stadiu;
        this.urgenta = urgenta;
        this.timpEstimatDeSosire = timpEstimatDeSosire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
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

    public StadiuSolicitareEnum getStadiu() {
        return stadiu;
    }

    public void setStadiu(StadiuSolicitareEnum stadiu) {
        this.stadiu = stadiu;
    }

    public boolean isUrgenta() {
        return urgenta;
    }

    public void setUrgenta(boolean urgenta) {
        this.urgenta = urgenta;
    }

    public int getTimpEstimatDeSosire() {
        return timpEstimatDeSosire;
    }

    public void setTimpEstimatDeSosire(int timpEstimatDeSosire) {
        this.timpEstimatDeSosire = timpEstimatDeSosire;
    }
}
