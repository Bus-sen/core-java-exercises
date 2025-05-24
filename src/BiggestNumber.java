import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int number1 = sc.nextInt();

        System.out.println("2.sayıyı giriniz: ");
        int number2 = sc.nextInt();

        System.out.println("3.sayıyı giriniz: ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3){
            System.out.println("En büyük sayı: " + number1);
        }
        else if (number2 > number1 && number2 > number3){
            System.out.println("En büyük sayı: " + number2);
        }
        else if (number3 > number1 && number3 > number2){
            System.out.println("En büyük sayı: " + number3);
        }
    }
}
