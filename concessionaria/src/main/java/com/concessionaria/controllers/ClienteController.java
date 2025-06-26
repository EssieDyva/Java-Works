package com.concessionaria.controllers;

import com.concessionaria.exceptions.UserAlreadyExistsException;
import com.concessionaria.models.Cliente;
import com.concessionaria.models.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/clienti")
public class ClienteController {
    @GetMapping("selezionaClienti")
    public List<Cliente> selezionaClienti() throws SQLException {
        return ClienteRepository.selectAllClienti();
    }

    @PostMapping("inserisciCliente")
    public ResponseEntity<Cliente> inserisciCliente(@RequestBody Cliente cliente) throws SQLException, UserAlreadyExistsException {
        Cliente nuovoCliente = ClienteRepository.inserisciCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovoCliente);
    }

    @PutMapping("aggiornaCliente/{codiceFiscale}")
    public ResponseEntity<Cliente> aggiornaCliente(@RequestBody Cliente cliente, @PathVariable String codiceFiscale) throws SQLException {
        Cliente clienteAggiornato = ClienteRepository.aggiornaCliente(cliente, codiceFiscale);
        return ResponseEntity.status(HttpStatus.OK).body(clienteAggiornato);
    }
}
