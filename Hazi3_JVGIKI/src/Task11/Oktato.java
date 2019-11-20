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
public class Oktato extends Személy{
    private String tanszek;

    public Oktato(String tanszek, String név, int életkor, boolean férfi) {
        super(név, életkor, férfi);
        this.tanszek = tanszek;
    }
}
