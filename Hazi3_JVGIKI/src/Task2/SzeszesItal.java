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
public class SzeszesItal extends Ital{
    private int alkoholTartalom;

    public int getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public SzeszesItal(int alkoholTartalom, String név, String kiszerelés, int ár) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return alkoholTartalom + "% alkoholtartalmu " + super.toString();
    }
    
    
}
