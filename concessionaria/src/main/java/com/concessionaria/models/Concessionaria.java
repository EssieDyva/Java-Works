package com.concessionaria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Concessionaria {
    private String nomeConcessionario;
    private String codiceConcessionario;
    private String indirizzo;
}
