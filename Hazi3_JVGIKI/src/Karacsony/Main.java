/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karacsony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Saky
*/

class Hozza implements Comparable<Hozza>{
    private String nev;
    private int db;

    public Hozza(String nev, int db) {
        this.nev = nev;
        this.db = db;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public Hozza(String s) {
        this.nev = s;
    }

    @Override
    public int compareTo(Hozza o) {
        if(this.db>o.getDb())
            return -1;
        else if(this.db < o.getDb())
            return 1;
        else
            return this.nev.compareTo(o.getNev());
    }

    @Override
    public String toString() {
        return  nev + ";" + db;
    } 
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hozza> list = new ArrayList<>();
        while(sc.hasNextLine()){
            if(sc.nextLine() == null)
                break;
            String[] str = sc.nextLine().split(";");
            if(list.contains(new Hozza(str[0]))){
                int idx = list.indexOf(new Hozza(str[0]));
                Hozza tmp = list.get(idx);
                tmp.setDb(tmp.getDb()+Integer.parseInt(str[1]));
            }
            list.add(new Hozza(str[0], Integer.parseInt(str[1])));
        }
        Collections.sort(list);
        for (Hozza hozza : list) {
            System.out.println(hozza.toString());
        }
    }
}