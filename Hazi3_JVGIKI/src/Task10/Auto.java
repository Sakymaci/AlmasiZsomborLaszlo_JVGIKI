/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task10;

import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Saky
 */
public class Auto implements Comparable<Auto>{
    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    private static int darab=0;
    private List<String> extra;

    public Auto(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        darab++;
    }

    public int getDarab() {
        return darab;
    }

    public void addExtra(String str) {
        extra.add(str);
    }
    
    public void deleteExtra(String str){
        extra.remove(str);
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }
    
    public boolean isSzabalyos(){
        Matcher m = Pattern.compile("[A-Z[A-Z]A-Z]\\d\\d\\d").matcher(rendszám.toUpperCase());
        if(m.find())
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Auto:" + "rendsz\u00e1m=" + rendszám + ", teljes\u00edtm\u00e9ny=" + teljesítmény + ", automata=" + automata;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.rendszám);
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
        final Auto other = (Auto) obj;
        if (!Objects.equals(this.rendszám, other.rendszám)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Auto o) {
        if(this.teljesítmény>o.getTeljesítmény())
            return 1;
        else if(this.teljesítmény<o.getTeljesítmény())
            return -1;
        return 0;
    }
    
}
