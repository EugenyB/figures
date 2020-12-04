package figures;

public class Szesciokat extends Figure {
    private double bok;

    public Szesciokat(double bok) {
        this.bok = bok;
    }

    @Override
    public double calcPerimeter() {
        return 6 * bok;
    }

    @Override
    public double calcArea() {
        return 3 * Math.sqrt(3) * bok * bok / 2;
    }
}
