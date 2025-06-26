package com.concessionaria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Concessionaria implements Serializable {
    private String nomeConcessionario;
    private String codiceConcessionario;
    private String indirizzo;
}
