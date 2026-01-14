package com.example.demo.mapper;

import com.example.demo.dto.SolicitareResponse;
import com.example.demo.model.SolicitareEntity;
import org.springframework.stereotype.Component;

@Component
public class SolicitareMapper {
    public SolicitareResponse toResponse(SolicitareEntity s) {
        return new SolicitareResponse(
                s.getId(),
                s.getClient().getNume(),
                s.getAnimal().getNume(),
                s.getDescriereProblema(),
                s.getAdresa(),
                s.getStadiu(),
                s.iseUrgenta(),
                s.getTimpEstimatDeSosire()
        );
    }
}
