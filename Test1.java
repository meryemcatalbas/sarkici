package sarkici_projesi;
import java.util.Scanner;
public class Test1 {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    private static void islemleri_bastir() {
        System.out.println("\t 0_islemleri Goruntule");
        System.out.println("\t 1_Sarkicilari Goruntule");
        System.out.println("\t 2_Sarkici Ekle");
        System.out.println("\t 3_Sarkici Guncelle");
        System.out.println("\t 4_Sarkici Sil");
        System.out.println("\t 5_Sarkici Ara");
        System.out.println("\t 6_Uygulamadan Cik");
    } 
    public static void main(String[] args) {
        System.out.println("\t *****Sarkicilar uygulamasina hosgeldiniz****");
        islemleri_bastir();
        boolean cikis = false;
        int islem;
        while (!cikis ) {
            System.out.println("Bir islem seciniz");
            islem = scanner.nextInt();
           scanner.nextLine();
            switch (islem) {
            case 0:
                islemleri_bastir();
                break;
            case 1:
                sarkici_goruntule();
                break;
            case 2:
                sarkici_ekle();
                break;
            case 3:
                sarkici_guncelleme();
                break;
            case 4:
                sarkici_sil();
                break;
            case 5:
                sarkici_ara();
                break;
            case 6:
                cikis = true;
                break;
            default:
                System.out.println("uygulamadan cikiliyor");
                break;
            }
        }
    }
    private static void sarkici_ara() {
        System.out.println("Aramak istediginiz sarkicinin ismi:");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    private static void sarkici_sil() {
        System.out.println("Silmek istediginiz pozisyon(1,2,3...");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon - 1);
    }
    private static void sarkici_guncelleme() {
        System.out.println("Guncellemek istediginiz pozisyon(1,2,3...");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        String yeni_ismi = scanner.nextLine();
        sarkicilar.sarkici_guncelleme(yeni_ismi, pozisyon - 1);
    }
    private static void sarkici_ekle() {
        System.out.println("Eklemek istediginiz sarkiciyi giriniz");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    private static void sarkici_goruntule() {
        sarkicilar.sarkicilar_bastir();
        
    }
}
        
        