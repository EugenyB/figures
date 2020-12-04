package figures;

public class Romb extends Czworokat {
    private final double bok;
    private final double kat;

    public Romb(double bok, double kat) {
        this.bok = bok;
        this.kat = kat;
    }

    @Override
    public double calcPerimeter() {
        return bok * 4;
    }

    @Override
    public double calcArea() {
        return bok * bok * Math.sin(Math.toRadians(kat));
    }
}
