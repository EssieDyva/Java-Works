package esercizi;

import java.util.*;
/**Scrivere un programma che controlli se una chiave esista o meno in una mappa.
 */
public class ControllaChiave {
    public static void main(String[] args) {
        // Crea una nuova mappa vuota
        Map<String, String> mappa = new HashMap<>();
        Scanner inputTastiera = new Scanner(System.in);

        // Chiede all'utente quante chiavi vuole inserire
        System.out.print("Quante chiavi vuoi inserire nella mappa? ");
        int numeroChiavi = inputTastiera.nextInt();
        inputTastiera.nextLine();

        // Inserisce le chiavi nella mappa
        for (int i = 0; i < numeroChiavi; i++) {
            System.out.print("Inserisci la chiave " + (i + 1) + ": ");
            String chiave = inputTastiera.nextLine();
            mappa.put(chiave, null); // Inserisce la chiave con valore null
        }
        
        // Chiede quale chiave cercare nella mappa
        System.out.print("Inserisci la chiave da cercare: ");
        String chiaveDaCercare = inputTastiera.nextLine();

        // Controlla se la chiave esiste nella mappa
        if (mappa.containsKey(chiaveDaCercare)) {
            System.out.println("La chiave '" + chiaveDaCercare + "' esiste nella mappa.");
        } else {
            System.out.println("La chiave '" + chiaveDaCercare + "' non esiste nella mappa.");
        }
    }
}