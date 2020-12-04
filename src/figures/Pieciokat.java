package figures;

public class Pieciokat extends Figure {
    private double bok;

    public Pieciokat(double bok) {
        this.bok = bok;
    }

    @Override
    public double calcPerimeter() {
        return 5 * bok;
    }

    @Override
    public double calcArea() {
        return 5 * bok * bok / 4 / Math.tan(Math.PI / 5);
    }
}
