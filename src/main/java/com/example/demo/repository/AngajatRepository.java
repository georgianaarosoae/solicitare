package com.example.demo.repository;

import com.example.demo.model.AngajatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngajatRepository extends JpaRepository<AngajatEntity, Long> {
}
