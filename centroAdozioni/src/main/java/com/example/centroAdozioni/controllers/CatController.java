package com.example.centroAdozioni.controllers;

import com.example.centroAdozioni.models.Animal;
import com.example.centroAdozioni.models.repository.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("api/cat/")
public class CatController {
    @GetMapping("selezionaGatti")
    public List<Animal> selezionaGatti() throws SQLException {
        return CatRepository.getAllCats();
    }

    @PostMapping("inserisciGatti")
    public ResponseEntity<Animal> inserisciGatti(@RequestBody Animal animal) throws SQLException {
        Animal nuovoCane = CatRepository.insertCat(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovoCane);
    }

    @PutMapping("modificaGatti/{id}")
    public ResponseEntity<Animal> modificaGatti(@RequestBody Animal animal, @PathVariable int id) throws SQLException {
        Animal aggiornatoCane = CatRepository.updateCat(animal, id);
        if (aggiornatoCane != null) {
            return ResponseEntity.ok(aggiornatoCane);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("eliminaGatti/{id}")
    public ResponseEntity<Void> eliminaGatti(@PathVariable int id) throws SQLException {
        boolean isDeleted = CatRepository.deleteCat(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
