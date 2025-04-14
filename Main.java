// Asal sayı bulma
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi = scanner.nextInt();

        boolean asal = true; // tanımladık

        if (sayi < 2) {
            asal = false;
        }
        else {
            for (int i = 2; i<sayi;i++){ // Sayıya kadar olan tüm sayı değerlerine git ve sayıyı o değerlere böl
                if(sayi % i ==0){
                    asal = false;
                    break;
                }
            }
        }
        if (asal){
            System.out.println("Bu sayı asal sayıdır: " + sayi);
        }
        else {
            System.out.println("Bu sayı asal değildir..");
        }

    }
}