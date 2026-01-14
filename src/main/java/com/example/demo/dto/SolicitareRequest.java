package com.example.demo.dto;

public class SolicitareRequest {
    private String descriereProblema;
    private String adresa;
    private Long idClient;
    private Long idAnimal;

    public SolicitareRequest() {
    }

    public SolicitareRequest(String descriereProblema, String adresa, Long idClient, Long idAnimal) {
        this.descriereProblema = descriereProblema;
        this.adresa = adresa;
        this.idClient = idClient;
        this.idAnimal = idAnimal;
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

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }
}
