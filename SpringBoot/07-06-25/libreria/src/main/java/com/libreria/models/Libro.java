package com.libreria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor //costruttore completo
@NoArgsConstructor //costruttore vuoto
@Data //getter and setter
@ToString
public class Libro implements Serializable {
    private String codiceISBN;
    private String autore;
    private String genere;

}
