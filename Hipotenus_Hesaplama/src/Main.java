//Hipotenüs Hesabı Yapmak
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz: ");
        int birinci_kenar = scanner.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        int ikinci_kenar = scanner.nextInt();

        double hipotenus = Math.sqrt((birinci_kenar*birinci_kenar)+(ikinci_kenar*ikinci_kenar));
        System.out.println("Sonuç:");
        System.out.println("Birinci kenar: " + birinci_kenar);
        System.out.println("İkinci kenar: " + ikinci_kenar);
        System.out.println("Hipotenüs değeri: " + hipotenus);

    }
}