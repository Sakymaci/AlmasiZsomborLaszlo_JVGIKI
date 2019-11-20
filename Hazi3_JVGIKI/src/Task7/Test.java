/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Saky
 */
public class Test {
    public static ArrayList tagasLakohazak(ArrayList<Lakohaz> lista, double terfogat){
        ArrayList<Lakohaz> ret = new ArrayList();
        for (Lakohaz object : lista) {
            if(object.getAlaperulet() > terfogat)
                ret.add(object);
        }
        Collections.sort(ret);
        return ret;
    }
    public static void main(String[] args) {
        ArrayList<Lakohaz> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add(new Lakohaz("asd"+i, i, i*7));
        }
        ArrayList<Lakohaz> done = tagasLakohazak(list, 24);
        for (Lakohaz lakohaz : done) {
            System.out.println(lakohaz.toString());
        }
    }
}
