/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zarth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Saky
*/

class Resztvevo implements Comparable<Resztvevo>{
    private String nev;
    private int pont;

    public Resztvevo(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int db) {
        this.pont = db;
    }

    public Resztvevo(String s) {
        this.nev = s;
    }

    @Override
    public int compareTo(Resztvevo o) {
        if(this.pont>o.getPont())
            return -1;
        else if(this.pont < o.getPont())
            return 1;
        else
            return this.nev.compareTo(o.getNev());
    }

    @Override
    public String toString() {
        return  nev + ": " + pont + " pont";
    } 
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Resztvevo> list = new ArrayList<>();
        while(sc.hasNextLine()){
            if(sc.nextLine() == null)
                break;
            String[] str = sc.nextLine().split(";");
            if(list.contains(new Resztvevo(str[0]))){
                int idx = list.indexOf(new Resztvevo(str[0]));
                Resztvevo tmp = list.get(idx);
                tmp.setPont(tmp.getPont()+Integer.parseInt(str[1]));
            }
            list.add(new Resztvevo(str[0], Integer.parseInt(str[1])));
        }
        Collections.sort(list);
        for (Resztvevo resztvevo : list) {
            System.out.println(resztvevo.toString());
        }
    }
}
