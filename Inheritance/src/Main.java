import java.util.Scanner;

class Calisan {
    private String ad;
    private String soyad;
    private int ID;

    public Calisan(String ad, String soyad, int ID) {
        this.ad = ad;
        this.soyad = soyad;
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getID() {
        return ID;
    }

    public void bilgileriGoster() {
        System.out.println("Çalışan adı: " + this.ad);
        System.out.println("Çalışan soyadı: " + this.soyad);
        System.out.println("Çalışan ID: " + this.ID);
    }
}

class Yonetici extends Calisan {
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int ID, int sorumluKisiSayisi) {
        super(ad, soyad, ID);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumluKisiSayisi);
    }

    public void zamYap(int zamMiktari) {
        System.out.println(getAd() + " çalışanlara " + zamMiktari + " kadar zam yapıyor.");
    }
}

class Yazilimci extends Calisan {
    private String diller;

    public Yazilimci(String ad, String soyad, int ID, String diller) {
        super(ad, soyad, ID);
        this.diller = diller;
    }

    public void formatAt(String isletimSistemi) {
        System.out.println(getAd() + " " + isletimSistemi + "'ni yüklüyor.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller: " + diller);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Yazılımcı işlemleri\n2. Yönetici işlemleri\nÇıkış için q'ya basın");
            System.out.print("Seçiminiz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Kaan", "Aydın", 175, "Java, SQL");
                while (true) {
                    System.out.println("1. Format at\n2. Bilgileri göster\nÇıkış için q'ya basın");
                    System.out.print("Seçiminiz: ");
                    String yazilimciIslem = scanner.nextLine();

                    if (yazilimciIslem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    } else if (yazilimciIslem.equals("1")) {
                        System.out.print("İşletim sistemini girin: ");
                        String isletim = scanner.nextLine();
                        yazilimci.formatAt(isletim);
                    } else if (yazilimciIslem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz işlem!");
                    }
                }
            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Ahmet", "Aydın", 100, 2);
                while (true) {
                    System.out.println("1. Bilgileri Göster\n2. Zam Yap\nÇıkış için q'ya basın");
                    System.out.print("Seçiminiz: ");
                    String yoneticiIslem = scanner.nextLine();

                    if (yoneticiIslem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    } else if (yoneticiIslem.equals("1")) {
                        yonetici.bilgileriGoster();
                    } else if (yoneticiIslem.equals("2")) {
                        System.out.print("Yapılacak zam miktarını girin: ");
                        int zam = scanner.nextInt();
                        scanner.nextLine(); // buffer temizleme
                        yonetici.zamYap(zam);
                    } else {
                        System.out.println("Geçersiz işlem!");
                    }
                }
            } else {
                System.out.println("Geçersiz işlem!");
            }
        }
        scanner.close();
    }
}
