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
    
    public double getMediaVoti() {
        return mediaVoti;
    }
    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getNumeroAnno() {
        return numeroAnno;
    }
    public void setNumeroAnno(int numeroAnno) {
        this.numeroAnno = numeroAnno;
    }
}
