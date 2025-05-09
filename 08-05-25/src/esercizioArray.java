import java.util.Scanner;

public class esercizioArray {
    public static void main(String[] args) {
        // Variabili
        int[] voti = new int[6];
        float somma = 0;

        Scanner scanner = new Scanner(System.in);

        // Input voti
        for (int i = 0; i < voti.length; i++) {
            // Scrivi il voto dello studente
            System.out.print("Inserisci il voto dello studente #" + (i + 1) + ": ");
            voti[i] = scanner.nextInt();

            // Controlla se il voto è valido
            while (voti[i] < 0 || voti[i] > 10) {
                System.out.print("Voto non valido. Inserisci un voto tra 0 e 10: ");
                voti[i] = scanner.nextInt();
            }
            // Inserisco la somma dei numeri inseriti nella variabile somma
            somma = somma + voti[i];
        }
        // Calcolo della media
        float media = somma / voti.length;
        System.out.println("Media: " + media);
    }
}