import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int birinci_sayi;
            int ikinci_sayi;
            System.out.println("Bir sayı giriniz:");
            birinci_sayi = scanner.nextInt();
            System.out.println("Bir sayı giriniz:");
            ikinci_sayi = scanner.nextInt();

            System.out.println("Değişmeden önceki değerler");
            System.out.println("Birinci sayı: " + birinci_sayi);
            System.out.println("İkinci sayı: " + ikinci_sayi);

            int gecici = birinci_sayi;
            birinci_sayi = ikinci_sayi;
            ikinci_sayi = gecici;

            System.out.println("Değiştikten sonraki değerler");
            System.out.println("Birinci sayı: " + birinci_sayi);
            System.out.println("İkinci sayı: " + ikinci_sayi);

        }
    }
