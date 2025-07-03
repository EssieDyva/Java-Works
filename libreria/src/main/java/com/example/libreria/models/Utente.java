package com.example.libreria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Utente extends Persona implements Serializable {
    private int numeroCellulare;
    private String indirizzo;
    private String genere;

    public Utente(String nome, String cognome, int numeroCellulare, String indirizzo, String genere) {
        super(nome, cognome);
        this.numeroCellulare = numeroCellulare;
        this.indirizzo = indirizzo;
        this.genere = genere;
    }
}
