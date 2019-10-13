package Military;

/**
 *
 * @author Saky
 */

public class Teszt {
    public static void main(String[] args) {

        Katona k1 = new Nyilas(6,7,3);
        Katona k2 = new Nyilas(8,6,2);
        Katona k3 = new Lándzsás(6,7);
        System.out.println("First round k1, k2: "+megkuzd(k1,k2));
        if(megkuzd(k1,k2).equals(k1))
        {
            System.out.println("Second round k1, k3: "+megkuzd(k1,k3));
        }
        else
        {
            System.out.println("Second round k2, k3: "+megkuzd(k2,k3));
        }

    }
    public static Katona megkuzd(Katona k1,Katona k2)
    {
        if(k1.getAttackForce()>k2.getDefensiveForce())
        return k1;
        if(k2.getAttackForce()>k1.getDefensiveForce())
            return k2;

        return k1;

    }
}