package veicoli;

public class Moto extends Veicolo {
    private int cilindrata;
    private boolean haBaule;

    public Moto() {}

    public Moto(String marca, String modello, int anno, int cilindrata, boolean haBaule) {
        super(marca, modello, anno);
        this.cilindrata = cilindrata;
        this.haBaule = haBaule;
    }

    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public boolean isHaBaule() {
        return haBaule;
    }
    public void setHaBaule(boolean haBaule) {
        this.haBaule = haBaule;
    }
}