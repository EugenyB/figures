package figures;

public class Kwadrat extends Czworokat {

    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double calcPerimeter() {
        return bok * 4;
    }

    @Override
    public double calcArea() {
        return bok * bok;
    }
}
