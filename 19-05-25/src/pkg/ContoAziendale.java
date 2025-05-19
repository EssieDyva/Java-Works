package pkg;

// La classe ContoAziendale estende ContoCorrenteBancario e aggiunge funzionalità specifiche per aziende
public class ContoAziendale extends ContoCorrenteBancario {
    private String partitaIVA; // Partita IVA dell'azienda
    private double fido;       // Fido disponibile per il conto

    // Costruttore che inizializza tutti gli attributi, inclusi quelli della superclasse
    public ContoAziendale(String numeroConto, String intestatario, double saldo, String partitaIVA, double fido) {
        super(numeroConto, intestatario, saldo); // chiama il costruttore della superclasse
        this.partitaIVA = partitaIVA;
        this.fido = fido;
    }

    // Override del metodo preleva per permettere il prelievo anche oltre il saldo, fino al limite del fido
    @Override
    public void preleva(double importo) {
        if (importo <= saldo + fido) { // Verifica se l'importo richiesto è disponibile considerando il fido
            saldo -= importo; // Aggiorna il saldo
            System.out.println("Prelevati " + importo + " €. Saldo attuale: " + saldo);
        } else {
            System.out.println("Importo superiore a saldo + fido disponibile.");
        }
    }

    // Metodo per visualizzare i dettagli specifici dell'azienda
    public void visualizzaDettagliAzienda() {
        System.out.println("Conto aziendale intestato a: " + intestatario);
        System.out.println("Partita IVA: " + partitaIVA);
        System.out.println("Fido disponibile: " + fido + " €");
    }
}