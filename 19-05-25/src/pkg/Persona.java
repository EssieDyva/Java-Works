package pkg;

public class Persona {
    public String nome;
    public String cognome;
    public int età;
    public double altezza;
    public float peso;
    public boolean disabilità;
    public Hobby hobby;

    // Costruttore
    public Persona(String nome, String cognome, int età, double altezza, float peso, boolean disabilità, Hobby hobby) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.altezza = altezza;
        this.peso = peso;
        this.disabilità = disabilità;
        this.hobby = hobby;
    }

    public Persona() {}

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String printFullName() {
        return this.nome + " " + this.cognome;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", età=" + età + '\'' +
                ", altezza=" + altezza + '\'' +
                ", peso=" + peso + '\'' +
                ", disabilità=" + disabilità +
                '}';
    }
}
