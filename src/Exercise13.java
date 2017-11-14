import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("Program do obliczania pola i obwodu trójkąta");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku a");
        double sideA = scanner.nextDouble();
        System.out.println("Podaj długość boku b");
        double sideB = scanner.nextDouble();
        System.out.println("Podaj długość boku c");
        double sideC = scanner.nextDouble();
        System.out.println("Podaj wysokość");

        double height = scanner.nextDouble();
        double area = (sideA / 2) * height;
        double perimeter = sideA + sideB + sideC;

        System.out.println("Pole = " + area);
        System.out.println("Obwód = " + perimeter);
    }
}
