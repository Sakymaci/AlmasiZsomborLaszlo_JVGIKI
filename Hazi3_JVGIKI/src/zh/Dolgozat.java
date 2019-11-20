/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

/**
 *
 * @author Saky
 */
public class Dolgozat implements egyetem.Pontozhato{
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if(pontszam==-1){
            System.out.println("Nem írt");
            return false;
        }
        if(pontszam>35)
            return true;
        return false;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat:" + "pontszam=" + pontszam;
    }
    
    
    
}
