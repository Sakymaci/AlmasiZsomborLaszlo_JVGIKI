/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task6;

/**
 *
 * @author Saky
 */
public class Test {
    public static void main(String[] args) {
        LinearEquation[] a = new LinearEquation[3];
        a[0] = new LinearEquation(1, 2, 3, 4, 40, 55);
        a[1] = new LinearEquation(2, 3, 4, 5, 60, 80);
        a[2] = new LinearEquation(4, 5, 7, 1, 5, 8);
        
        for (int i = 0; i < a.length; i++) {
            if(a[i].isSolvable())
                System.out.println("The equation has no solution.");
            else
                System.out.println("X=" + a[i].getX() + ", Y=" + a[i].getY());
        }
    }
}
