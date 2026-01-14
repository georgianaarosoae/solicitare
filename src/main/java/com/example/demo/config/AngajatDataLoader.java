package com.example.demo.config;

import com.example.demo.model.AngajatEntity;
import com.example.demo.repository.AngajatRepository;
import org.springframework.boot.CommandLineRunner;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AngajatDataLoader  implements CommandLineRunner {
    private final AngajatRepository repository;

    public AngajatDataLoader(AngajatRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
