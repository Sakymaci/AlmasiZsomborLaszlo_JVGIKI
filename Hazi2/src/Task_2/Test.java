/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_2;

/**
 *
 * @author Saky
 */
public class Test {
    public static void main(String[] args) {
        Triangle haromszog1 = new Triangle(1, 1.5, 1, "yellow", true);
        System.out.println("Area is " + haromszog1.getArea()+ " Perimeter is " + haromszog1.getPerimeter() + " Filled with: " + haromszog1.isFilled());
    }
}
