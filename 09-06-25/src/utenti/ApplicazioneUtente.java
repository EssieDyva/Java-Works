package utenti;

import java.util.Scanner;

public class ApplicazioneUtente {
    public static void avviaApplicazione() throws UtenteNontrovatoException {
        Scanner scanner = new Scanner(System.in);
        RegistroUtente registro = new RegistroUtente();
        int scelta;

        do {
            System.out.println("Che cosa vuoi fare?");
            System.out.println("1- Aggiungere un utente");
            System.out.println("2- Cancellare un utente");
            System.out.println("3- Modificare un utente");
            System.out.println("4- Cercare un utente");
            System.out.println("5- Mostra tutti gli utenti");
            System.out.println("0- Uscire dal programma");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Inserisci il cognome: ");
                    String cognome = scanner.nextLine();

                    System.out.print("Inserisci il genere: ");
                    String genere = scanner.nextLine();

                    System.out.print("Inserisci l'eta: ");
                    int eta = scanner.nextInt();

                    System.out.print("Inserisci CF: ");
                    String cf = scanner.nextLine();

                    Utente utente = new Utente(nome, cognome, genere, cf, eta );

                    registro.aggiungiUtente(utente);
                    break;
                case 2:
                    System.out.println("Inserisci il codice fiscale");
                    //String cf = scanner.nextLine();
                    //registro.cancellaUtente(cf);
            }
        } while (scelta != 0);
    }

//     for(
//    Utente u :utenti)
//
//    {
//        if (u.getCodiceFiscale().equalsIgnoreCase(cf)) {
//            System.out.println("Cosa vuoi modificare?");
//            System.out.println("2. Solo il nome");
//            System.out.println("3. Solo il cognome");
//            System.out.println("4. Solo il genere");
//            System.out.println("5. Solo l'età");
//            System.out.print("Scelta: ");
//            int scelta = Integer.parseInt(scanner.nextLine());
//
//            switch (scelta) {
//                case 1 -> {
//                    System.out.print("Nuovo nome: ");
//                    u.setNome(scanner.nextLine());
//
//                    System.out.print("Nuovo cognome: ");
//                    u.setCognome(scanner.nextLine());
//
//                    System.out.print("Nuovo genere: ");
//                    u.setGenere(scanner.nextLine());
//
//                    System.out.print("Nuova età: ");
//                    u.setEta(Integer.parseInt(scanner.nextLine()));
//                }
//                case 2 -> {
//                    System.out.print("Nuovo nome: ");
//                    u.setNome(scanner.nextLine());
//                }
//                case 3 -> {
//                    System.out.print("Nuovo cognome: ");
//                    u.setCognome(scanner.nextLine());
//                }
//                case 4 -> {
//                    System.out.print("Nuovo genere: ");
//                    u.setGenere(scanner.nextLine());
//                }
//                case 5 -> {
//                    System.out.print("Nuova età: ");
//                    u.setEta(Integer.parseInt(scanner.nextLine()));
//                }
//                default -> {
//                    return "Scelta non valida. Nessuna modifica effettuata.";
//                }
//            }
//            return "Utente modificato con successo: " + u;
//        }
//    }
//
//     return"Utente non trovato";*/

}
