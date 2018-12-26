package aracyonetimsistemi;

public interface AracInterface {
    
    public double getFiyat();
    public String getTur();
    public String getMarka();
    public double getHiz();
    public int getUretimYili();
    public int getYolcuSayisi();
    public String getRenk();
    public int getTekerlekSayisi();
    public String getSerialNo();
    
    
    public void setTur(String t);
    public void setMarka(String m);
    public void setHiz(double h);
    public void setYolcuSayisi(int ys);
    public void setFiyat(double m);
    public void setUretimYili(int u);
    public void setRenk(String r);
    public void setTekerlekSayisi(int ts);
    public void setSerialNo(String serial);
    
}
