import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int thirdNumber = scanner.nextInt();
        int average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + average);
    }
}
