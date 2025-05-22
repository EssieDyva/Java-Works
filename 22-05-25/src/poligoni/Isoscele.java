package poligoni;

public class Isoscele extends Triangolo {
    private double base;
    private double altezza;

    public Isoscele() {}

    public Isoscele(int numeroLati, String tipoTriangolo, double base, double altezza) {
        super(numeroLati, tipoTriangolo);
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
        // Perimetro di un triangolo isoscele: 2 * lato + base
        double lato = Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.altezza, 2));
        return 2 * lato + this.base;
    }

    @Override
    public double calcolaArea() {
        // Area di un triangolo isoscele: (base * altezza) / 2
        return (this.base * this.altezza) / 2;
    }
    
}
