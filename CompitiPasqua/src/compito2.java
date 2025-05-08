import java.util.Scanner;

//compito 2
//Stampare i giorni della settimana inseriti dall’utente:
//Es: se utente inserisce 1 allora stampare lunedì, se inserisce 2 stampare martedì etc..

public class compito2 {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Richiesta all'utente di inserire un numero da 1 a 7
        System.out.print("Inserisci un numero da 1 a 7: ");
        int giorno = scanner.nextInt(); // Lettura del numero inserito dall'utente

        while (giorno < 1 || giorno > 7) {
            // Se il numero non è compreso tra 1 e 7, viene stampato un messaggio di errore
            System.out.println("Numero non valido. Inserisci un numero da 1 a 7:");
            giorno = scanner.nextInt(); // Richiesta di reinserire il numero
        }

        // Utilizzo di un'istruzione switch per determinare il giorno della settimana
        switch (giorno) {
            case 1:
                // Se l'utente inserisce 1, viene stampato "Lunedì"
                System.out.println("Lunedì");
                break;

            case 2:
                // Se l'utente inserisce 2, viene stampato "Martedì"
                System.out.println("Martedì");
                break;

            case 3:
                // Se l'utente inserisce 3, viene stampato "Mercoledì"
                System.out.println("Mercoledì");
                break;

            case 4:
                // Se l'utente inserisce 4, viene stampato "Giovedì"
                System.out.println("Giovedì");
                break;

            case 5:
                // Se l'utente inserisce 5, viene stampato "Venerdì"
                System.out.println("Venerdì");
                break;

            case 6:
                // Se l'utente inserisce 6, viene stampato "Sabato"
                System.out.println("Sabato");
                break;

            case 7:
                // Se l'utente inserisce 7, viene stampato "Domenica"
                System.out.println("Domenica");
                break;
                
        }
    }
}