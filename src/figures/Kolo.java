package figures;

public class Kolo extends Figure {
    private double radius;

    public Kolo(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
