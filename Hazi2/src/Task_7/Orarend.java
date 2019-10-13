/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_7;

/**
 *
 * @author szikra
 */
public class Orarend {
    
    String day;
    Ora[] block;
    int counter;
    
    String[] dayNeve;
    
    public static boolean oratHozzaad(Ora ora){
        if (true){
            
        }
    return false;
    }

    public Orarend(String day) {
        this.dayNeve = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        this.day = day;
        counter = 0;
        Ora[] block2 = new Ora[12];
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Ora[] getBlock() {
        return block;
    }

    public void setBlock(Ora[] block) {
        this.block = block;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
