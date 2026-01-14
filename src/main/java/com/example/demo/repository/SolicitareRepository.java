package com.example.demo.repository;

import com.example.demo.model.SolicitareEntity;
import com.example.demo.model.StadiuSolicitareEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitareRepository extends JpaRepository<SolicitareEntity, Long> {
    List<SolicitareEntity> findByStadiu(StadiuSolicitareEnum stadiu);
}
