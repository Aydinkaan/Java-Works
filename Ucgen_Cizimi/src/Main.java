//Üçgen Çizimi
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını girin: ");
        int satir = scanner.nextInt();

        for (int i =1; i <= satir ;i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "");// println değil print kullanıyoruz aynı satıra yazması için
            }
            System.out.println();
        }
    }
}