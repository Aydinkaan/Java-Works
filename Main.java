//basamak değeri bulmak için do-while kullanabilirsin
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı girin:");
        int sayi = scanner.nextInt();
        int basamak_sayisi = String.valueOf(sayi).length();
        int gecici = sayi;
        int toplam = 0;
        do {
            int basamak_degeri = gecici % 10;
            gecici /= 10;
            toplam += Math.pow(basamak_degeri,basamak_sayisi);

        }
        while  (gecici > 0);
            if (sayi == toplam){
                System.out.println("Bu bir armstrong sayısıdır: " + sayi);
        }
            else {
                System.out.println("Armstrong sayısı değildir.");

        }
    }
}