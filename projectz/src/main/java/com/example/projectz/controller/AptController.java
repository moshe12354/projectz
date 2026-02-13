package com.example.projectz.controller;


import com.example.projectz.dto.AptIn;
import com.example.projectz.model.Apt;
import com.example.projectz.service.AptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/apts")
public class AptController {
    @Autowired
    AptService AptService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllApts() {
        return new ResponseEntity<>(AptService.all(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneApt(@PathVariable Long id) {
        return new ResponseEntity<>(AptService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> insertApt(@RequestBody AptIn aptIn) {
        Apt apt = aptIn.toApt(aptIn);
        apt = AptService.save(apt);
        return new ResponseEntity<>(apt, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateApt(@PathVariable Long id, @RequestBody AptIn apt) {
        Optional<Apt> dbApt = AptService.findById(id);
        apt.updateApt(dbApt.get());
        Apt updateApt = AptService.save(dbApt.get());
        return new ResponseEntity<>(updateApt, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteApt(@PathVariable Long id) {
        Optional<Apt> dbApt = AptService.findById(id);
        AptService.delete(dbApt.get());
        return new ResponseEntity<>("DELETED", HttpStatus.OK);
    }
}
