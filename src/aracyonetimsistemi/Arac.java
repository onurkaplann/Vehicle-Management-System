package aracyonetimsistemi;

import java.util.Scanner;

public class Arac implements AracInterface{
    private String marka;
    private double hiz;
    private int yolcuSayisi;
    private double fiyat;
    private int uretimYili;
    private String renk;
    private int tekerlekSayisi;
    private String serialNo;
    private String tur;
    
    public Arac() {      //Bos yollanirsa
        this.marka="Bilinmiyor.";
        this.hiz=-1;
        this.yolcuSayisi=-1;
        this.fiyat=-1;
        this.uretimYili=-1;
        this.renk="Bilinmiyor";
        this.serialNo="-1";
        this.tekerlekSayisi=-1;
        this.tur="Arac";
    }
   
    public String getTur(){
        return this.tur;
    }
    public String getMarka(){
        return this.marka;
    }
    public double getHiz(){
        return this.hiz;
    }
    public int getYolcuSayisi(){
        return this.yolcuSayisi;
    }
    public double getFiyat(){
        return this.fiyat;
    }
    public int getUretimYili(){
        return this.uretimYili;
    }
    public String getRenk(){
        return this.renk;
    }
    public int getTekerlekSayisi(){
        return this.tekerlekSayisi;
    }
    public String getSerialNo(){
        return this.serialNo;
    }
    
    public void setTur(String t){
        this.tur=t;
    }
    public void setMarka(String m){
        this.marka=m;
    }
    public void setHiz(double h){
        this.hiz=h;
    }
    public void setYolcuSayisi(int ys){
        this.yolcuSayisi=ys;
    }
    public void setFiyat(double f){
        this.fiyat=f;
    }
    public void setUretimYili(int u){
        this.uretimYili=u;
    }
    public void setRenk(String r){
        this.renk=r;
    }
    public void setTekerlekSayisi(int ts){
        this.tekerlekSayisi=ts;
    }
    public void setSerialNo(String serial){
    this.serialNo=serial;
    }
    public void hizlan() {
        double hiz = this.getHiz();
        double yeniHiz = 0;

        do {
            System.out.println("Hız : " + hiz);
            Scanner sc = new Scanner(System.in);
            yeniHiz = sc.nextDouble();
            if (yeniHiz < hiz) {
                System.out.println(yeniHiz + " < " + hiz);
                System.out.println("Hızlanabilmek için eski hızdan daha büyük bir hız giriniz !");
            }
        } while (yeniHiz < hiz);
        this.setHiz(yeniHiz);

    }

    public void yavasla() {
        double hiz = this.getHiz();
        double yeniHiz = 0;

        do {
            System.out.println("Hız : " + hiz);
            Scanner sc = new Scanner(System.in);
            yeniHiz = sc.nextDouble();
            if (yeniHiz > hiz) {
                System.out.println(yeniHiz + " > " + hiz);
                System.out.println("Yavaşlayabilmek için eski hızdan daha büyük bir hız giriniz !");
            }
        } while (yeniHiz > hiz);
        this.setHiz(yeniHiz);
    }
    public void dur(){
    this.setHiz(0);
    }
    
}
