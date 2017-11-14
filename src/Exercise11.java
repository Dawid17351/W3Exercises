import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println("Program do obliczania pola i obwodu koła");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień");

        double radius = scanner.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        double perimeter = radius * (2 * Math.PI);

        System.out.println("Pole = " + area);
        System.out.println("Obwód = " + perimeter);
    }
}
