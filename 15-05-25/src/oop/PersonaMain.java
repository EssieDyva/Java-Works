package oop;

public class PersonaMain {
    public static void main(String[] args) {
        Persona personaProva = new Persona();
        // personaProva è un oggetto di tipo Persona, quindi posso usare i metodi definiti nella classe Persona
        personaProva.setNome("Stefano");
        personaProva.setCognome("De Siena");
        personaProva.setGenere("Maschio");
        personaProva.setIndirizzo("Via Roma 1");
        personaProva.setSegnoZodiacale("Sagittario");
    }
}