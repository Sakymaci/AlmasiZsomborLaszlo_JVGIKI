/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

/**
 *
 * @author Saky
 */
public class Tea implements Rendezheto<Tea> {
    public String nev;
    public int ar;
    public Tea(String s,int j) {
        nev=s;
        ar=j;
    }

    @Override
    public boolean egyenlo(Tea t) {
        if(t.nev.equals(this.nev))
            if(t.ar == this.ar)
                return true;
        return false;
    }

    @Override
    public boolean nagyobbMint(Tea t) {
        if(this.ar <= t.ar)
            return false;
        return true;
    }

    @Override
    public boolean kisebbMint(Tea t) {
        if(this.ar <= t.ar)
            return false;
        return true;
    }
} 