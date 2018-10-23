import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dziesiętną");
        int number = scanner.nextInt();
        if(number >= 0){
            String binary = Integer.toBinaryString(number);
            System.out.println("Liczba binarna to: " + binary);
        }else {
            System.out.println("Błąd: Liczba " + number + " nie jest liczba dodatnią");
        }
    }
}
