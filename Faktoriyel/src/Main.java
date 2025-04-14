import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int baslangic = 1;
        int sonuc = 0;
        for (int i =1;i<=sayi;i++){
            System.out.println(i);
            baslangic *=i;
            sonuc=baslangic;
        }
        System.out.println("Sonuç: " + sonuc);
    }
}