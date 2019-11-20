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
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{

    private double alkoholTartalom;

    public ErjedtGyumolcs(String fajta, String iz, double a) {
        super(fajta, iz);
        this.alkoholTartalom = a;
    }
    
    
    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs: " + "alkoholTartalom= " + alkoholTartalom;
    }
    
    
    
}
