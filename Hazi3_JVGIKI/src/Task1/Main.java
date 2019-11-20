/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author Saky
 */
public class Main {
    public static Aszu[] hanyAszu(Bor[] bor){
        int mennyi = 0;
        for (Bor bor1 : bor) {
            if(bor1 instanceof Aszu)
                if(((Aszu) bor1).hanyPuttonyos() == 5)
                    mennyi++;
        }
        Aszu[] ret = new Aszu[mennyi];
        mennyi = 0;
        for (Bor bor1 : bor) {
            if(bor1 instanceof Aszu)
                if(((Aszu) bor1).hanyPuttonyos() == 5)
                {
                    ret[mennyi] = (Aszu)bor1;
                    mennyi++;
                }
        }
        return ret;
    }
    public static void main(String[] args) {
        Bor[] t = new Bor[10];
        t[0] = new Bor("feher", "deb", "jo", 2);
        t[1] = new Bor("piros", "tok", "keseru", 5);
        t[2] = new Aszu(2, "feher", "tok", "edes", 4);
        t[3] = new Bor("keverek", "ang", "feledes", 10);
        t[4] = new Aszu(5, "piros", "tok", "szaraz", 12);
        t[5] = new Aszu(3, "feh", "meh", "elmegy", 15);
        t[6] = new Bor("nincs", "gyar", "edes", 13);
        t[7] = new Aszu(5, "piros", "rom", "feledes", 9);
        t[8] = new Aszu(5, "feher", "domb", "szaraz", 14);
        t[9] = new Bor("amivolt", "mindenhonnan", "mintamaradek", 15);        
    }
}
