package figures;

public class Prostokat extends Czworokat {
    private double bok1;
    private double bok2;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (bok1 + bok2);
    }

    @Override
    public double calcArea() {
        return bok1 * bok2;
    }
}
