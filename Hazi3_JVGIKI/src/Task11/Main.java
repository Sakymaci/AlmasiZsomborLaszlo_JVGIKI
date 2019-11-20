/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task11;

import java.util.Scanner;

/**
 *
 * @author Saky
 */
public class Main {
    public static double joKepesseguAtlag(Személy[] t){
        double ret = 0;
        int db = 0;
        for (int i = 0; i < t.length; i++) {
            if(t[i] instanceof Hallgato){
                Hallgato tmp = (Hallgato) t[i];
                if(tmp.joKepessegu(4.0)){
                    db++;
                    ret += tmp.getÉletkor();
                }   
            }
        }
        ret = ret / db;
        return ret;
    }
    public static void main(String[] args) {
        Személy sz1 = new Személy("Mona Liza", 20, false);
        System.out.println(sz1.toString());
        Személy[] t = new Személy[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String[] tmp = sc.nextLine().split(" ");
            if(i<2)
                t[i] = new Hallgato(Double.parseDouble(tmp[3]), tmp[0], Integer.parseInt(tmp[1]), Boolean.getBoolean(tmp[2]));
            else
                t[i] = new Oktato(tmp[3], tmp[0], Integer.parseInt(tmp[1]), Boolean.getBoolean(tmp[2]));
        }
    }
}
