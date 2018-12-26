package aracyonetimsistemi;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.awt.Label;
import java.util.Scanner;

public abstract class HavaTasitlari extends Arac implements HavaTasitlariInterface {

    boolean havadaMi;

    public HavaTasitlari() {
    }

    
    public boolean getHavadaMi() {
        return havadaMi;
    }

    public void setHavadaMi(boolean havadaMi) {
        this.havadaMi = havadaMi;
    }
    
    public void dur() { //200 hızın altındaysa yavaştır kabul ettim.
        double hiz = this.getHiz();
        double yeniHiz = 0;

        if (hiz>79) {
            System.out.println(hiz + " > 79");
            System.out.println("Durabilmek için hızınız 79'dan küçük olmalı !!!");
        } else {
            this.setHiz(yeniHiz);
        }
    }

}
