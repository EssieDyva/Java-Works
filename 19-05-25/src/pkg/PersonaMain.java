package pkg;

public class PersonaMain {
    public static void main(String[] args) {
        Persona primaPersona = new Persona();
        primaPersona.nome = "Almo";
        primaPersona.cognome = "Makoumba";
        primaPersona.altezza = 1.80;
        primaPersona.età = 29;

        System.out.println(primaPersona.printFullName());

        Persona secondaPersona = new Persona("Brianna", "Ciasnog");
        secondaPersona.altezza = 1.56;
        secondaPersona.età = 21;
    }
}