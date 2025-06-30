package com.example.centroAdozioni.controllers;

import com.example.centroAdozioni.models.Animal;
import com.example.centroAdozioni.models.repository.DogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("api/dog/")
public class DogController {
    @GetMapping("selezionaCani")
    public List<Animal> selezionaCani() throws SQLException {
        return DogRepository.getAllDogs();
    }

    @PostMapping("inserisciCani")
    public ResponseEntity<Animal> inserisciCani(@RequestBody Animal animal) throws SQLException {
        Animal nuovoCane = DogRepository.insertDog(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovoCane);
    }

    @PutMapping("modificaCani/{id}")
    public ResponseEntity<Animal> modificaCani(@RequestBody Animal animal, @PathVariable int id) throws SQLException {
        Animal aggiornatoCane = DogRepository.updateDog(animal, id);
        if (aggiornatoCane != null) {
            return ResponseEntity.ok(aggiornatoCane);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("eliminaCani/{id}")
    public ResponseEntity<Void> eliminaCani(@PathVariable int id) throws SQLException {
        boolean isDeleted = DogRepository.deleteDog(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
