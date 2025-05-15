/**Scrivere un programma che calcoli la somma dei numeri
 * che sono posizionati negli indici pari
 */
public class esercizioArray3 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int somma = 0; // Inizializza la somma a zero

        // Itera attraverso l'array
        for (int i = 0; i < array.length; i++) {
            // Controlla se l'indice è pari
            if (i % 2 == 0) {
                somma += array[i]; // Aggiungi il valore all somma
            }
        }
    }
}
