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

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public int getNumeroOreSettimanali() {
        return numeroOreSettimanali;
    }
    public void setNumeroOreSettimanali(int numeroOreSettimanali) {
        this.numeroOreSettimanali = numeroOreSettimanali;
    }
    public double getStipendio() {
        return stipendio;
    }
    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
}
