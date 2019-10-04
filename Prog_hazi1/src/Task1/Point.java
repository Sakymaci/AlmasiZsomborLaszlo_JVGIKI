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
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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
    
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(2,2);
        Point c = new Point(3,3);
        Point d = new Point(4,4);
        
        double minus = 3.4;
        
        a.setY(a.getY()+5);
        b.setY(b.getY()+5);
        c.setX(c.getX()-minus);
        d.setX(d.getX()-minus);
        System.out.println( a.getX() + " " + a.getY() + "\n" +
                            b.getX() + " " + b.getY() + "\n" +
                            c.getX() + " " + c.getY() + "\n" +
                            d.getX() + " " + d.getY() + "\n" );
    }
}


