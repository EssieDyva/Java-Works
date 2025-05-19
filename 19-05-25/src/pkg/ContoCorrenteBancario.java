package pkg;

/**
 * La classe ContoCorrenteBancario rappresenta un conto corrente bancario semplice.
 * Permette di effettuare operazioni di deposito, prelievo e visualizzazione del saldo.
 * 
 * @param numeroConto il numero identificativo del conto corrente.
 * @param intestatario il nome dell'intestatario del conto.
 * @param saldo il saldo attuale del conto.
 */

public class ContoCorrenteBancario {
    protected String numeroConto;
    protected String intestatario;
    protected double saldo;

    public ContoCorrenteBancario(String numeroConto, String intestatario, double saldo) {
        this.numeroConto = numeroConto;
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public void deposita(double importo) {
        saldo += importo;
        System.out.println("Depositati " + importo + " €. Saldo attuale: " + saldo);
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelevati " + importo + " €. Saldo attuale: " + saldo);
        } else {
            System.out.println("Fondi insufficienti per prelevare " + importo + " €.");
        }
    }

    public void visualizzaSaldo() {
        System.out.println("Saldo attuale: " + saldo + " €");
    }
}
