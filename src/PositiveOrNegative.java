import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println(number + " " + "Pozitif sayıdır");
        }
        else if (number == 0){
            System.out.println(number + " " + "0'dır");
        }
        else {
            System.out.println(number + " " + "Negatif sayıdır");
        }
    }
}
