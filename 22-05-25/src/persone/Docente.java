package persone;

public class Docente extends Persona {
    private String materia;
    private int numeroOreSettimanali;
    private double stipendio;

    public Docente() {}

    public Docente(String nome, String cognome, int eta, char sesso, double altezza, String materia, int numeroOreSettimanali, double stipendio) {
        super(nome, cognome, eta, sesso, altezza);
        this.materia = materia;
        this.numeroOreSettimanali = numeroOreSettimanali;
        this.stipendio = stipendio;
    }
}
