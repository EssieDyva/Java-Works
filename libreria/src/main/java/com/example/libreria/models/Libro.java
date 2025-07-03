package com.example.libreria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro implements Serializable {
    private String nomeLibro;
    private String matricolaAutore;
    private String genere;
    private int annoPubblicazione;
    private String casaEditrice;
    private int quantita;
}
