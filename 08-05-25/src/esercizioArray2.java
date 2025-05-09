import java.util.Scanner;

public class esercizioArray2 {
    public static void main(String[] args) {
        // Variabili
        int[] numeri = new int[10];
        int numeriPari = 0;
        
        Scanner scanner = new Scanner(System.in);

        // Input numeri
        for (int i = 0; i < numeri.length; i++) {
            // Scrivi i numeri
            System.out.print("Inserisci il numero #" + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();

            // Controllo se il numero inserito è pari
            if (numeri[i] % 2 == 0) {
                numeriPari++;
            }
        }

        // Controllo se tutti i numeri sono pari e stampo
        if (numeriPari == numeri.length) {
            System.out.println("Tutti i numeri sono pari.");
        }
        // Stampa i numeri pari
        System.out.println("Numeri pari: " + numeriPari);
    }
}