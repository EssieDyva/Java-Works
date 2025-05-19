package pkg;

public class Animale {
    private String nome;
    private String tipo;
    private String razza;
    private int età;
    private double peso;
    private boolean mammifero;
    private boolean puòVolare;

    // Costruttore
    public Animale(String nome, String tipo, String razza, int età, double peso, boolean mammifero, boolean puòVolare) {
        this.nome = nome;
        this.tipo = tipo;
        this.razza = razza;
        this.età = età;
        this.peso = peso;
        this.mammifero = mammifero;
        this.puòVolare = puòVolare;
    }

    @Override
    public String toString() {
        return "Animale{" + '\n' +
                "nome='" + nome + '\n' +
                "tipo='" + tipo + '\n' +
                "razza='" + razza + '\n' +
                "età=" + età + '\n' +
                "peso=" + peso + '\n' +
                "mammifero=" + mammifero + '\n' +
                "puòVolare=" + puòVolare +
                '}';
    }
}
