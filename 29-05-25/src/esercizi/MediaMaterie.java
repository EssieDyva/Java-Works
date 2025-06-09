package esercizi;

import esercizi.Voti;
import java.util.*;
/**Creare un programma che sulla base di 3 materie a vostra scelta, calcoli la media di ogni materia. 
 * (N.B. la struttura dati deve essere unica).
 */
public class MediaMaterie {
    public static void main(String[] args) {
        // Creazione di una mappa per memorizzare le materie e i voti
        Map<String, List<Integer>> materie = new HashMap<>();
        Scanner inputTastiera = new Scanner(System.in);

        // Inserimento dei nomi delle 3 materie senza duplicati
        for (int i = 0; i < 3; i++) {
            System.out.print("Inserisci il nome della materia " + (i + 1) + ": ");
            String materia = inputTastiera.nextLine();
            // Controlla se la materia è già stata inserita
            if (materie.containsKey(materia)) {
                System.out.println("Materia già inserita, riprova.");
                i--; // Decrementa per ripetere l'inserimento
                continue;
            }
            // Inizializza la lista dei voti nella mappa
            materie.put(materia, new ArrayList<>());
        }

        // Inserimento dei voti per ogni materia
        for (String materia : materie.keySet()) {
            System.out.println("\nInserisci i voti per la materia: " + materia);
            System.out.print("Quanti voti vuoi inserire per " + materia + "? ");
            int numVoti = inputTastiera.nextInt();
            inputTastiera.nextLine(); 

            // Inserimento dei singoli voti
            for (int i = 0; i < numVoti; i++) {
                System.out.print("Inserisci il voto " + (i + 1) + ": ");
                int voto = inputTastiera.nextInt();
                inputTastiera.nextLine(); 
                materie.get(materia).add(voto);
            }
        }

        // Calcolo e stampa della media per ogni materia
        for (String materia : materie.keySet()) {
            List<Integer> voti = materie.get(materia);
            try {
                // Calcola la media usando il metodo statico della classe Voti
                double media = Voti.calcolaMedia(voti);
                System.out.println("La media di " + materia + " è: " + media);
            } catch (InsufficienteException e) {
                // Gestisce il caso in cui la media sia insufficiente
                System.out.println("La media di " + materia + " è insufficiente: " + e.getMessage());
            }
        }
    }
}