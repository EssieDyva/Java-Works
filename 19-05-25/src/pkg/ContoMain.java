package pkg;

// Classe principale per testare i conti correnti
public class ContoMain {
    public static void main(String[] args) {
        // Crea un conto corrente bancario per Mario Rossi con saldo iniziale di 1000
        ContoCorrenteBancario conto1 = new ContoCorrenteBancario("123ABC", "Mario Rossi", 1000);
        conto1.deposita(500);         // Deposita 500 euro
        conto1.preleva(200);          // Preleva 200 euro
        conto1.visualizzaSaldo();     // Visualizza il saldo attuale

        System.out.println("------");

        // Crea un conto aziendale con saldo iniziale di 2000, partita IVA e fido di 5000
        ContoAziendale conto2 = new ContoAziendale("456XYZ", "Azienda SRL", 2000, "12345678901", 5000);
        conto2.deposita(1000);        // Deposita 1000 euro
        conto2.preleva(7000);         // Preleva 7000 euro (utilizza anche il fido)
        conto2.visualizzaSaldo();     // Visualizza il saldo attuale
        conto2.visualizzaDettagliAzienda(); // Visualizza i dettagli dell'azienda
    }
}