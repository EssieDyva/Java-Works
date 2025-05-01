import java.util.Scanner;

//compito 4
//Scrivere un programma che in base al mese dell’anno inserito mi dica se tale mese è un mese invernale, primaverile, estivo, autunnale. 
//Se il mese non è valido stampare mese non valido

public class compito4 {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Richiesta all'utente di inserire un mese (1-12)
        System.out.println("Scegli un mese: ");
        System.out.println("1. Gennaio");
        System.out.println("2. Febbraio");
        System.out.println("3. Marzo");
        System.out.println("4. Aprile");
        System.out.println("5. Maggio");
        System.out.println("6. Giugno");
        System.out.println("7. Luglio");
        System.out.println("8. Agosto");
        System.out.println("9. Settembre");
        System.out.println("10. Ottobre");
        System.out.println("11. Novembre");
        System.out.println("12. Dicembre");
        System.out.print("Inserisci il numero del mese: ");
        int mese = scanner.nextInt(); // Lettura del mese inserito dall'utente
        // Utilizzo di un'istruzione switch per determinare la stagione in base al mese
        switch (mese) {
            case 1: // Gennaio
            case 2: // Febbraio
            case 12: // Dicembre
                System.out.println("Inverno");
                break;

            case 3: // Marzo
            case 4: // Aprile
            case 5: // Maggio
                System.out.println("Primavera");
                break;

            case 6: // Giugno
            case 7: // Luglio
            case 8: // Agosto
                System.out.println("Estate");
                break;

            case 9: // Settembre
            case 10: // Ottobre
            case 11: // Novembre
                System.out.println("Autunno");
                break;

            default:
                System.out.println("Mese non valido"); // Messaggio per mese non valido
        }
    }
}
