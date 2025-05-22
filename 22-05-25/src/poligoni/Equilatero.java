package poligoni;

public class Equilatero extends Triangolo {
    private double lunghezzaLato;

    public Equilatero() {}

    public Equilatero(int numeroLati, String tipoTriangolo, double lunghezzaLato) {
        super(numeroLati, tipoTriangolo);
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
        // Perimetro di un triangolo equilatero: 3 * lato
        return 3 * this.lunghezzaLato;
    }

    @Override
    public double calcolaArea() {
        // Area di un triangolo equilatero: (lato^2 * sqrt(3)) / 4
        return (Math.pow(this.lunghezzaLato, 2) * Math.sqrt(3)) / 4;
    }
}