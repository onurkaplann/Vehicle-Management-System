package aracyonetimsistemi;

public class Gemi extends DenizTasitlari{
    public static int sayisi=0;
    
    public Gemi(){
        sayisi++;
        super.setTekerlekSayisi(0);
        super.setTur("Gemi");
        String serial=super.getTur()+Integer.toString(sayisi+1);
        super.setSerialNo(serial);
        super.setPervaneSayisi(-1);
    }
    public Gemi(double f,double h ,String m,String r,int u,int ys,int ps){
        super.setPervaneSayisi(ps);
        
        super.setTur("Gemi");
        sayisi++;
        String serial=super.getTur()+Integer.toString(sayisi);
        super.setFiyat(f);
        super.setHiz(h);
        super.setMarka(m);
        super.setRenk(r);
        super.setUretimYili(u);
        super.setYolcuSayisi(ys);
        super.setSerialNo(serial);
        super.setTekerlekSayisi(0);
    }
       public void ozelliklerYazdir(){
       System.out.println("Tür :"+this.getTur());
       System.out.println("Marka : "+this.getMarka());
       System.out.println("Renk : "+this.getRenk());
       System.out.println("Fiyat : "+this.getFiyat());
       System.out.println("Hız : "+this.getHiz());
       System.out.println("Uretim yılı"+this.getUretimYili());
       System.out.println("Yolcu sayısı : "+this.getYolcuSayisi());
       System.out.println("Seri numarası : "+this.getSerialNo());
       System.out.println("Pervane sayısı : "+this.getPervaneSayisi());
    }
    
    
}
