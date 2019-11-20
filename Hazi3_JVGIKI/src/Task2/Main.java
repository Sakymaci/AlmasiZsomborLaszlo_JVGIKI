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
public class Main {
    public static void main(String[] args) {
        Ital[] t = new Ital[6];
        t[0] = new Ital("viz", "1L", 100);
        t[1] = new SzeszesItal(10, "bor", "0,75L", 1500);
        t[2] = new Ital("gyumolcsle", "0,5L", 250);
        t[3] = new Ital( "sor", "0,3L", 230);
        t[4] = new Ital("Stroh", "0,7L", 5500);
        t[5] = new SzeszesItal(11, "likor", "0,5L", 2200);
        
        SzeszesItal[] done;
        
        done = Dolgozat.haromlegmagasabb(t);
        
        for (SzeszesItal szeszesItal : done) {
            if(szeszesItal != null)
                System.out.println(szeszesItal.toString());
            else
                System.out.println("Nincs eleg.");
        }
    }
}
