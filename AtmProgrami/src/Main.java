import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.işlem: Bakiye kontrol\n"
                + "2.işlem: Para yükleme\n"
                + "3.işlem: Para çekme\n"
                + "4.işlem Programdan çıkma";
        System.out.println(islemler);
        System.out.println("*************************");

        while (true) {
            System.out.println("Bir işlem seçiniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor..");
                break;
            }

            if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            } else if (islem.equals("2")) {
                System.out.println("Yüklemek istediğiniz tutarı giriniz:");
                int tutar = scanner.nextInt();
                System.out.println("Yüklemek istediğiniz tutar: " + tutar);
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutarı giriniz:");
                int tutar = scanner.nextInt();
                System.out.println("Çekmek istediğiniz tutar: " + tutar);
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);

            }
            else {
                System.out.println("Geçersiz bir işlem girdiniz..");
            }
        }
    }
}