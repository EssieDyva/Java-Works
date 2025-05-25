package scuola;

public class Informatica extends Scuola {
    private String linguaggi;

    public Informatica() {}

    public Informatica(String nomeScuola, int numeroStudenti, int numeroInsegnanti, boolean online, boolean laboratorio, String linguaggi) {
        super(nomeScuola, numeroStudenti, numeroInsegnanti, online, laboratorio);
        this.linguaggi = linguaggi;
    }

    public String getLinguaggi() {
        return linguaggi;
    }
    public void setLinguaggi(String linguaggi) {
        this.linguaggi = linguaggi;
    }
}
