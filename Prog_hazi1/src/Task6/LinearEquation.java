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
public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable(){
        if((this.getA() * this.getD() - this.getB()*this.getC()) != 0)
            return false;
        else
            return true;
    }
    
    public double getX(){
        return (this.getE() * this.getD() - this.getB() * this.getF()) / (this.getA() * this.getD() - this.getB() * this.getC());
    }
    
    public double getY(){
        return (this.getA() * this.getF() - this.getE() * this.getC()) / (this.getA()* this.getD() - this.getB() * this.getC());
    }
}
