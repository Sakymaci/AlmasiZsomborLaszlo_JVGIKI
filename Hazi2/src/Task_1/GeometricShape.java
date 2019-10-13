package Task_1;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saky
 */


public class GeometricShape {
    private String color;
    private boolean filled;
    private final Date dateCreated;

    public GeometricShape() { this.dateCreated = new Date();

        this.color = "white";
        this.filled = false;
    }

    public GeometricShape(String color, boolean filled) {
        this.dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return ("created on "  + getDateCreated() + "\n" + "color: " + getColor() + " and filled: " + isFilled());
    }
    
    
}
