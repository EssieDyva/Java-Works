import java.util.Scanner;
import java.lang.Math;
//compito 3
//Creare una calcolatrice ‘’scientifica’’. La questa calcolatrice deve essere costruita sulla base della calcolatrice 
//precedentemente creata ed oltre alle 4 operazioni base (+, -, *, /). 

public class compito3 {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Richiesta del primo numero all'utente
        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        // Richiesta del secondo numero all'utente
        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        // Presentazione delle opzioni di operazione disponibili
        System.out.println("Scegli un'operazione:");
        System.out.println("1. Somma (+)");
        System.out.println("2. Sottrazione (-)");
        System.out.println("3. Moltiplicazione (*)");
        System.out.println("4. Divisione (/)");
        System.out.println("5. Seno (sin)");
        System.out.println("6. Coseno (cos)");
        System.out.println("7. Tangente (tan)");
        System.out.println("8. Radice quadrata (sqrt)"); // Aggiunta dell'operazione esponenziale

        // Lettura della scelta dell'operazione da parte dell'utente
        int scelta = scanner.nextInt();

        // Variabile per memorizzare il risultato dell'operazione
        double risultato = 0;

        // Esecuzione dell'operazione scelta utilizzando un'istruzione switch
        switch (scelta) {
            case 1: // Caso per la somma
                risultato = num1 + num2;
                break;

            case 2: // Caso per la sottrazione
                risultato = num1 - num2;
                break;

            case 3: // Caso per la moltiplicazione
                risultato = num1 * num2;
                break;

            case 4: // Caso per la divisione
                if (num2 != 0) { // Controllo per evitare la divisione per zero
                    risultato = num1 / num2;
                } else {
                    // Messaggio di errore in caso di divisione per zero
                    System.out.println("Errore: Divisione per zero non consentita.");
                    return; // Uscita dal programma
                }
                break;

            case 5: // Caso per il seno
                // Calcolo del seno del primo numero
                risultato = Math.sin(num1);
                break;

            case 6: // Caso per il coseno
                // Calcolo del coseno del primo numero
                risultato = Math.cos(num1);
                break;

            case 7: // Caso per la tangente
                // Calcolo della tangente del primo numero
                risultato = Math.tan(num1);
                break;

            case 8: // Caso per la radice quadrata
                // Controllo se il numero è negativo
                if (num1 < 0) {
                    // Messaggio di errore in caso di radice quadrata di un numero negativo
                    System.out.println("Errore: Radice quadrata di un numero negativo non consentita.");
                    return; // Uscita dal programma
                }
                risultato = Math.sqrt(num1); // Calcolo della radice quadrata del primo numero
                break;
                
            default: // Caso per un'operazione non valida
                System.out.println("Operazione non valida.");
                return; // Uscita dal programma
        }

        // Stampa del risultato dell'operazione
        System.out.println("Il risultato dell'operazione scelta è: " + risultato);
    }
}