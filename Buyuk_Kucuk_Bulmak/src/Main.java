// Bir dizide en büyük ve en küçük elemanı bulmak
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girmek istediğiniz sayı adetini seçin:");
        int adet = scanner.nextInt();

        int [] arr = new int[adet]; // girilen adet büyüklüğünde bir array oluşturmak

        System.out.println("Dizinin elemanlarını girin: ");
        for (int i =0;i<adet;i++){
            System.out.println((i+1) + ". elemanı girin");
            arr[i] = scanner.nextInt(); // adet kadar elemanı arraye eklemek
        }
        Arrays.sort(arr); // arrayin içerisindeki elemanları büyükten küçüğe olarak sıralar
        System.out.println("En küçük eleman: " + arr[0]);// ilk eleman
        System.out.println("En büyük eleman: " + arr[arr.length-1]); // son eleman alır

    }
}