/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

/**
 *
 * @author Saky
 */
public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height / 2;
    }
    
    public double getPerimeter(){
        double c = Math.pow(width, 2) * Math.pow(height, 2);
        return this.width + 2 * Math.sqrt(c);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", area=" + this.getArea() + ", perimeter=" + this.getPerimeter() + '}';
    }
    
    
    
    
}
