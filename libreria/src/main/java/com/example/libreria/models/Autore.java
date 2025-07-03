package com.example.libreria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autore extends Persona implements Serializable {
    private String generePreferito;

    public Autore(String nome, String cognome, String generePreferito) {
        super(nome, cognome);
        this.generePreferito = generePreferito;
    }
}