/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7;

/**
 *
 * @author Saky
 */
public class Lakohaz implements Comparable<Lakohaz>{
    static double emeletmagassag;
    private String cim;
    private int emeletekSzama;
    private double alaperulet;

    public Lakohaz( String cim, int emeletekSzama, double alaperulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alaperulet = alaperulet;
        this.emeletmagassag = 3.2;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlaperulet() {
        return alaperulet;
    }
    
    public double legkobmeret(){
        return alaperulet*emeletmagassag*emeletekSzama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lakohaz: ");
        sb.append(cim);
        sb.append(", Emeletek=");
        sb.append(String.valueOf(emeletekSzama));
        sb.append(", Alapterulet=");
        sb.append(String.valueOf(alaperulet));
        sb.append(", Legkobmeret=");
        sb.append(String.valueOf(legkobmeret()));
        return sb.toString();
    }
    
    

    @Override
    public int compareTo(Lakohaz o) {
        if(this.legkobmeret() > o.legkobmeret())
            return 1;
        else if(this.legkobmeret() < o.legkobmeret())
            return -1;
        return 0;
    }
    
}
