/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Saky
 */
public class Ital {
    protected String név;
    protected String kiszerelés;
    private  static int ár;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
        this.ár = 10;
    }

    @Override
    public String toString() {
        return this.getNév() + ", " + this.getKiszerelés() + ", " + this.getÁr() + " Ft";
    }
    
    

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(this.ár, other.ár)) {
            return false;
        }
        return true;
    }
        
    public static double getÁrEuróban(){
        return Ital.getÁr() / 332;
    }
}
