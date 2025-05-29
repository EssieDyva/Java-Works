package veicoli;

public class Auto extends Veicolo {
    private int numeroPorte;
    private boolean haClimatizzatore;

    public Auto(String marca, String modello, int anno, int numeroPorte, boolean haClimatizzatore) {
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
        this.haClimatizzatore = haClimatizzatore;
    }
    
    public int getNumeroPorte() {
        return numeroPorte;
    }
    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
    public boolean isHaClimatizzatore() {
        return haClimatizzatore;
    }
    public void setHaClimatizzatore(boolean haClimatizzatore) {
        this.haClimatizzatore = haClimatizzatore;
    }
}