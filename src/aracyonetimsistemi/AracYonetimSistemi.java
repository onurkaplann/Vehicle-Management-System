package aracyonetimsistemi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class AracYonetimSistemi {

    public static void main(String[] args) throws IOException {
        ArrayList<Otomobil> otomobiller = new ArrayList<Otomobil>();
        ArrayList<Bisiklet> bisikletler = new ArrayList<Bisiklet>();
        ArrayList<Ucak> ucaklar = new ArrayList<Ucak>();
        ArrayList<Gemi> gemiler = new ArrayList<Gemi>();
        ArrayList<UcanGemi> ucanGemiler = new ArrayList<UcanGemi>();
        Scanner sc = new Scanner(System.in);
        
        Arayuz.eski_verileri_cek(otomobiller, bisikletler, ucaklar, gemiler,ucanGemiler);
        int cs;
        while (true) {
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:");
            System.out.println("1. Veri Girişinde Bulun");
            System.out.println("2. Veri Listele");
            System.out.println("3. Veri Guncelle");
            System.out.println("7. Çıkış");
            cs = sc.nextInt();

            if (cs == 1) {
                Arayuz.veriGirisindeBulun(otomobiller, bisikletler, ucaklar, gemiler,ucanGemiler);
            }
            if (cs == 2) {
                Arayuz.veriListele(otomobiller, bisikletler, ucaklar, gemiler,ucanGemiler);
            }
            if (cs == 3) {
                Arayuz.veriGuncelle(otomobiller, bisikletler, ucaklar, gemiler,ucanGemiler);
            }
            if (cs == 7) {
                System.out.println("İyi günler.");
                System.exit(0);
            }

        }
    }
    
}
