import java.util.Scanner;

// Compito 1
// Scrivere un programma che interpreti i voti scolastici inseriti dall’utente
// Se il voto è pari a 10 stampare eccellente;
// Se il voto è maggiore o uguale ad 8 stampare ottimo;
// Se il voto è maggiore o uguale a 6 stampare Sufficiente;
// Altrimenti insufficiente
// Se il voto non rientra nel range 0 – 10 allora stampare «voto non valido»

public class compito1 {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        
        // Chiede all'utente di inserire un voto
        System.out.print("Inserisci il voto: ");
        int voto = scanner.nextInt(); // Legge il voto inserito dall'utente

        // Controlla se il voto è fuori dal range valido (0-10)
        if (voto < 0 || voto > 10) {
            System.out.println("Voto non valido"); // Messaggio per voto non valido
        } 
        // Controlla se il voto è esattamente 10
        else if (voto == 10) {
            System.out.println("Eccellente"); // Messaggio per voto eccellente
        } 
        // Controlla se il voto è maggiore o uguale a 8
        else if (voto >= 8) {
            System.out.println("Ottimo"); // Messaggio per voto ottimo
        } 
        // Controlla se il voto è maggiore o uguale a 6
        else if (voto >= 6) {
            System.out.println("Sufficiente"); // Messaggio per voto sufficiente
        } 
        // Se il voto è inferiore a 6
        else {
            System.out.println("Insufficiente"); // Messaggio per voto insufficiente
        }
    }
}