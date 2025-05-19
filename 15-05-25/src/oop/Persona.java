package oop;

/**
 * Classe che va a definire le caratteristiche di una persona
 */
public class Persona { // attributi della classe Persona
    private String nome;
    private String cognome;
    private String genere;
    private String indirizzo;
    private String segnoZodiacale;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return this.cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getGenere() {
        return this.genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
    public String getIndirizzo() {
        return this.indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public String getSegnoZodiacale() {
        return this.segnoZodiacale;
    }
    public void setSegnoZodiacale(String segnoZodiacale) {
        this.segnoZodiacale = segnoZodiacale;
    }
}
