package aracyonetimsistemi;

import java.util.Scanner;
import javax.imageio.ImageIO;

public abstract class Otomobil extends KaraTasitlari{
    
    public static int sayisi=0;
    private String yakitTuru;
    
    public Otomobil(){
        super.setTekerlekSayisi(4);
        super.setTur("  ");
        this.setYakitTuru("Bilinmiyor.");
        sayisi++;
        String serial=super.getTur()+Integer.toString(sayisi);
        super.setSerialNo(serial);
        
    }
    public Otomobil(String ytur,double f,double h ,String m,String r,int u,int ys){
       
        super.setTur("Otomobil");
        sayisi++;
        String serial=super.getTur()+Integer.toString(sayisi);
        
        this.setYakitTuru(ytur);
        super.setFiyat(f);
        super.setHiz(h);
        super.setMarka(m);
        super.setRenk(r);
        super.setUretimYili(u);
        super.setYolcuSayisi(ys);
        super.setSerialNo(serial);
        super.setTekerlekSayisi(4);
        
    }
    
    @Override
    public String getYakitTuru(){
        return this.yakitTuru;
    }
    
    @Override
    public void setYakitTuru(String yt){
    this.yakitTuru=yt;
    }
    
    public void ozelliklerYazdir(){
       System.out.println("Tür :"+this.getTur());
       System.out.println("Seri numarası : "+this.getSerialNo());
       System.out.println("Marka : "+this.getMarka());
       System.out.println("Renk : "+this.getRenk());
       System.out.println("Fiyat : "+this.getFiyat());
       System.out.println("Hız : "+this.getHiz());
       System.out.println("Tekerlek sayısı : "+this.getTekerlekSayisi());
       System.out.println("Uretim yılı"+this.getUretimYili());
       System.out.println("Yolcu Sayısı : "+this.getYolcuSayisi());
       System.out.println("Yakıt türü : "+this.getYakitTuru());
        
    }
    
}
