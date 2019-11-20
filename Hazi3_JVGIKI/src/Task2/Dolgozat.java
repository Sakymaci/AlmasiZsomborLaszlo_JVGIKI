/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author Saky
 */
public class Dolgozat {
    public static SzeszesItal[] haromlegmagasabb(Ital[] italok){
        SzeszesItal[] ret = new SzeszesItal[3];
        for (int i = 0; i < 3; i++) {
            ret[i] = new SzeszesItal(-1, "", "", 0);
        }
        int db = 0;
        for (Ital ital : italok) {
            if(ital instanceof SzeszesItal)
                db++;
        }
        if(db<3)
            return null;
        for (Ital Ital : italok) {
            if(Ital instanceof SzeszesItal){
                for (SzeszesItal szeszesItal : ret) {
                    if(szeszesItal.getAlkoholTartalom() < ((SzeszesItal) Ital).getAlkoholTartalom())
                    szeszesItal = (SzeszesItal) Ital;
                }
            }
        }       
        return ret;
    }
}
