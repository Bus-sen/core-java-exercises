import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        float number1 = sc.nextInt();

        System.out.println("Sayı giriniz: ");
        float number2 = sc.nextInt();

        float sum = number1 + number2;
        System.out.println("Sayıların toplamı: " + sum);

        float sub = number1 - number2;
        System.out.println("Sayıların farkı: " + sub);

        float mul = number1 * number2;
        System.out.println("Sayıların çarpımı: " + mul );

        float div = number1 / number2;
        System.out.println("Sayıların bölümü: " + div);
    }
}
