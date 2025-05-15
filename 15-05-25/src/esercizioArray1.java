import java.util.Arrays;

/**Scrivere un programma che controlli se vi sono
 * due righe all'interno di una matrice uguali
 */
public class esercizioArray1 {
    public static void main(String[] args) {
        // Creazione di una matrice 4x4
        int[][] matrix = { 
            { 3, 2, 1, 7 },
            { 9, 11, 5, 4 },
            { 6, 0, 13, 17 },
            { 9, 11, 5, 4  },
            { 3, 2, 1, 7 },
            { 8, 12, 14, 15 }
        };

        // Iterazione su tutte le righe della matrice
        for (int i = 0; i < matrix.length; i++) {
            int[] riga = matrix[i]; // Riga corrente
            // Confronta la riga corrente con tutte le altre righe
            for (int j = 0; j < matrix.length; j++) {
                if (i != j) { // Evita di confrontare la riga con sé stessa
                    // Controlla se le due righe sono uguali
                    if (Arrays.equals(riga, matrix[j])) {
                        System.out.println("L'array con indice " + i + " ovvero " + Arrays.toString(matrix[i]) + 
                              " è uguale all'array con indice " + j + " ovvero: " + Arrays.toString(matrix[j]));
                    }
                }
            }
        }
    }
}