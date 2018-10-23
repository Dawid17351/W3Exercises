import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println("Program do liczby sumy liczb binarnych");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę binarną");
        int firstBinaryNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę binarną");
        int secondBinaryNumber = scanner.nextInt();

        binarySum(firstBinaryNumber, secondBinaryNumber);
    }
    public static void binarySum(int firstBinaryNumber, int secondBinaryNumber){
        String firstNumber = Integer.toString(firstBinaryNumber);
        String secondNumber = Integer.toString(secondBinaryNumber);
        int number1 = Integer.parseInt(firstNumber, 2);
        int number2 = Integer.parseInt(secondNumber, 2);
        int sum = number1 + number2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Suma = " + binarySum);
    }

}
