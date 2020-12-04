import figures.*;

import java.util.Arrays;

public class figury {
    public static void main(String[] args) {

        Figure[] figures = new Figure[args[0].length()];
        int count = 0;
        int k = 1;
        for (int i = 0; i < args[0].length(); i++) {
            char f = args[0].charAt(i);
            switch (f) {
                case 'o':
                    double radius = Double.parseDouble(args[k]);
                    k++;
                    Kolo kolo = new Kolo(radius);
                    figures[count] = kolo;
                    count++;
                    break;
                case 'c':
                    double bok1 = Double.parseDouble(args[k]);
                    double bok2 = Double.parseDouble(args[k+1]);
                    double bok3 = Double.parseDouble(args[k+2]);
                    double bok4 = Double.parseDouble(args[k+3]);
                    double kat = Double.parseDouble(args[k+4]);
                    k+=5;
                    double[] s = {bok1, bok2, bok3, bok4};
                    Arrays.sort(s);
                    if (bok1 != bok4) {
                        Prostokat prostokat = new Prostokat(bok1, bok4);
                        figures[count] = prostokat;
                        count++;
                    } else if (kat == 90) {
                        Kwadrat kwadrat = new Kwadrat(bok1);
                        figures[count] = kwadrat;
                        count++;
                    } else {
                        Romb romb = new Romb(bok1, kat);
                        figures[count] = romb;
                        count++;
                    }
                    break;
                case 'p':
                case 's':
                    double bok = Double.parseDouble(args[k]);
                    k++;
                    Figure fig;
                    if (f=='p')
                        fig = new Pieciokat(bok);
                    else
                        fig = new Szesciokat(bok);
                    figures[count] = fig;
                    count++;
                    break;

            }
        }
        for (Figure figure : figures) {
            double p = figure.calcPerimeter();
            double s = figure.calcArea();
            System.out.printf("%6.3f %6.3f\n", p, s);
        }
    }
}
