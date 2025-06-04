package lavoratori;

public abstract class Lavoratore {
    protected String nome;
    protected String cognome;
    protected int stipendio;
    protected String anzianita;

    public Lavoratore() {}

    public Lavoratore(String nome, String cognome, int stipendio, String anzianita) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
        this.anzianita = anzianita;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public int getStipendio() {
        return stipendio;
    }
    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    public String getAnzianita() {
        return anzianita;
    }
    public void setAnzianita(String anzianita) {
        this.anzianita = anzianita;
    }
}
