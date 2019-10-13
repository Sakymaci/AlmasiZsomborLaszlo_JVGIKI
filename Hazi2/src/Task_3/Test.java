package Task_3;

import java.util.Arrays;

/**
 *
 * @author Saky
 */
public class Test {
    
    public static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] vendegEgyseg){
        int counter = 0;
        for (VendeglatoipariEgyseg vendegEgyseg1 : vendegEgyseg) {
            if (vendegEgyseg1 instanceof Kocsma) {
                Kocsma kocsma = (Kocsma) vendegEgyseg1;
                for (String sorlap : kocsma.getSorlap()) {
                    if (sorlap.equals(ital)) {
                        counter++;
                        break;
                    }
                }
            }
        }
        
        Kocsma[] kocsma = new Kocsma[counter];
        counter = 0;
        
        for (VendeglatoipariEgyseg vendegEgyseg1 : vendegEgyseg) {
            if (vendegEgyseg1 instanceof Kocsma) {
                Kocsma tmpKocsma = (Kocsma) vendegEgyseg1;
                for (String sorlap : tmpKocsma.getSorlap()) {
                    if (sorlap.equals(ital)) {
                        kocsma[counter] = tmpKocsma;
                        counter++;
                        break;
                    }
                }
            }
        }

        return kocsma;
    }
    
    public static void main(String[] args) {
        VendeglatoipariEgyseg[] vendeglatoArray = new VendeglatoipariEgyseg[10];
        
        vendeglatoArray[0] = new Etterem("MecD", 10, true, new String[] {"Hamburger", "Pizza", "Salata", "Gyros"});
        vendeglatoArray[1] = new Etterem("Burgerzzz", 12, false, new String[] {"Hamburger", "Sült", "Salata", "Gyros"} );
        vendeglatoArray[2] = new Etterem("Sashi", 8, true, new String[] {"Crustyburger", "Pizza", "Salata", "Gyros"} );
        vendeglatoArray[3] = new Etterem("PizzaHut", 12, false, new String[] {"Hamburger", "Pizza", "Szendvics", "Leves"} );
        vendeglatoArray[4] = new Etterem("GudFud", 12, true, new String[] {"Hamburger", "Sült", "Szendvics", "Leves"} );
        
        vendeglatoArray[5] = new Kocsma("Roncs", 10, false, new String[] {"Heineken", "Dreher", "Staropramen", "Stefl"});
        vendeglatoArray[6] = new Kocsma("Latin", 12, true, new String[] {"Heineken", "Dreher", "Staropramen", "Stefl"} );
        vendeglatoArray[7] = new Kocsma("Drunk", 8, false, new String[] {"Heineken", "Borsodi", "Staropramen:szurt", "Stefl"});
        vendeglatoArray[8] = new Kocsma("Noir", 12, true, new String[] {"Soproni", "Dreher", "Staropramen", "Stefl"} );
        vendeglatoArray[9] = new Kocsma("Rock", 12, false, new String[] {"Soproni", "Borsodi", "Staropramen:szurt", "Stefl"} );

        Kocsma[] kocsma = adottItaltKinaloKocsmak("Heineken",vendeglatoArray);
        System.out.println(Arrays.toString(kocsma));
        
      
    }
    
}
