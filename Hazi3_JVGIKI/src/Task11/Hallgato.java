/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task11;

/**
 *
 * @author Saky
 */
public class Hallgato extends Személy{
    private double atlag;

    public Hallgato(double atlag, String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
        this.atlag = atlag;
    }

    public double getAtlag() {
        return atlag;
    }
    
    public boolean joKepessegu(double min){
        if(atlag>min)
            return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNév() + "\n");
        sb.append(this.getÉletkor()+ "\n");
        sb.append(this.getAtlag()+ "\n");
        sb.append(this.isFérfi()+ "\n");
        return sb.toString();
    }
    
}
