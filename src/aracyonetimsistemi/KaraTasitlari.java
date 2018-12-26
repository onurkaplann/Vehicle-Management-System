package aracyonetimsistemi;

public abstract class KaraTasitlari extends Arac{

    
    public KaraTasitlari(){
      
    }
    
    public abstract String getYakitTuru();
    public abstract void setYakitTuru(String yt);
    
    @Override
    public String getTur(){
        return super.getTur();
    }
    @Override
    public String getMarka(){
        return super.getMarka();
    }
    @Override
    public double getHiz(){
        return super.getHiz();
    }
    @Override
    public int getYolcuSayisi(){
        return super.getYolcuSayisi();
    }
    @Override
    public double getFiyat(){
        return super.getFiyat();
    }
    @Override
    public int getUretimYili(){
        return super.getUretimYili();
    }
    @Override
    public String getRenk(){
        return super.getRenk();
    }
    @Override
    public int getTekerlekSayisi(){
        return super.getTekerlekSayisi();
    }
    @Override
    public String getSerialNo(){
        return super.getSerialNo();
    }
    
    
    
    @Override
    public void setTur(String t){
        super.setTur(t);
    }
    @Override
    public void setMarka(String m){
        super.setMarka(m);
    }
    @Override
    public void setHiz(double h){
        super.setHiz(h);
    }
    @Override
    public void setYolcuSayisi(int ys){
        super.setYolcuSayisi(ys);
    }
    @Override
    public void setFiyat(double f){
        super.setFiyat(f);
    }
    @Override
    public void setUretimYili(int u){
        super.setUretimYili(u);
    }
    @Override
    public void setRenk(String r){
        super.setRenk(r);
    }
    @Override
    public void setTekerlekSayisi(int ts){
        super.setTekerlekSayisi(ts);
    }
    @Override
    public void setSerialNo(String serial){
        super.setSerialNo(serial);
    }
     
    
    
}
