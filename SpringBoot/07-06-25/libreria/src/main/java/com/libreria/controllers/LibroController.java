package com.libreria.controllers;

import com.libreria.models.Libro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/libro")
public class LibroController {

    @GetMapping("getLibroProva")
    public Libro getLibroProva() {
        Libro libro = new Libro();
        libro.setAutore("Anne Frank");
        libro.setGenere("Documentario");
        libro.setCodiceISBN("ISBN-293-108-395");

        return libro;
    }
}
