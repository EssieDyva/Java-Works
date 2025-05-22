package persone;

public class Studente extends Persona {
    private double mediaVoti;
    private String classe;
    private int numeroAnno;

    public Studente() {}

    public Studente(String nome, String cognome, int eta, char sesso, double altezza, double mediaVoti, String classe, int numeroAnno) {
        super(nome, cognome, eta, sesso, altezza);
        this.mediaVoti = mediaVoti;
        this.classe = classe;
        this.numeroAnno = numeroAnno;
    }
    
}
