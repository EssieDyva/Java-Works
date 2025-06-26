package com.concessionaria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {
    private String nomeCliente;
    private String cognomeCliente;
    private String codiceFiscale;
    private String numeroTelefono;
    private String genere;
}
