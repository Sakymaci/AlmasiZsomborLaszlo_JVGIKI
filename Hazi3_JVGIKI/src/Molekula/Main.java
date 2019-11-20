/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Molekula;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Saky
 */

class Elem implements Comparable<Elem>{
    private String jel;
    private String nev;

    public Elem(String jel, String nev) {
        this.jel = jel;
        this.nev = nev;
    }

    public String getJel() {
        return jel;
    }

    public void setJel(String jel) {
        this.jel = jel;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public int compareTo(Elem o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Molekula extends Elem{
    public Molekula(String jel, String nev) {
        super(jel, nev);
    }
}


public class Main {
    public static void main(String[] args) {
        List<Elem> lista = new ArrayList<Elem>();
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        while(tmp != "-"){
            lista.add(new Elem(tmp.split(":")[0], tmp.split(":")[1]));
            tmp = sc.nextLine();
        }
        while(sc.hasNextLine()){
            
        }
    }
}
