import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İsim giriniz: ");
        String name = sc.nextLine();

        System.out.println("Yaş giriniz: ");
        int age = sc.nextInt();

        System.out.println(name + " " + age + " " + "yaşındasınız ");
    }
}
