import java.util.Scanner;
import java.util.Locale;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor (Örnek: 0,75): ");
        double kurus = scanner.nextDouble();
        System.out.println("Aracınız ile kaç km gittiniz:");
        int km = scanner.nextInt();
        System.out.println("Toplam ödemeniz gereken tutar = " + (kurus * km + "tldir."));

        }
    }
