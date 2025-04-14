// Girilen sayının basamaklarının toplamını bulmak
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int gecici = Math.abs(sayi); // Negatif sayıları da desteklemek için mutlak değer

        while (gecici > 0) {
            toplam += gecici % 10; // Son basamağı al ve toplama ekle
            gecici /= 10; // Sayıyı bir basamak küçült
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
