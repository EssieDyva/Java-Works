import java.util.Scanner;
import java.util.Arrays;

public class esempiArray {
    public static void main(String[] args) {
        int[] listaVoti = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listaVoti.length; i++) {
            
            System.out.print("Inserisci il voto dello studente #i:" + i);
            listaVoti[i] = scanner.nextInt();
        }
        
    }
}
