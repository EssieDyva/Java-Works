package com.concessionaria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String nomeCliente;
    private String cognomeCliente;
    private String codiceFiscale;
    private String numeroTelefono;
    private String genere;
}
