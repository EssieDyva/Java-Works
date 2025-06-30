package com.example.centroAdozioni.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String name;
    private int age;
    private String breed;
    private int gender;
    private String adoptionDate;
    private int box;
    private String checkIn;
    private int isAdopted;
    private int idAdopter;
}
