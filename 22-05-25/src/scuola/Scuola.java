package scuola;

public class Scuola {
    private String nomeScuola;
    private int numeroStudenti;
    private int numeroInsegnanti;
    private boolean online;
    private boolean laboratorio;

    public Scuola() {}

    public Scuola(String nomeScuola, int numeroStudenti, int numeroInsegnanti, boolean online, boolean laboratorio) {
        this.nomeScuola = nomeScuola;
        this.numeroStudenti = numeroStudenti;
        this.numeroInsegnanti = numeroInsegnanti;
        this.online = online;
        this.laboratorio = laboratorio;
    }

    public String getNomeScuola() {
        return nomeScuola;
    }
    public void setNomeScuola(String nomeScuola) {
        this.nomeScuola = nomeScuola;
    }
    public int getNumeroStudenti() {
        return numeroStudenti;
    }
    public void setNumeroStudenti(int numeroStudenti) {
        this.numeroStudenti = numeroStudenti;
    }
    public int getNumeroInsegnanti() {
        return numeroInsegnanti;
    }
    public void setNumeroInsegnanti(int numeroInsegnanti) {
        this.numeroInsegnanti = numeroInsegnanti;
    }
    public boolean isOnline() {
        return online;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }
    public boolean isLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }
}
