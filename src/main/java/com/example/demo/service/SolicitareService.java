package com.example.demo.service;

import com.example.demo.dto.SolicitareRequest;
import com.example.demo.dto.SolicitareResponse;
import com.example.demo.mapper.SolicitareMapper;
import com.example.demo.model.*;
import com.example.demo.repository.AngajatRepository;
import com.example.demo.repository.AnimalRepository;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.SolicitareRepository;
import com.example.demo.singletonObserver.NotificationService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SolicitareService {
    private final SolicitareRepository solicitareRepository;
    private final ClientRepository clientRepository;
    private final AnimalRepository animalRepository;
    private final AngajatRepository angajatRepository;
    private final SolicitareMapper mapper;
    private final NotificationService notificationService;

    public SolicitareService(SolicitareRepository solicitareRepository, ClientRepository clientRepository, AnimalRepository animalRepository, AngajatRepository angajatRepository, SolicitareMapper mapper, NotificationService notificationService) {
        this.solicitareRepository = solicitareRepository;
        this.clientRepository = clientRepository;
        this.animalRepository = animalRepository;
        this.angajatRepository = angajatRepository;
        this.mapper = mapper;
        this.notificationService = notificationService;
    }

    @PostConstruct
    public void init() {
        // Datele vin din DB / fișiere – exemplu minimal
        ClientEntity clientEntity = new ClientEntity("numeclient");
        clientRepository.save(clientEntity);
        AnimalEntity animal = new AnimalEntity( "numeAnimal", "rasa", clientEntity);
        animalRepository.save(animal);
        AngajatEntity angajat = new AngajatEntity( "nume", true);
        angajatRepository.save(angajat);
        SolicitareEntity solicitare = new SolicitareEntity( "Solicitare request1", "adresa 1", clientEntity, animal);
        List<SolicitareEntity> lista = List.of(
                solicitare, solicitare
        );
        solicitareRepository.saveAll(lista);
    }

    public void creareSolicitare(SolicitareRequest request) {
        ClientEntity client = clientRepository.findById(request.getIdClient())
                .orElseThrow(() -> new RuntimeException("Client inexistent"));

        AnimalEntity animal = animalRepository.findById(request.getIdAnimal())
                .orElseThrow(() -> new RuntimeException("Animal inexistent"));

        SolicitareEntity solicitare = new SolicitareEntity();
        solicitare.setClient(client);
        solicitare.setAnimal(animal);
        solicitare.setDescriereProblema(request.getDescriereProblema());
        solicitare.setAdresa(request.getAdresa());
        solicitare.setStadiu(StadiuSolicitareEnum.IN_ANALIZA);
        solicitare.setAngajat(new AngajatEntity( "Angajat 1", true));
        notificationService.notifyAll("Noua solicitare de la clienti:"+solicitare.getClient().getNume());
        solicitareRepository.save(solicitare);
    }

    public List<SolicitareResponse> getAll() {
        return solicitareRepository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public List<SolicitareResponse> filtrareDupaStadiu(StadiuSolicitareEnum stadiu) {
        return solicitareRepository.findByStadiu(stadiu)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public void analizaSolicitare(Long id, boolean urgenta, int timpEstimat) {
        SolicitareEntity solicitare = solicitareRepository.findById(id).orElseThrow();

        solicitare.seteUrgenta(urgenta);

        if (urgenta) {
            solicitare.setStadiu(StadiuSolicitareEnum.ACCEPTATA);
            solicitare.setTimpEstimatDeSosire(timpEstimat);
        } else {
            solicitare.setStadiu(StadiuSolicitareEnum.RESPINSA);
        }

        solicitareRepository.save(solicitare);
    }

    public void echipajPlecat(Long id) {
        SolicitareEntity solicitare = solicitareRepository.findById(id).orElseThrow();
        solicitare.setStadiu(StadiuSolicitareEnum.ECHIPAT_PLECAT_SPRE_CLIENT);
        solicitareRepository.save(solicitare);
    }
    @Transactional
    public void updateUrgenta(Long id, boolean urgenta) {
        SolicitareEntity solicitare = solicitareRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitare nu a fost găsită: " + id));
        solicitare.seteUrgenta(urgenta);
        solicitareRepository.save(solicitare);
    }

}
