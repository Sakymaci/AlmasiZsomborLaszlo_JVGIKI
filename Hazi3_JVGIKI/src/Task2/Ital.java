/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.Objects;

/**
 *
 * @author Saky
 */
public class Ital implements Comparable<Ital>{
    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.név);
        hash = 13 * hash + Objects.hashCode(this.kiszerelés);
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
        return true;
    }

    @Override
    public int compareTo(Ital o) {
        if(o instanceof Ital){
            if(this.getÁr()>o.getÁr())
                return 1;
            if(this.getÁr()<o.getÁr())
                return -1;
        }
        return 0;
    }
    
    
    
    
}
