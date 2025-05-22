package poligoni;

public class Quadrato extends Poligono {
    private double lunghezzaLato;

    public Quadrato() {}

    public Quadrato(int numeroLati, double lunghezzaLato) {
        super(numeroLati);
        this.lunghezzaLato = lunghezzaLato;
    }

    public double getLunghezzaLato() {
        return lunghezzaLato;
    }
    public void setLunghezzaLato(double lunghezzaLato) {
        this.lunghezzaLato = lunghezzaLato;
    }

    @Override
    public double calcolaPerimetro() {
        return 4 * this.lunghezzaLato;
    }

    @Override
    public double calcolaArea() {
        return this.lunghezzaLato * this.lunghezzaLato;
    }
    
}
