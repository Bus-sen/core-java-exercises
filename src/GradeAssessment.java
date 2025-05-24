import java.util.Scanner;

public class GradeAssessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        int grade = sc.nextInt();
        int option = grade/10;

        switch (option) {
            case 9:
                System.out.println("Harf notunuz: A");
                break;
                case 8:
                    System.out.println("Harf notunuz: B");
                    break;
                    case 7:
                        System.out.println("Harf notunuz: C");
                        break;
                        case 6:
                            System.out.println("Harf notunuz: D");
                            break;
            default:
                System.out.println("Harf notunuz: F");
        }
    }
}
