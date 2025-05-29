package persone;

public class Liceale extends Studente {
    private String tipoLiceo;
    private String indirizzo;

    public Liceale() {}

    public Liceale(String nome, String cognome, int eta, char sesso, double altezza, double mediaVoti, String classe, int numeroAnno, String tipoLiceo, String indirizzo) {
        super(nome, cognome, eta, sesso, altezza, mediaVoti, classe, numeroAnno);
        this.tipoLiceo = tipoLiceo;
        this.indirizzo = indirizzo;
    }

    public String getTipoLiceo() {
        return tipoLiceo;
    }
    public void setTipoLiceo(String tipoLiceo) {
        this.tipoLiceo = tipoLiceo;
    }
    
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}