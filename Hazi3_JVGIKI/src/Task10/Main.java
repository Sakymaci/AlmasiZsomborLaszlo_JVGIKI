/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task10;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Saky
 */
public class Main {
    public static List teherautok(Auto[] autos){
        List ret = new ArrayList<Teherauto>();
        for (Auto auto : autos) {
            if(auto instanceof Teherauto){
                Teherauto tmp = (Teherauto)auto;
                if(tmp.getTeherBiras()>20000)
                    ret.add(new Teherauto(tmp.getTeherBiras(), tmp.getRendszám(), tmp.getTeljesítmény(), tmp.isAutomata()));
            }
        }
        return ret;
    }
    public static void haromLegnagyobbTeljesitmeny(List<Auto> list){
        int i = 0;
        Auto[] out = new Auto[3];
        for (Auto auto : out) {
            i++;
        }
        if(i<3)
            for (Auto auto : out) {
                System.out.println(auto.toString());
            }
        else{
            i=0;
            for (Auto auto : out) {
                if(i<3){
                    out[i] = auto;
                    i++;
                }
                else{
                    for (int j = 0; j < 3; j++) {
                        if(out[j].getTeljesítmény()<auto.getTeljesítmény()){
                            out[j] = auto;
                            break;
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto tmp = new Auto(sc.nextLine(), 100, true);
        System.out.println(tmp.toString());
        Auto[] t = new Auto[4];
        for (int i = 0; i < 4; i++) {
            String[] str = sc.nextLine().split(" ");
            if(i>2)
                t[i] = new Auto(str[0], Integer.parseInt(str[1]), Boolean.getBoolean(str[2]));
            else
                t[i] = new Teherauto(Integer.parseInt(str[3]), str[0], Integer.parseInt(str[1]), Boolean.getBoolean(str[2]));
        }
        
    }
}
