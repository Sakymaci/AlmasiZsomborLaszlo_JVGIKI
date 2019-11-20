/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task9;

/**
 *
 * @author Saky
 */
public class Hatizsak implements Comparable<Hatizsak>{
    private String marka;
    private double urtartalom;
    private int zsebekSzama;
    private boolean Vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean Vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.Vizhatlan = Vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return Vizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak:" + "marka=" + marka + ", urtartalom=" + urtartalom + ", zsebekSzama=" + zsebekSzama + ", Vizhatlan=" + Vizhatlan;
    }

    @Override
    public int compareTo(Hatizsak o) {
        if(this.marka.equals(o.getMarka()))
            if(this.zsebekSzama > o.getZsebekSzama())
                return 1;
            else if(zsebekSzama < o.getZsebekSzama())
                return -1;
            else
                return 0;
        else
            return this.marka.compareTo(o.getMarka());
    }
    
    
}
