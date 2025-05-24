import java.util.Scanner;

public class SingleOrDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = sc.nextInt();

        int mod = number % 2;
        if (mod == 0){
            System.out.println(number + " " + "Çift sayıdır");
        }
        else{
            System.out.println(number + " " + "Tek sayıdır");
        }
    }
}
