package aracyonetimsistemi;

public abstract class Bisiklet extends KaraTasitlari{
    public static int sayisi=0;
    public  Bisiklet(){
        sayisi++;
        super.setTur("Bisiklet");
        String serial=super.getTur()+Integer.toString(sayisi+1);
        super.setSerialNo(serial);
        super.setTekerlekSayisi(2);
    }
    public Bisiklet(double f,double h ,String m,String r,int u,int ys){
        super.setTur("Bisiklet");
        sayisi++;
        String serial=super.getTur()+Integer.toString(sayisi);
        
        super.setFiyat(f);
        super.setHiz(h);
        super.setMarka(m);
        super.setRenk(r);
        super.setUretimYili(u);
        super.setYolcuSayisi(ys);
        super.setSerialNo(serial);
        super.setTekerlekSayisi(2);
        
    }
    public void ozelliklerYazdir(){
       System.out.println("Tür :"+this.getTur());
       System.out.println("Marka : "+this.getMarka());
       System.out.println("Renk : "+this.getRenk());
       System.out.println("Fiyat : "+this.getFiyat());
       System.out.println("Hız : "+this.getHiz());
       System.out.println("Tekerlek sayısı : "+this.getTekerlekSayisi());
       System.out.println("Uretim yılı"+this.getUretimYili());
       System.out.println("Yolcu Sayısı : "+this.getYolcuSayisi());
       System.out.println("Seri numarası : "+this.getSerialNo());
    }
    
}
