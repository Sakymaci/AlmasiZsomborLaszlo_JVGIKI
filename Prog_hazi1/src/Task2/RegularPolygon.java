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
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 1;
        this.side = 3;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
       
    public double getPerimeter(){
        return this.getN() * this.getSide();
    }
    
    public double getArea(){
        return this.getN() * ((Math.cos(360/(this.getN()*2)) / Math.sin(360/(this.getN()*2))) * (this.getSide()/2)) * (this.getSide()/2);
    }

    @Override
    public String toString() {
        return "RegularPolygon{" + "n=" + n + ", side=" + side + ", x=" + x + ", y=" + y + '}';
    }   
}
