/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author Saky
 */
public class Gyumolcsle extends Ital{

    @Override
    public String toString() {
        return "Gyumolcsle{" + '}';
    }

    public Gyumolcsle(Gyumolcs gy) {
    }
    
    public String mibolFacsartak(){
        return mibolKeszult();
    }
    
    @Override
    String mibolKeszult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String milyenIzu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
