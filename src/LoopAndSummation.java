import java.util.Scanner;

public class LoopAndSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sayıların toplamı: " + sum);
    }
}
