/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Saky
*/

class OP implements Comparable<OP>{
    private String nev;
    private int fizetett;

    public OP(String nev, int fizetett) {
        this.nev = nev;
        this.fizetett = fizetett;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getFizetett() {
        return fizetett;
    }

    public void setFizetett(int db) {
        this.fizetett = db;
    }

    public OP(String s) {
        this.nev = s;
    }

    @Override
    public int compareTo(OP o) {
        if(this.fizetett>o.getFizetett())
            return -1;
        else if(this.fizetett < o.getFizetett())
            return 1;
        else
            return this.nev.compareTo(o.getNev());
    }

    @Override
    public String toString() {
        return  nev + ";" + fizetett;
    } 
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<OP> list = new ArrayList<>();
        while(sc.hasNextLine()){
            if(sc.nextLine() == null)
                break;
            String[] str = sc.nextLine().split(";");
            if(list.contains(new OP(str[0]))){
                int idx = list.indexOf(new OP(str[0]));
                OP tmp = list.get(idx);
                tmp.setFizetett(tmp.getFizetett()+Integer.parseInt(str[1]));
            }
            list.add(new OP(str[0], Integer.parseInt(str[1])));
        }
        Collections.sort(list);
        for (OP op : list) {
            System.out.println(op.toString());
        }
    }
}
