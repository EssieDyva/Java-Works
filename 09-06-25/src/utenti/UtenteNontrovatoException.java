package utenti;

public class UtenteNontrovatoException extends Exception {
    public UtenteNontrovatoException(String cf) {
        super("Utente con questo codice fiscale " + cf + " non trovato");
    }
}
