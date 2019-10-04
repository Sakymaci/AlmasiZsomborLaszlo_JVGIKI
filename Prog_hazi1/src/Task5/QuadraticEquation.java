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
public class QuadraticEquation {
    private double a, b, c;
    private double x;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getDiscriminant(){
        return Math.pow(this.getB(), 2) - 4*this.getA()*this.getC();
    }
    
    public double getRoot1(){
        if(this.getDiscriminant() < 0)
            return 0;
        return -this.getB() + (Math.sqrt(this.getDiscriminant()) / 2 * this.getA());
    }
    
    public double getRoot2(){
        if(this.getDiscriminant() < 0)
            return 0;
        return -this.getB() - (Math.sqrt(this.getDiscriminant()) / 2 * this.getA());
    }

    @Override
    public String toString() {
        if(this.getDiscriminant() == 0){
            System.out.println("QuadraticEquation{" + ", x1=" + this.getRoot1());
        }
        return "QuadraticEquation{" + ", x1=" + this.getRoot1() + ", x2=" + this.getRoot2() + '}';
    }
    
    
    
}
