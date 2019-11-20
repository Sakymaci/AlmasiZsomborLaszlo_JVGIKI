/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task10;

/**
 *
 * @author Saky
 */
public class Teherauto extends Auto{
    private int teherBiras;

    public Teherauto(int teherBiras, String rendszám, int teljesítmény, boolean automata) {
        super(rendszám, teljesítmény, automata);
        this.teherBiras = teherBiras;
    }

    public int getTeherBiras() {
        return teherBiras;
    }
    
    

    @Override
    public String toString() {
        return "Teherauto:" + "teherBiras=" + teherBiras + ", rendsz\u00e1m=" + this.getRendszám() + ", teljes\u00edtm\u00e9ny=" + this.getTeljesítmény() + ", automata=" + this.isAutomata();
    }
    
}
