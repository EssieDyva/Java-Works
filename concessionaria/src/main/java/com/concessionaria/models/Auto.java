package com.concessionaria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auto implements Serializable {
    private String modello;
    private String targa;
    private int anno;
    private String tipoCarburante;
    private String marca;
    private int numeroPorte;
    private int ibrida;
    private String codiceMeccanografico;
}
