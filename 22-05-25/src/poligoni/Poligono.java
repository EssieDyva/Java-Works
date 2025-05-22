package poligoni;

public abstract class Poligono {
    protected int numeroLati;

    public Poligono() {}

    public Poligono(int numeroLati) {
        this.numeroLati = numeroLati;
    }
    
    public int getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }
    /** 
     * Metodo astratto per calcolare il perimetro del poligono
     * @return il perimetro del poligono
     */
    public abstract double calcolaPerimetro();
    public abstract double calcolaArea();

}