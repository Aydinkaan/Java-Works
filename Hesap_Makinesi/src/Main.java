import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yapmak istediğiniz işlemi girin (Örnek:+,-,*,/):");
        String operator = scanner.nextLine();
        System.out.println("İkinci sayıyı giriniz");
        int b = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Geçersin bir işlem girdiniz!!");
        }
    }
}