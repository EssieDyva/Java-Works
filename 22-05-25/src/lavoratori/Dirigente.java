package lavoratori;

public class Dirigente extends Lavoratore {
    private String divisione;
    private int numeroDipendentiGestiti;
    private int budgetGestito;

    public Dirigente() {}

    public Dirigente(String nome, String cognome, int stipendio, String anzianita, String divisione, int numeroDipendentiGestiti, int budgetGestito) {
        super(nome, cognome, stipendio, anzianita);
        this.divisione = divisione;
        this.numeroDipendentiGestiti = numeroDipendentiGestiti;
        this.budgetGestito = budgetGestito;
    }

    public String getDivisione() {
        return divisione;
    }
    public void setDivisione(String divisione) {
        this.divisione = divisione;
    }
    public int getNumeroDipendentiGestiti() {
        return numeroDipendentiGestiti;
    }
    public void setNumeroDipendentiGestiti(int numeroDipendentiGestiti) {
        this.numeroDipendentiGestiti = numeroDipendentiGestiti;
    }
    public int getBudgetGestito() {
        return budgetGestito;
    }
    public void setBudgetGestito(int budgetGestito) {
        this.budgetGestito = budgetGestito;
    }
}