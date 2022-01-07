import java.util.InputMismatchException;
import java.util.Scanner;

public class TestPunto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Inserisci il primo punto (x, y): ");
            double x = input.nextDouble();
            double y = input.nextDouble();
            Punto p1 = new Punto(x, y);
            System.out.println("Insersci il secondo punto (x, y): ");
            x = input.nextDouble();
            y = input.nextDouble();
            Punto p2 = new Punto(x, y);
            System.out.println(p1.distanzaDa(p2));
            System.out.println(p1.puntoMedio(p2));
            System.out.println(p1.equals(p2));
        } catch (InputMismatchException e) {
            System.out.println("Input errato");
        }

    }
}
