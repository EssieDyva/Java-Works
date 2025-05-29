package persone;

public class Universitario extends Studente {
    private String corsoDiLaurea;
    private String universita;

    public Universitario() {}

    public Universitario(String nome, String cognome, int eta, char sesso, double altezza, double mediaVoti, String classe, int numeroAnno, String corsoDiLaurea, String universita) {
        super(nome, cognome, eta, sesso, altezza, mediaVoti, classe, numeroAnno);
        this.corsoDiLaurea = corsoDiLaurea;
        this.universita = universita;
    }
    public String getCorsoDiLaurea() {
        return corsoDiLaurea;
    }
    public void setCorsoDiLaurea(String corsoDiLaurea) {
        this.corsoDiLaurea = corsoDiLaurea;
    }
    public String getUniversita() {
        return universita;
    }
    public void setUniversita(String universita) {
        this.universita = universita;
    }
}
