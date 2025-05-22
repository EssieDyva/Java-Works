package poligoni;

public abstract class Triangolo extends Poligono {
    protected String tipoTriangolo;

    public Triangolo() {}
    
    public Triangolo(int numeroLati, String tipoTriangolo) {
        super(numeroLati);
        this.tipoTriangolo = tipoTriangolo;
    }
    
    public String getTipoTriangolo() {
        return tipoTriangolo;
    }
    public void setTipoTriangolo(String tipoTriangolo) {
        this.tipoTriangolo = tipoTriangolo;
    }
}