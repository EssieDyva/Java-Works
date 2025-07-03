package com.example.libreria.controllers;

import com.example.libreria.models.Utente;
import com.example.libreria.models.repository.UtenteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/utente")
public class UtenteController {
    @GetMapping("selezionaUtenti")
    public List<Utente> selezionaUtenti() throws SQLException {
        return UtenteRepository.getAllUtenti();
    }

    @PostMapping("inserisciUtente")
    public ResponseEntity<Utente> inserisciUtente(@RequestBody Utente utente) throws SQLException {
        Utente nuovoUtente = UtenteRepository.addUtente(utente);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovoUtente);
    }
}
