package com.example.projectz.service;


import com.example.projectz.model.Apt;
import com.example.projectz.repo.AptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AptService {
    @Autowired
    AptRepository repository;

    public Iterable<Apt> all() {
        return repository.findAll();
    }

    public Optional<Apt> findById(Long id) {
        return repository.findById(id);
    }

    public Apt save(Apt apt) {
        return repository.save(apt);
    }

    public void delete(Apt apt) {
        repository.delete(apt);
    }
}