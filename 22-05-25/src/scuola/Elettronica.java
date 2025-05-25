package scuola;

public class Elettronica extends Scuola {
    private String attrezzatureUsate;
    
    public Elettronica() {}

    public Elettronica(String nomeScuola, int numeroStudenti, int numeroInsegnanti, boolean online, boolean laboratorio, String attrezzatureUsate) {
        super(nomeScuola, numeroStudenti, numeroInsegnanti, online, laboratorio);
        this.attrezzatureUsate = attrezzatureUsate;
    }

    public String getAttrezzatureUsate() {
        return attrezzatureUsate;
    }
    public void setAttrezzatureUsate(String attrezzatureUsate) {
        this.attrezzatureUsate = attrezzatureUsate;
    }
}
