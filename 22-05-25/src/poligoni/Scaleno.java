package poligoni;

public class Scaleno extends Triangolo {
    private double latoA;
    private double latoB;
    private double latoC;

    public Scaleno() {}

    public Scaleno(int numeroLati, String tipoTriangolo, double latoA, double latoB, double latoC) {
        super(numeroLati, tipoTriangolo);
        this.latoA = latoA;
        this.latoB = latoB;
        this.latoC = latoC;
    }

    public double getLatoA() {
        return latoA;
    }
    public double getLatoB() {
        return latoB;
    }
    public double getLatoC() {
        return latoC;
    }

    public void setLatoA(double latoA) {
        this.latoA = latoA;
    }
    public void setLatoB(double latoB) {
        this.latoB = latoB;
    }
    public void setLatoC(double latoC) {
        this.latoC = latoC;
    }

    @Override
    public double calcolaPerimetro() {
        return this.latoA + this.latoB + this.latoC;
    }

    @Override
    public double calcolaArea() {
        // Formula di Erone per calcolare l'area di un triangolo scaleno
        double s = calcolaPerimetro() / 2; // semiperimetro
        return Math.sqrt(s * (s - this.latoA) * (s - this.latoB) * (s - this.latoC));
    }
    
}
