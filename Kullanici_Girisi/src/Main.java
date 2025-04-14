//kullanıcı girişi
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullanici = "kaan aydın";
        String sys_parola = "kaan";

        System.out.println("Program girişine hoş geldiniz..");

        while (giris_hakki > 0) {
            System.out.println("Kullanıcı adınızı giriniz: ");
            String kullanici = scanner.nextLine();
            System.out.println("Parolanızı giriniz: ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)) {
                System.out.println("Programa Hoşgeldiniz..\n" + kullanici);
                break;
            } else {
                giris_hakki -= 1;

                if (kullanici.equals(sys_kullanici)) {
                    System.out.println("Parolanız yanlıştır.");

                } else {
                    System.out.println("Kullanıcı adı ve parolanız yanlış.");

                }

                if (giris_hakki == 0) {
                    System.out.println("Giriş hakkınız doldu..\nYine bekleriz..");
                    break;
                } else {
                    System.out.println("Kalan giriş hakkınız: " + giris_hakki);
                }
            }
        }
    }
}
