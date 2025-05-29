package esercizi;

import java.util.*;

/**Creare una lista di voti e stamparne la media */
public class Voti {
    public static void main(String[] args) {
        // Creazione di una lista di colori
        int numeroVoti = 5; // Numero di colori da inserire
        ArrayList<Integer> colori = new ArrayList<>(numeroVoti);

        // Creazione di uno scanner per leggere l'input da tastiera
        Scanner inputTastiera = new Scanner(System.in);

        // Scanner per l'input dell'utente
        for (int i = 0; i < numeroVoti; i++) {
            // Richiesta all'utente di inserire un colore
            System.out.print("Inserisci il voto " + (i + 1) + ": ");
            int voto = inputTastiera.nextInt();
            // Controllo se l'input è un voto valido
            if (voto < 0 || voto > 10) {
                System.out.println("Voto non valido, inserisci un voto tra 0 e 10.");
                i--; // Decrementa l'indice per ripetere l'inserimento
                continue; // Continua al prossimo ciclo
            }
            colori.add(voto);
        }

        // Stampa della media dei voti inseriti
        double somma = 0;
        for (int voto : colori) {
            somma += voto;
        }
        double media = somma / colori.size();
        System.out.println("\nLa media dei voti inseriti è: " + media);
    }
}
