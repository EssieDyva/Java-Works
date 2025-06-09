package utenti;

import java.util.ArrayList;
import java.util.List;

public class RegistroUtente {
    private final List<Utente> utenti = new ArrayList<>();

    public String aggiungiUtente(Utente utente) {
        if (!utenti.contains(utente)) {
            utenti.add(utente);
            return "Utente aggiunto al registro";
        }
        return "Utente già esiste";
    }

    public String cancellaUtente(String cf) throws UtenteNontrovatoException {
        boolean removed = utenti.removeIf(u -> u.getCodiceFiscale().equalsIgnoreCase(cf));
        return removed ? "Utente cancellato" : "Utente non trovato o già cancellato";
    }

    public void modificaUtente(Utente utente, String cf) throws UtenteNontrovatoException {
        for (int i= 0; i <utenti.size(); i++) {
            if (utenti.get(i).getCodiceFiscale().equalsIgnoreCase(cf)) {
                utenti.set(i,utente);
                return;
            }
        }
        throw new UtenteNontrovatoException(cf);
    }

    public Utente cercaUtente(String cf) throws UtenteNontrovatoException {
        for (Utente u : utenti) {
            if (u.getCodiceFiscale().equalsIgnoreCase(cf)) {
                return u;
            }
        }
        throw new UtenteNontrovatoException(cf);
    }

    public List<Utente> tuttiUtenti() {
        return utenti;
    }
}