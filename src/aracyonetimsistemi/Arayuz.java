package aracyonetimsistemi;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Muhammed Ali
 */
public class Arayuz {

    public static void eski_verileri_cek(ArrayList<Otomobil> arabalar, ArrayList<Bisiklet> bisikletler, ArrayList<Ucak> ucaklar, ArrayList<Gemi> gemiler, ArrayList<UcanGemi> ucanGemiler) throws IOException {
        String ytur;
        double f;
        double h;
        String m;
        String r;
        int u;
        int ys;
        int ps;

        File mfile = new File("dosya.txt");
        if (!mfile.exists()) {
            mfile.createNewFile();
        }
        String[] parts = new String[10];
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(mfile));
        String str = "-1-2-3";
        str = reader.readLine();
        String[] strp = new String[15];
        strp = str.split("-");

        for (int j = 0; j < strp.length; j++) {

            parts = strp[j].split(",");

            if (Integer.parseInt(parts[0]) == 1) { //Arabaysa
                ytur = parts[1];
                f = Double.parseDouble(parts[2]);
                h = f = Double.parseDouble(parts[3]);
                m = parts[4];
                r = parts[5];
                u = Integer.parseInt(parts[6]);
                ys = Integer.parseInt(parts[7]);
                arabalar.add(new Otomobil(ytur, f, h, m, r, u, ys) {
                    public void setYakitTuru() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
            if (Integer.parseInt(parts[0]) == 2) { //Bisikletse
                f = Double.parseDouble(parts[1]);
                h = f = Double.parseDouble(parts[2]);
                m = parts[3];
                r = parts[4];
                u = Integer.parseInt(parts[5]);
                ys = Integer.parseInt(parts[6]);
                bisikletler.add(new Bisiklet(f, h, m, r, u, ys) {
                    @Override
                    public String getYakitTuru() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void setYakitTuru(String yt) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                } );
            }
            if (Integer.parseInt(parts[0]) == 3) { //Gemiyse

                f = Double.parseDouble(parts[1]);
                h = f = Double.parseDouble(parts[2]);
                m = parts[3];
                r = parts[4];
                u = Integer.parseInt(parts[5]);
                ys = Integer.parseInt(parts[6]);
                ps = Integer.parseInt(parts[7]);
                gemiler.add(new Gemi(f, h, m, r, u, ys, ps));
            }
            if (Integer.parseInt(parts[0]) == 4) { //Uçaksa
                f = Double.parseDouble(parts[1]);
                h = f = Double.parseDouble(parts[2]);
                m = parts[3];
                r = parts[4];
                u = Integer.parseInt(parts[5]);
                ys = Integer.parseInt(parts[6]);
                ucaklar.add(new Ucak(f, h, m, r, u, ys));
            }
            if (Integer.parseInt(parts[0]) == 5) { //ucanGemiyse

                f = Double.parseDouble(parts[1]);
                h = f = Double.parseDouble(parts[2]);
                m = parts[3];
                r = parts[4];
                u = Integer.parseInt(parts[5]);
                ys = Integer.parseInt(parts[6]);
                ps = Integer.parseInt(parts[7]);
                ucanGemiler.add(new UcanGemi(f, h, m, r, u, ys, ps));
            }
        }
    }

    public static void veriGirisindeBulun(ArrayList<Otomobil> arabalar, ArrayList<Bisiklet> bisikletler, ArrayList<Ucak> ucaklar, ArrayList<Gemi> gemiler, ArrayList<UcanGemi> ucanGemiler) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cs = 0;
        System.out.println("Lütfen marka renk gibi verileri girerken '-' kullanmayınız.");
        while (true) {
            System.out.println("Veri girişinde bulunacağınız aracı seçiniz");
            System.out.println("1.Otomobil");
            System.out.println("2.Bisiklet");
            System.out.println("3.Gemi");
            System.out.println("4.Uçak");
            System.out.println("5.Uçan gemi");
            System.out.println("6.Bir önceki menüye geri dön");
            System.out.println("7.Çıkış");
            cs = sc.nextInt();

            if (cs == 1) {           //Araba olustur
                String ytur;
                double f;
                double h;
                String m;
                String r;
                int u;
                int ys;
                int temp = 0;
                System.out.println("Yakıt türü giriniz :");
                sc.nextLine();           //Nextline daki hata yüzünden
                ytur = sc.nextLine();
                System.out.println("Marka giriniz :");
                m = sc.nextLine();
                System.out.println("Renk giriniz :");
                r = sc.nextLine();
                System.out.println("Fiyat giriniz :");
                f = sc.nextDouble();
                System.out.println("Hız giriniz :");
                h = sc.nextDouble();
                System.out.println("Üretim yılı giriniz :");
                u = sc.nextInt();
                System.out.println("Yolcu sayısı giriniz :");
                ys = sc.nextInt();
                arabalar.add(new Otomobil(ytur, f, h, m, r, u, ys) {} );
                
                System.out.println("Araba oluşturuldu.");

                System.out.println("Hizi degistirmek istiyor musunuz ? :");
                System.out.println("1.Hizlan");
                System.out.println("2.Yavasla");
                System.out.println("3.Dur");
                System.out.println("4.Hayır");
                temp = sc.nextInt();
                if (temp != 4) {
                    if (temp == 1) {
                        arabalar.get(arabalar.size() - 1).hizlan();
                    }
                    if (temp == 2) {
                        arabalar.get(arabalar.size() - 1).yavasla();
                    }
                    if (temp == 3) {
                        arabalar.get(arabalar.size() - 1).dur();
                    }
                }

                String str = new String();
                str = "1," + ytur + "," + f + "," + h + "," + m + "," + r + "," + u + "," + ys + "-";
                //Verileri dosyaya yazma                                                 https://gelecegiyazanlar.turkcell.com.tr/konu/android/egitim/android-101/javada-dosya-islemleri
                File file = new File("dosya.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                bWriter.write(str);
                bWriter.close();

            }
            if (cs == 2) {           //Bisiklet olustur
                double f;
                double h;
                String m;
                String r;
                int u;
                int ys;
                int temp=0;
                System.out.println("Marka giriniz :");
                sc.nextLine();                  //Nextline daki hata yüzünden
                m = sc.nextLine();
                System.out.println("Renk giriniz :");
                r = sc.nextLine();
                System.out.println("Fiyat giriniz :");
                f = sc.nextDouble();
                System.out.println("Hız giriniz :");
                h = sc.nextDouble();
                System.out.println("Üretim yılı giriniz :");
                u = sc.nextInt();
                System.out.println("Yolcu sayısı giriniz :");
                ys = sc.nextInt();
                bisikletler.add(new Bisiklet(f, h, m, r, u, ys) {
                    @Override
                    public String getYakitTuru() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void setYakitTuru(String yt) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                } );
                System.out.println("Bisiklet oluşturuldu");
                
                System.out.println("Hizi degistirmek istiyor musunuz ? :");
                System.out.println("1.Hizlan");
                System.out.println("2.Yavasla");
                System.out.println("3.Dur");
                System.out.println("4.Hayır");
                temp = sc.nextInt();
                if (temp != 4) {
                    if (temp == 1) {
                        bisikletler.get(bisikletler.size() - 1).hizlan();
                    }
                    if (temp == 2) {
                        bisikletler.get(bisikletler.size() - 1).yavasla();
                    }
                    if (temp == 3) {
                        bisikletler.get(bisikletler.size() - 1).dur();
                    }
                }

                String str = new String();
                str = "2," + f + "," + h + "," + m + "," + r + "," + u + "," + ys + "-";
                File file = new File("dosya.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                bWriter.write(str);
                bWriter.close();
            }
            if (cs == 3) {           //Gemi olusturma
                double f;
                double h;
                String m;
                String r;
                int u;
                int ys;
                int ps;
int temp=0;
                System.out.println("Marka giriniz :");
                sc.nextLine();                  //Nextline daki hata yüzünden
                m = sc.nextLine();
                System.out.println("Renk giriniz :");
                r = sc.nextLine();
                System.out.println("Fiyat giriniz :");
                f = sc.nextDouble();
                System.out.println("Hız giriniz :");
                h = sc.nextDouble();
                System.out.println("Üretim yılı giriniz :");
                u = sc.nextInt();
                System.out.println("Yolcu sayısı giriniz :");
                ys = sc.nextInt();
                System.out.println("Pervane sayısı giriniz :");
                ps = sc.nextInt();
                gemiler.add(new Gemi(f, h, m, r, u, ys, ps));
                System.out.println("Gemi oluşturuldu");
                
                System.out.println("Hizi degistirmek istiyor musunuz ? :");
                System.out.println("1.Hizlan");
                System.out.println("2.Yavasla");
                System.out.println("3.Dur");
                System.out.println("4.Hayır");
                temp = sc.nextInt();
                if (temp != 4) {
                    if (temp == 1) {
                        gemiler.get(gemiler.size() - 1).hizlan();
                    }
                    if (temp == 2) {
                        gemiler.get(gemiler.size() - 1).yavasla();
                    }
                    if (temp == 3) {
                        gemiler.get(gemiler.size() - 1).dur();
                    }
                }

                String str = new String();
                str = "3," + f + "," + h + "," + m + "," + r + "," + u + "," + ys + "," + ps + "-";
                File file = new File("dosya.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                bWriter.write(str);
                bWriter.close();
            }
            if (cs == 4) {                   //Ucak Olustur
                double f;
                double h;
                String m;
                String r;
                int u;
                int ys;
                int temp=0;
                
                System.out.println("Marka giriniz :");
                sc.nextLine();                  //Nextline daki hata yüzünden
                m = sc.nextLine();
                System.out.println("Renk giriniz :");
                r = sc.nextLine();
                System.out.println("Fiyat giriniz :");
                f = sc.nextDouble();
                System.out.println("Hız giriniz :");
                h = sc.nextDouble();
                System.out.println("Üretim yılı giriniz :");
                u = sc.nextInt();
                System.out.println("Yolcu sayısı giriniz :");
                ys = sc.nextInt();
                ucaklar.add(new Ucak(f, h, m, r, u, ys));
                System.out.println("Uçak oluşturuldu");
                
                System.out.println("Hizi degistirmek istiyor musunuz ? :");
                System.out.println("1.Hizlan");
                System.out.println("2.Yavasla");
                System.out.println("3.Dur");
                System.out.println("4.Hayır");
                temp = sc.nextInt();
                if (temp != 4) {
                    if (temp == 1) {
                        ucaklar.get(ucaklar.size() - 1).hizlan();
                    }
                    if (temp == 2) {
                        ucaklar.get(ucaklar.size() - 1).yavasla();
                    }
                    if (temp == 3) {
                        ucaklar.get(ucaklar.size() - 1).dur();
                    }
                }
                String str = new String();
                str = "4," + f + "," + h + "," + m + "," + r + "," + u + "," + ys + "-";
                File file = new File("dosya.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                bWriter.write(str);
                bWriter.close();
            }
            if (cs == 5) {                   //UcanGemi Olustur
                double f;
                double h;
                String m;
                String r;
                int u;
                int ys;
                int ps;
                int temp=0;
                
                System.out.println("Marka giriniz :");
                sc.nextLine();                  //Nextline daki hata yüzünden
                m = sc.nextLine();
                System.out.println("Renk giriniz :");
                r = sc.nextLine();
                System.out.println("Fiyat giriniz :");
                f = sc.nextDouble();
                System.out.println("Hız giriniz :");
                h = sc.nextDouble();
                System.out.println("Üretim yılı giriniz :");
                u = sc.nextInt();
                System.out.println("Yolcu sayısı giriniz :");
                ys = sc.nextInt();
                System.out.println("Pervane sayısı giriniz :");
                ps = sc.nextInt();
                ucanGemiler.add(new UcanGemi(f, h, m, r, u, ys, ps));
                System.out.println("ucanGemi oluşturuldu");
                
                System.out.println("Hizi degistirmek istiyor musunuz ? :");
                System.out.println("1.Hizlan");
                System.out.println("2.Yavasla");
                System.out.println("3.Dur");
                System.out.println("4.Hayır");
                temp = sc.nextInt();
                if (temp != 4) {
                    if (temp == 1) {
                        ucanGemiler.get(ucanGemiler.size() - 1).hizlan();
                    }
                    if (temp == 2) {
                        ucanGemiler.get(ucanGemiler.size() - 1).yavasla();
                    }
                    if (temp == 3) {
                        ucanGemiler.get(ucanGemiler.size() - 1).dur();
                    }
                }
                String str = new String();
                str = "5," + f + "," + h + "," + m + "," + r + "," + u + "," + ys + "," + ps + "-";
                File file = new File("dosya.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                bWriter.write(str);
                bWriter.close();
            }
            if (cs == 6) {
                return;
            }
            if (cs == 7) {
                System.out.println("İyi günler.");
                System.exit(0);
            }
        }
    }

    public static void veriListele(ArrayList<Otomobil> arabalar, ArrayList<Bisiklet> bisikletler, ArrayList<Ucak> ucaklar, ArrayList<Gemi> gemiler, ArrayList<UcanGemi> ucanGemiler) {
        System.out.println("Kayıtlarda bulunan otomobil sayısı : " + (arabalar.size()));
        System.out.println("Kayıtlarda bulunan Bisiklet sayısı : " + (bisikletler.size()));
        System.out.println("Kayıtlarda bulunan gemi sayısı : " + (gemiler.size()));
        System.out.println("Kayıtlarda bulunan uçak sayısı : " + (ucaklar.size()));
        System.out.println("Kayıtlarda bulunan ucanGemi sayısı : " + (ucanGemiler.size()));
        int cs = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Listelemek istediginiz veri tipini seçiniz");
            System.out.println("1.Kara taşıtları");
            System.out.println("2.Hava taşıtları");
            System.out.println("3.Deniz taşıtları");
            System.out.println("6.Bir önceki menüye dön");
            System.out.println("7.Çıkış");
            cs = sc.nextInt();

            if (cs == 1) {  //Kara tasitlari
                for (int i = 0; i < arabalar.size(); i++) {
                    System.out.println((i + 1) + ". Araba : ");
                    arabalar.get(i).ozelliklerYazdir();
                    System.out.println("");
                }
                System.out.println("----------------------------------");
                for (int i = 0; i < bisikletler.size(); i++) {
                    System.out.println((i + 1) + ". Bisiklet : ");
                    bisikletler.get(i).ozelliklerYazdir();
                    System.out.println("");
                }

            }

            if (cs == 2) {  //Hava tasitlari
                System.out.println("----------------------------------");
                for (int i = 0; i < ucaklar.size(); i++) {
                    System.out.println((i + 1) + ". Uçak : ");
                    ucaklar.get(i).ozelliklerYazdir();
                    System.out.println("");
                }
                for (int i = 0; i < ucanGemiler.size(); i++) {
                    System.out.println((i + 1) + ". UcanGemi : ");
                    ucanGemiler.get(i).ozelliklerYazdir();
                    System.out.println("");
                }
            }
            if (cs == 3) {  //Deniz tasitlari
                System.out.println("----------------------------------");
                for (int i = 0; i < gemiler.size(); i++) {
                    System.out.println((i + 1) + ". Gemi : ");
                    gemiler.get(i).ozelliklerYazdir();
                    System.out.println("");
                }
                for (int i = 0; i < ucanGemiler.size(); i++) {
                    System.out.println((i + 1) + ". UcanGemi : ");
                    ucanGemiler.get(i).ozelliklerYazdir();
                    System.out.println("");
                }
            }
            if (cs == 6) {
                return;
            }
            if (cs == 7) {
                System.exit(0);
            }
        }

    }

    public static void veriGuncelle(ArrayList<Otomobil> arabalar, ArrayList<Bisiklet> bisikletler, ArrayList<Ucak> ucaklar, ArrayList<Gemi> gemiler, ArrayList<UcanGemi> ucanGemiler) throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = new String();
        int cs = 0;
        double temp = 0;
        String tmp = new String();
        while (true) {

            System.out.println("Güncellemek istediğiniz aracın ID sini giriniz : (Çıkmak için 'c' giriniz )");
            key = sc.nextLine();

            if (key.equals("c")) {
                break;
            }

            if (key.contains("Otomobil")) { //Girilen seriNo otomobil kelimesini içeriyorsa ,
                int i = Integer.parseInt(key.replaceAll("[\\D]", ""));//Sadece sayı olan kısmını alır.

                while (true) {

                    System.out.println("Bu otomobilin hangi özelliğini güncellemek istiyorsunuz ?");
                    System.out.println("1.Fiyat");
                    System.out.println("2.Hız");
                    System.out.println("3.Marka");
                    System.out.println("4.Renk");
                    System.out.println("5.Üretim Yılı");
                    System.out.println("6.Yakıt türü");
                    System.out.println("7.Yolcu sayısı");
                    System.out.println("8.Önceki menüye dön");
                    System.out.println("9.Çıkış");

                    cs = sc.nextInt();
                    sc.nextLine();  //nextline hatası yüzünden
                    if (cs == 1) {
                        System.out.println("Arabanın eski fiyatı :" + arabalar.get(i - 1).getFiyat());
                        System.out.println("Yeni fiyat giriniz : ");
                        temp = sc.nextDouble();
                        sc.nextLine();  //nextline hatası yüzünden
                        arabalar.get(i - 1).setFiyat(temp);
                    }
                    if (cs == 2) {
                        System.out.println("Arabanın eski hızı :" + arabalar.get(i - 1).getHiz());
                        System.out.println("Yeni hız giriniz : ");
                        temp = sc.nextDouble();
                        sc.nextLine();  //nextline hatası yüzünden
                        arabalar.get(i - 1).setHiz(temp);
                    }
                    if (cs == 3) {
                        System.out.println("Arabanın eski markası :" + arabalar.get(i - 1).getMarka());
                        System.out.println("Yeni marka giriniz : ");
                        tmp = sc.nextLine();
                        arabalar.get(i - 1).setMarka(tmp);
                    }
                    if (cs == 4) {
                        System.out.println("Arabanın eski rengi :" + arabalar.get(i - 1).getRenk());
                        System.out.println("Yeni renk giriniz : ");
                        tmp = sc.nextLine();
                        arabalar.get(i - 1).setRenk(tmp);
                    }
                    if (cs == 5) {
                        System.out.println("Arabanın eski üretim yılı : " + arabalar.get(i - 1).getUretimYili());
                        System.out.println("Yeni üretim yılını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        arabalar.get(i - 1).setUretimYili(cs);
                    }
                    if (cs == 6) {
                        System.out.println("Arabanın eski yakıt türü :" + arabalar.get(i - 1).getYakitTuru());
                        System.out.println("Yeni yakıt türü giriniz : ");
                        tmp = sc.nextLine();
                        arabalar.get(i - 1).setYakitTuru(tmp);
                    }
                    if (cs == 7) {
                        System.out.println("Arabanın eski yolcu sayısı : " + arabalar.get(i - 1).getYolcuSayisi());
                        System.out.println("Yeni yolcu sayısını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        arabalar.get(i - 1).setYolcuSayisi(cs);
                    }
                    if (cs == 8) {
                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        break;
                    }
                    if (cs == 9) {
                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        System.out.println("İyi günler.");
                        System.exit(0);
                    }
                }
            }
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*        
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            if (key.contains("Bisiklet")) {
                int i = Integer.parseInt(key.replaceAll("[\\D]", ""));//Sadece sayı olan kısmını alır.
                while (true) {

                    System.out.println("Bu bisikletin hangi özelliğini güncellemek istiyorsunuz ?");
                    System.out.println("1.Fiyat");
                    System.out.println("2.Hız");
                    System.out.println("3.Marka");
                    System.out.println("4.Renk");
                    System.out.println("5.Üretim Yılı");
                    System.out.println("6.Yolcu sayısı");
                    System.out.println("7.Önceki menüye dön");
                    System.out.println("8.Çıkış");

                    cs = sc.nextInt();
                    sc.nextLine();  //nextline hatası yüzünden
                    if (cs == 1) {
                        System.out.println("Bisikletin eski fiyatı :" + bisikletler.get(i - 1).getFiyat());
                        System.out.println("Yeni fiyat giriniz : ");
                        temp = sc.nextDouble();
                        bisikletler.get(i - 1).setFiyat(temp);
                    }
                    if (cs == 2) {
                        System.out.println("Bisikletin eski hızı :" + bisikletler.get(i - 1).getHiz());
                        System.out.println("Yeni hız giriniz : ");
                        temp = sc.nextDouble();
                        bisikletler.get(i - 1).setHiz(temp);
                    }
                    if (cs == 3) {
                        System.out.println("Bisikletin eski markası :" + bisikletler.get(i - 1).getMarka());
                        System.out.println("Yeni marka giriniz : ");
                        tmp = sc.nextLine();
                        bisikletler.get(i - 1).setMarka(tmp);
                    }
                    if (cs == 4) {
                        System.out.println("Bisikletin eski rengi :" + bisikletler.get(i - 1).getRenk());
                        System.out.println("Yeni renk giriniz : ");
                        tmp = sc.nextLine();
                        bisikletler.get(i - 1).setRenk(tmp);
                    }
                    if (cs == 5) {
                        System.out.println("Bisikletin eski üretim yılı : " + bisikletler.get(i - 1).getUretimYili());
                        System.out.println("Yeni üretim yılını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        bisikletler.get(i - 1).setUretimYili(cs);
                    }

                    if (cs == 6) {
                        System.out.println("Bisikletin eski yolcu sayısı : " + bisikletler.get(i - 1).getYolcuSayisi());
                        System.out.println("Yeni yolcu sayısını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        bisikletler.get(i - 1).setYolcuSayisi(cs);
                    }
                    if (cs == 7) {
                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        break;
                    }
                    if (cs == 8) {
                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        System.out.println("İyi günler.");
                        System.exit(0);
                    }
                }
            }
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*        
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            if (key.contains("Gemi")) {
                if (!key.contains("ucanGemi")) {

                    int i = Integer.parseInt(key.replaceAll("[\\D]", ""));//Sadece sayı olan kısmını alır.
                    while (true) {

                        System.out.println("Bu geminin hangi özelliğini güncellemek istiyorsunuz ?");
                        System.out.println("1.Fiyat");
                        System.out.println("2.Hız");
                        System.out.println("3.Marka");
                        System.out.println("4.Renk");
                        System.out.println("5.Üretim Yılı");
                        System.out.println("6.Yolcu sayısı");
                        System.out.println("7.Pervane sayısı");
                        System.out.println("8.Önceki menüye dön");
                        System.out.println("9.Çıkış");

                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        if (cs == 1) {
                            System.out.println("Geminin eski fiyatı :" + gemiler.get(i - 1).getFiyat());
                            System.out.println("Yeni fiyat giriniz : ");
                            temp = sc.nextDouble();
                            sc.nextLine();  //nextline hatası yüzünden
                            gemiler.get(i - 1).setFiyat(temp);
                        }
                        if (cs == 2) {
                            System.out.println("Geminin eski hızı :" + gemiler.get(i - 1).getHiz());
                            System.out.println("Yeni hız giriniz : ");
                            temp = sc.nextDouble();
                            sc.nextLine();  //nextline hatası yüzünden
                            gemiler.get(i - 1).setHiz(temp);
                        }
                        if (cs == 3) {
                            System.out.println("Geminin eski markası :" + gemiler.get(i - 1).getMarka());
                            System.out.println("Yeni marka giriniz : ");
                            tmp = sc.nextLine();
                            gemiler.get(i - 1).setMarka(tmp);
                        }
                        if (cs == 4) {
                            System.out.println("Geminin eski rengi :" + gemiler.get(i - 1).getRenk());
                            System.out.println("Yeni renk giriniz : ");
                            tmp = sc.nextLine();
                            gemiler.get(i - 1).setRenk(tmp);
                        }
                        if (cs == 5) {
                            System.out.println("Geminin eski üretim yılı : " + gemiler.get(i - 1).getUretimYili());
                            System.out.println("Yeni üretim yılını giriniz : ");
                            cs = sc.nextInt();
                            sc.nextLine();  //nextline hatası yüzünden
                            gemiler.get(i - 1).setUretimYili(cs);
                        }

                        if (cs == 6) {
                            System.out.println("Geminin eski yolcu sayısı : " + gemiler.get(i - 1).getYolcuSayisi());
                            System.out.println("Yeni yolcu sayısını giriniz : ");
                            cs = sc.nextInt();
                            sc.nextLine();  //nextline hatası yüzünden
                            gemiler.get(i - 1).setYolcuSayisi(cs);
                        }
                        if (cs == 7) {
                            System.out.println("Geminin eski pervane sayısı : " + gemiler.get(i - 1).getYolcuSayisi());
                            System.out.println("Yeni pervane sayısını giriniz : ");
                            cs = sc.nextInt();
                            sc.nextLine();  //nextline hatası yüzünden
                            gemiler.get(i - 1).setYolcuSayisi(cs);
                        }
                        if (cs == 8) {

                            Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                            break;
                        }
                        if (cs == 9) {
                            Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                            System.out.println("İyi günler.");
                            System.exit(0);
                        }
                    }
                }
            }
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*        
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            if (key.contains("Ucak")) {
                System.out.println("qq4");
                int i = Integer.parseInt(key.replaceAll("[\\D]", ""));//Sadece sayı olan kısmını alır.
                while (true) {

                    System.out.println("Bu uçağın hangi özelliğini güncellemek istiyorsunuz ?");
                    System.out.println("1.Fiyat");
                    System.out.println("2.Hız");
                    System.out.println("3.Marka");
                    System.out.println("4.Renk");
                    System.out.println("5.Üretim Yılı");
                    System.out.println("6.Yolcu sayısı");
                    System.out.println("7.Önceki menüye dön");
                    System.out.println("8.Çıkış");

                    cs = sc.nextInt();
                    sc.nextLine();  //nextline hatası yüzünden
                    if (cs == 1) {
                        System.out.println("Uçağın eski fiyatı :" + ucaklar.get(i - 1).getFiyat());
                        System.out.println("Yeni fiyat giriniz : ");
                        temp = sc.nextDouble();
                        sc.nextLine();
                        ucaklar.get(i - 1).setFiyat(temp);
                    }
                    if (cs == 2) {
                        System.out.println("Uçağın eski hızı :" + ucaklar.get(i - 1).getHiz());
                        System.out.println("1.Hızlan");
                        System.out.println("2.Yavaşla");
                        System.out.println("3.Dur");
                        temp = sc.nextDouble();
                        if (temp == 1) {    //Hızlan
                            ucaklar.get(i - 1).hizlan();
                        }
                        if (temp == 2) {
                            ucaklar.get(i - 1).yavasla();
                        }
                        if (temp == 3) {
                            ucaklar.get(i - 1).dur();
                        }
                    }
                    if (cs == 3) {
                        System.out.println("Uçağın eski markası :" + ucaklar.get(i - 1).getMarka());
                        System.out.println("Yeni marka giriniz : ");
                        tmp = sc.nextLine();
                        ucaklar.get(i - 1).setMarka(tmp);
                    }
                    if (cs == 4) {
                        System.out.println("Uçağın eski rengi :" + ucaklar.get(i - 1).getRenk());
                        System.out.println("Yeni renk giriniz : ");
                        tmp = sc.nextLine();
                        ucaklar.get(i - 1).setRenk(tmp);
                    }
                    if (cs == 5) {
                        System.out.println("Uçağın eski üretim yılı : " + ucaklar.get(i - 1).getUretimYili());
                        System.out.println("Yeni üretim yılını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        ucaklar.get(i - 1).setUretimYili(cs);
                    }

                    if (cs == 6) {
                        System.out.println("Uçağın eski yolcu sayısı : " + ucaklar.get(i - 1).getYolcuSayisi());
                        System.out.println("Yeni yolcu sayısını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        ucaklar.get(i - 1).setYolcuSayisi(cs);
                    }
                    if (cs == 7) {
                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        break;
                    }
                    if (cs == 8) {
                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        System.out.println("İyi günler.");
                        System.exit(0);
                    }
                }
            }
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*        
            /*-/*/////--/**/-*/*//*-/*/-*/*//*/*/-*/-**/-*-//*/*-/-*/-**-//-*/-**-//-/-**/-/-**-//-*/-*
            if (key.contains("ucanGemi")) { //UcanGemiyse
                int i = Integer.parseInt(key.replaceAll("[\\D]", ""));//Sadece sayı olan kısmını alır.
                while (true) {

                    System.out.println("Bu ucanGeminin hangi özelliğini güncellemek istiyorsunuz ?");
                    System.out.println("1.Fiyat");
                    System.out.println("2.Hız");
                    System.out.println("3.Marka");
                    System.out.println("4.Renk");
                    System.out.println("5.Üretim Yılı");
                    System.out.println("6.Yolcu sayısı");
                    System.out.println("7.Pervane sayısı");
                    System.out.println("8.Önceki menüye dön");
                    System.out.println("9.Çıkış");

                    cs = sc.nextInt();
                    sc.nextLine();  //nextline hatası yüzünden
                    if (cs == 1) {
                        System.out.println("ucanGeminin eski fiyatı :" + ucanGemiler.get(i - 1).getFiyat());
                        System.out.println("Yeni fiyat giriniz : ");
                        temp = sc.nextDouble();
                        sc.nextLine();  //nextline hatası yüzünden
                        ucanGemiler.get(i - 1).setFiyat(temp);
                    }
                    if (cs == 2) {
                        System.out.println("ucanGeminin eski hızı :" + ucanGemiler.get(i - 1).getHiz());
                        System.out.println("1.Hızlan");
                        System.out.println("2.Yavaşla");
                        System.out.println("3.Dur");
                        temp = sc.nextDouble();
                        if (temp == 1) {    //Hızlan
                            ucanGemiler.get(i - 1).hizlan();
                        }
                        if (temp == 2) {    //Yavasla
                            ucanGemiler.get(i - 1).yavasla();
                        }
                        if (temp == 3) {    //Dur
                            ucanGemiler.get(i - 1).dur();
                        }
                    }
                    if (cs == 3) {
                        System.out.println("ucanGeminin eski markası :" + ucanGemiler.get(i - 1).getMarka());
                        System.out.println("Yeni marka giriniz : ");
                        tmp = sc.nextLine();
                        ucanGemiler.get(i - 1).setMarka(tmp);
                    }
                    if (cs == 4) {
                        System.out.println("ucanGeminin eski rengi :" + ucanGemiler.get(i - 1).getRenk());
                        System.out.println("Yeni renk giriniz : ");
                        tmp = sc.nextLine();
                        ucanGemiler.get(i - 1).setRenk(tmp);
                    }
                    if (cs == 5) {
                        System.out.println("ucanGeminin eski üretim yılı : " + ucanGemiler.get(i - 1).getUretimYili());
                        System.out.println("Yeni üretim yılını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        ucanGemiler.get(i - 1).setUretimYili(cs);
                    }

                    if (cs == 6) {
                        System.out.println("ucanGeminin eski yolcu sayısı : " + ucanGemiler.get(i - 1).getYolcuSayisi());
                        System.out.println("Yeni yolcu sayısını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        ucanGemiler.get(i - 1).setYolcuSayisi(cs);
                    }
                    if (cs == 7) {
                        System.out.println("ucanGeminin eski pervane sayısı : " + ucanGemiler.get(i - 1).getYolcuSayisi());
                        System.out.println("Yeni pervane sayısını giriniz : ");
                        cs = sc.nextInt();
                        sc.nextLine();  //nextline hatası yüzünden
                        ucanGemiler.get(i - 1).setYolcuSayisi(cs);
                    }
                    if (cs == 8) {

                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        break;
                    }
                    if (cs == 9) {
                        Arayuz.dosyaGuncelle(arabalar, bisikletler, ucaklar, gemiler, ucanGemiler);
                        System.out.println("İyi günler.");
                        System.exit(0);
                    }
                }
            }
        }
    }

    public static void dosyaGuncelle(ArrayList<Otomobil> arabalar, ArrayList<Bisiklet> bisikletler, ArrayList<Ucak> ucaklar, ArrayList<Gemi> gemiler, ArrayList<UcanGemi> ucanGemiler) throws IOException {

        File file = new File("dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        PrintWriter wr = new PrintWriter(file);
        wr.print("");
        wr.close();

        for (int i = 0; i < arabalar.size(); i++) {
            String str = new String();
            str = "1," + arabalar.get(i).getYakitTuru() + "," + arabalar.get(i).getFiyat() + "," + arabalar.get(i).getHiz() + "," + arabalar.get(i).getMarka() + "," + arabalar.get(i).getRenk() + "," + arabalar.get(i).getUretimYili() + "," + arabalar.get(i).getYolcuSayisi() + "-";
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(str);
            bWriter.close();
        }
        for (int i = 0; i < bisikletler.size(); i++) {
            String str = new String();
            str = "2," + bisikletler.get(i).getFiyat() + "," + bisikletler.get(i).getHiz() + "," + bisikletler.get(i).getMarka() + "," + bisikletler.get(i).getRenk() + "," + bisikletler.get(i).getUretimYili() + "," + bisikletler.get(i).getYolcuSayisi() + "-";
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(str);
            bWriter.close();
        }
        for (int i = 0; i < gemiler.size(); i++) {
            String str = new String();
            str = "3," + gemiler.get(i).getFiyat() + "," + gemiler.get(i).getHiz() + "," + gemiler.get(i).getMarka() + "," + gemiler.get(i).getRenk() + "," + gemiler.get(i).getUretimYili() + "," + gemiler.get(i).getYolcuSayisi() + "," + gemiler.get(i).getPervaneSayisi() + "-";
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(str);
            bWriter.close();
        }
        for (int i = 0; i < ucaklar.size(); i++) {
            String str = new String();
            str = "4," + ucaklar.get(i).getFiyat() + "," + ucaklar.get(i).getHiz() + "," + ucaklar.get(i).getMarka() + "," + ucaklar.get(i).getRenk() + "," + ucaklar.get(i).getUretimYili() + "," + ucaklar.get(i).getYolcuSayisi() + "-";
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(str);
            bWriter.close();
        }
        for (int i = 0; i < ucanGemiler.size(); i++) {
            String str = new String();
            str = "5," + ucanGemiler.get(i).getFiyat() + "," + ucanGemiler.get(i).getHiz() + "," + ucanGemiler.get(i).getMarka() + "," + ucanGemiler.get(i).getRenk() + "," + ucanGemiler.get(i).getUretimYili() + "," + ucanGemiler.get(i).getYolcuSayisi() + "," + ucanGemiler.get(i).getPervaneSayisi() + "-";
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(str);
            bWriter.close();
        }

    }

}
