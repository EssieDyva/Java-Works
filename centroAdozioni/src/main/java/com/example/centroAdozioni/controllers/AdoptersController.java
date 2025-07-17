package com.example.centroAdozioni.controllers;

import com.example.centroAdozioni.models.Adopters;
import com.example.centroAdozioni.models.repository.AdoptersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("api/adopters")
public class AdoptersController {

    @GetMapping("selezionaAdopters")
    public List<Adopters> selezionaAdopters() throws SQLException {
        return AdoptersRepository.getAllAdopters();
    }

    @PostMapping("inserisciAdopter")
    public ResponseEntity<Adopters> inserisciAdopter(@RequestBody Adopters adopter) throws SQLException {
        Adopters nuovoAdopter = AdoptersRepository.insertAdopter(adopter);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovoAdopter);
    }

    @PutMapping("modificaAdopter/{id}")
    public ResponseEntity<Adopters> modificaAdopter(@RequestBody Adopters adopter, @PathVariable int id) throws SQLException {
        Adopters aggiornatoAdopter = AdoptersRepository.updateAdopter(adopter, id);
        if (aggiornatoAdopter != null) {
            return ResponseEntity.ok(aggiornatoAdopter);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("eliminaAdopter/{id}")
    public ResponseEntity<Void> eliminaAdopter(@PathVariable int id) throws SQLException {
        boolean isDeleted = AdoptersRepository.deleteAdopter(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}