package com.example.demo.dto;

import com.example.demo.model.AngajatEntity;
import com.example.demo.model.AnimalEntity;
import com.example.demo.model.ClientEntity;
import com.example.demo.model.StadiuSolicitareEnum;

public class SolicitareDTO {
    private Long id;
    private String descriereProblema;
    private String adresa;
    private ClientEntity client;
    private AnimalEntity animal;
    private AngajatEntity angajat;
    private StadiuSolicitareEnum stadiu;
    private int timpEstimatDeSosire;
    private boolean eUrgenta;
}
