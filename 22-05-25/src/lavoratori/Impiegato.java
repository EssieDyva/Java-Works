package lavoratori;

public class Impiegato extends Lavoratore {
    private String dipartimento;
    private boolean smartWorking;
    private String mansione;

    public Impiegato() {}

    public Impiegato(String nome, String cognome, int stipendio, String anzianita, String dipartimento, boolean smartWorking, String mansione) {
        super(nome, cognome, stipendio, anzianita);
        this.dipartimento = dipartimento;
        this.smartWorking = smartWorking;
        this.mansione = mansione;
    }

    public String getDipartimento() {
        return dipartimento;
    }
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }
    public boolean isSmartWorking() {
        return smartWorking;
    }
    public void setSmartWorking(boolean smartWorking) {
        this.smartWorking = smartWorking;
    }
    public String getMansione() {
        return mansione;
    }
    public void setMansione(String mansione) {
        this.mansione = mansione;
    }
}