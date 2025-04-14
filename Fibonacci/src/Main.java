//Fibonacci
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adımlı istiyorsunuz: ");
        int n = scanner.nextInt();
        int ilk =0, ikinci =1;
         for(int i =0; i<n;i++){
             System.out.println(ilk + "");
             int yeni = ilk + ikinci;
             ilk = ikinci;
             ikinci = yeni;

        }
    }
}