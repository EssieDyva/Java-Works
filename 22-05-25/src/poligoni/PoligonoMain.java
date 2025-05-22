package poligoni;

public class PoligonoMain {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(4, 5);
        Rettangolo rettangolo = new Rettangolo(4, 5, 10);
        
        System.out.println("Perimetro del quadrato: " + quadrato.calcolaPerimetro());
        System.out.println("Area del quadrato: " + quadrato.calcolaArea());
        
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}