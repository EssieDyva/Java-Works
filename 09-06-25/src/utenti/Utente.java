package utenti;

public class Utente {
    private String nome;
    private String cognome;
    private String genere;
    private String codiceFiscale;
    private int eta;

    // Costruttori
    public Utente (String nome, String cognome, String genere, String codiceFiscale, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.codiceFiscale = codiceFiscale;
        this.eta = eta;
    }

    // Getters e Setters
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

    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta + '\'' +
                ", genere=" + genere + '\'' +
                ", codiceFiscale=" + codiceFiscale +
                '}';
    }
}
