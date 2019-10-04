/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

/**
 *
 * @author Saky
 */
public class Test {
    public static void main(String[] args) {
        QuadraticEquation[] a = new QuadraticEquation[3];
        a[0] = new QuadraticEquation(1, 6, 2);
        a[1] = new QuadraticEquation(1, 8, 4);
        a[2] = new QuadraticEquation(1, 10, 6);
        
        for (int i = 0; i < a.length; i++) {
            if(a[i].getDiscriminant() >= 0){
                System.out.println(a[i].toString());
            }
            else
                System.out.println("The equation has no roots.");

        }
    }
}
