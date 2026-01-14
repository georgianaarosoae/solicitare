package com.example.demo.service;

import com.example.demo.dto.SolicitareRequest;
import com.example.demo.model.SolicitareEntity;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
//
//public class ClientService {
//    private final ClientRepository repository;
//    private final Anga
//
//    @Autowired
//    public ClientService(ClientRepository repository) {
//        this.repository = repository;
//    }
//    public void addNewSolicitare(SolicitareRequest request){
//        SolicitareEntity solicitareRequest=new SolicitareEntity(request.getDescriereProblema(),request.getAdresa(),
//                request.getIdClient(),request.getIdAnimal());
//        repository.save(solicitareRequest)
//    }
//}
