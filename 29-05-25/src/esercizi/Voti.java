package esercizi;

import java.util.*;
/**Creare una lista di voti e stamparne la media */
public class Voti {
    // Metodo statico riutilizzabile da altri programmi
    public static double calcolaMedia(List<Integer> voti) throws InsufficienteException {
        double somma = 0;
        for (int voto : voti) {
            somma += voto;
        }
        double media = somma / voti.size();
        if (media < 6) {
            throw new InsufficienteException("La media dei voti è insufficiente: " + media);
        }
        return media;
    }

    public static void main(String[] args) {
        int numeroVoti = 5;
        ArrayList<Integer> voti = new ArrayList<>(numeroVoti);
        Scanner inputTastiera = new Scanner(System.in);

        for (int i = 0; i < numeroVoti; i++) {
            System.out.print("Inserisci il voto " + (i + 1) + ": ");
            int voto = inputTastiera.nextInt();
            if (voto < 0 || voto > 10) {
                System.out.println("Voto non valido, inserisci un voto tra 0 e 10.");
                i--;
                continue;
            }
            voti.add(voto);
        }

        try {
            double media = calcolaMedia(voti);
            System.out.println("\nLa media dei voti inseriti è: " + media);
        } catch (InsufficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
