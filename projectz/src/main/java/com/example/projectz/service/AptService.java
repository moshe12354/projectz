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


    // סתם
    public void deleteById (Long id) {
        repository.deleteById(id);
    }





    // הוספות
    public Optional<Apt> findByCity (String city) {
        return repository.findByCity(city);
    }

    public Optional<Apt> findByStreet (String street) {
        return repository.findByStreet(street);
    }

    public Optional<Apt> findByType (String type) {
        return repository.findByType(type);
    }
    public Optional<Apt> findByPricePerMeter (int pricePerMeter) {
        return repository.findByPricePerMeter(pricePerMeter);
    }
    public Optional<Apt> findByTheMostExpensive () {
        return repository.findTopByOrderByPricePerMeterDesc();
    }
    public Optional<Apt> findByTheCheapest () {
        return repository.findTopByOrderByPricePerMeterAsc();
    }







}