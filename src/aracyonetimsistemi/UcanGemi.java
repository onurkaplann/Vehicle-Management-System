package aracyonetimsistemi;
public class UcanGemi extends HavaTasitlari implements UcanGemiInterface{
    public static int sayisi=0;
    public int pervaneSayisi;
    public UcanGemi(){
        sayisi++;
        this.setTekerlekSayisi(-1);
        this.setTur("ucanGemi");
        String serial=super.getTur()+Integer.toString(sayisi+1);
        super.setSerialNo(serial);
    }
  
    public UcanGemi(double f,double h ,String m,String r,int u,int ys,int ps){
        super.setTur("ucanGemi");
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
    
    public void setPervaneSayisi(int ps){
        this.pervaneSayisi=ps;
    }
    
    public int getPervaneSayisi(){
        return this.pervaneSayisi;
    }
    
}
