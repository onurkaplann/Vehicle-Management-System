package aracyonetimsistemi;

public  class DenizTasitlari extends Arac implements DenizTasitlariInterface {
   private int pervaneSayisi;
   
    public DenizTasitlari(){
       
    }
    public int getPervaneSayisi(){
        return this.pervaneSayisi;
    }
    public void setPervaneSayisi(int ps){
        this.pervaneSayisi=ps;
    }
}
