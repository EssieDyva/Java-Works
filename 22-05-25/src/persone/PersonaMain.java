package persone;

public class PersonaMain {
    public static void main(String[] args) {
        Persona marioRossi = new Persona("Mario", "Rossi", 30, 'M', 1.75);
        System.out.println("Nome: " + marioRossi.getNome());
        System.out.println("Cognome: " + marioRossi.getCognome());
        System.out.println("Età: " + marioRossi.getEta());
        System.out.println("Sesso: " + marioRossi.getSesso());
        System.out.println("Altezza: " + marioRossi.getAltezza());

        Studente studente = new Studente("Luigi", "Verdi", 20, 'M', 1.80, 28.5, "3A", 3);
        System.out.println("Nome: " + studente.getNome());
        System.out.println("Cognome: " + studente.getCognome());
        System.out.println("Età: " + studente.getEta());
        System.out.println("Sesso: " + studente.getSesso());
        System.out.println("Altezza: " + studente.getAltezza());   
    }
}
