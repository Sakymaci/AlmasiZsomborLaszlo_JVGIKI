/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saky
 */
public class Egyetem {
    List<Személy> list = new ArrayList<>();
    
    public void addHallgato(Hallgato h){
        list.add(h);
    }
    
    public void addOktato(Oktato o){
        list.add(o);
    }
    
    public void removeHallgato(Hallgato h){
        list.remove(h);
    }
    
    public void removeOktato(Oktato o){
        list.remove(o);
    }
    
    public void haromLegfiatalabbHallgato(){
        int db = 0;
        Hallgato[] out = new Hallgato[3];
        for (Személy személy : list) {
            if(személy instanceof Hallgato)
                db++;
        }
        for (Személy személy : list) {
            if(db<3)
                if(személy instanceof Hallgato)
                    System.out.println(((Hallgato)személy).toString());
            db = 0;
            if(személy instanceof Hallgato){
                Hallgato tmp = (Hallgato)személy;
                if(db<3){
                    out[db] = tmp;
                }
                for (int i = 0; i < out.length; i++) {
                    if(out[i].getÉletkor()>tmp.getÉletkor()){
                        out[i] = tmp;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(out[i].toString());
        }
    }
    
    public void hozzafuz(){
        for (Személy személy : list) {
            if(személy instanceof Oktato){
                Oktato tmp = (Oktato)személy;
                if(!tmp.isFérfi()){
                    tmp.setNév(tmp.getNév()+"!");
                    személy = tmp;
                }
            }
        }
    }
}
