/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Random;

/**
 *
 * @author Saky
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    
    public Dolgozat dolgozatotIr(){
        Random rand = new Random();
        int tmp;
        if(sokatTanul==true)
            tmp = (rand.nextInt()%4+4)*mennyitKeszult;
        else
            tmp = (rand.nextInt()%6)*mennyitKeszult;
        if(rand.nextInt()%100>2){
            tmp = -1;
        }
        Dolgozat ret = new Dolgozat(tmp);
        return ret;
    }
}
