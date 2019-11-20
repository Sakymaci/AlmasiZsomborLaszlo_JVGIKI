/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task11;

/**
 *
 * @author Saky
 */
public class Személy implements Comparable<Személy>{
    protected String név;
    protected int életkor;
    private boolean férfi;

    public Személy(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }

    public boolean isFérfi() {
        return férfi;
    }

    public void setFérfi(boolean férfi) {
        this.férfi = férfi;
    }

    @Override
    public String toString() {
        return név + " " + életkor + " " + férfi;
    }

    @Override
    public int compareTo(Személy o) {
        if(this.életkor>o.getÉletkor())
            return 1;
        else if(this.életkor<o.getÉletkor())
            return -1;
        return 0;
    }
    
}
