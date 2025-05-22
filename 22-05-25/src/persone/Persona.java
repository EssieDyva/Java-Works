package persone;

public class Persona {
    protected String nome;
    protected String cognome;
    protected int eta;
    protected char sesso; // true = maschio, false = femmina
    protected double altezza;
    
    public Persona() {}

    public Persona(String nome, String cognome, int eta, char sesso, double altezza) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.sesso = sesso;
        this.altezza = altezza;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getEta() {
        return eta;
    }
    public char getSesso() {
        return sesso;
    }
    public double getAltezza() {
        return altezza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public void setSesso(char sesso) {
        this.sesso = sesso;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

}
