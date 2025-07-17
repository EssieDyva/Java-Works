package com.example.centroAdozioni.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adopters implements Serializable {
    private String name;
    private String email;
    private String phone;
}
