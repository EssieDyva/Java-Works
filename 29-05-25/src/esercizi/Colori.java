package esercizi;

import java.util.*;

/**Programma che permette all'utente di inserire dei colori, stampare i colori e successivamente ordinare
 * questi colori in ordine alfabetico.
 */
public class Colori {
    public static void main(String[] args) {
        // Creazione di una lista di colori
        int numeroColori = 5; // Numero di colori da inserire
        ArrayList<String> colori = new ArrayList<String>(numeroColori);

        // Creazione di uno scanner per leggere l'input da tastiera
        Scanner inputTastiera = new Scanner(System.in);

        // Scanner per l'input dell'utente
        for (int i = 0; i < numeroColori; i++) {
            // Richiesta all'utente di inserire un colore
            System.out.print("Inserisci il colore " + (i + 1) + ": ");
            colori.add(inputTastiera.nextLine());
        }

        // Stampa dei colori inseriti
        System.out.println("\nColori inseriti:");
        for (String colore : colori) {
            System.out.println(colore);
        }

        // Ordinamento dei colori in ordine alfabetico
        Collections.sort(colori);
        System.out.println("\nColori ordinati in ordine alfabetico:");
        for (String colore : colori) {
            System.out.println(colore);
        }

        try {
            /** Cercare un determinato colore inserito e stamparne la indice */
            System.out.print("Inserisci il colore da cercare: ");
            String coloreDaCercare = inputTastiera.nextLine();
    
            // Verifica se il colore esiste nella lista e stampa l'indice
            if (colori.contains(coloreDaCercare)) {
                int indice = colori.indexOf(coloreDaCercare);
                System.out.println("Il colore '" + coloreDaCercare + "' ha indice: " + (indice));
            }
            inputTastiera.close();
            throw new IncorrectColor("Colore non trovato: " + coloreDaCercare);
        }
        catch (IncorrectColor e) {
            // Gestione dell'eccezione se il colore non è trovato
            System.out.println(e.getMessage());
        }  
    }
}