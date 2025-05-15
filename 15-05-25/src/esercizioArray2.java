import java.util.Arrays;

/**Scrivere un programma che controlli se esiste una riga uguale
 * all'interno di un array, identica alla riga di un altro array
 */
public class esercizioArray2 {
    public static void main(String[] args) {
        String[][] matrix1 = {
            { "aa", "bb", "cc" },
            { "dd", "ee", "ff" },
            { "gg", "hh", "ii" },
            { "hg", "hash", "yt" }
        };
        String[][] matrix2 = {
            { "xx", "yy", "zz" },
            { "dgdf", "ee", "ff" },
            { "uu", "vv", "ww" },
            { "a", "ertete", "qwqw" },
            { "asasas", "sdsd", "ererwew" }
        };

        // Iterazione su tutte le righe della prima matrice
        for (int i = 0; i < matrix1.length; i++) {
            String[] riga1 = matrix1[i]; // Riga corrente della prima matrice
            // Iterazione su tutte le righe della seconda matrice
            for (int j = 0; j < matrix2.length; j++) {
                String[] riga2 = matrix2[j]; // Riga corrente della seconda matrice
                // Controlla se le due righe sono uguali
                if (Arrays.equals(riga1, riga2)) {
                    System.out.println("L'array con indice " + i + " della prima matrice, ovvero " + Arrays.toString(matrix1[i]) + 
                        " è uguale all'array con indice " + j + " della seconda matrice, ovvero: " + Arrays.toString(matrix2[j]));
                }
            }
        }
    }
}