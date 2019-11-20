/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task9;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Saky
 */
public class Test {
    public static void kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(ArrayList<Hatizsak> lista){
        Collections.sort(lista);
        for (Hatizsak hatizsak : lista) {
            System.out.println(hatizsak.toString());
        }
    }
    public static void main(String[] args) {
        ArrayList<Hatizsak> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(new Hatizsak("mar"+i, i*4+1, i+2, true));
            list.add(new Hatizsak(i+"mar"+i, i*3+1, i+1, false));
        }
        kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(list);
    }
}
