package poligoni;

public class Rettangolo extends Poligono {
    private double base;
    private double altezza;

    public Rettangolo() {}

    public Rettangolo(int numeroLati, double base, double altezza) {
        super(numeroLati);
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (this.base + this.altezza);
    }

    @Override
    public double calcolaArea() {
        return this.base * this.altezza;
    }
}