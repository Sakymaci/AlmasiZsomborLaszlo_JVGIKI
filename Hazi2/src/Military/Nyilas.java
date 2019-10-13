package Military;

/**
 *
 * @author Saky
 */

public class Nyilas extends Katona {
    private int inRange;

    public Nyilas(int attackForce, int defensiveForce, int inRange) {
        super(attackForce, defensiveForce);
        this.inRange = inRange;
    }

    public int getInRange() {
        return inRange;
    }

    public void setInRange(int inRange) {
        this.inRange = inRange;
    }


    @Override
    public String toString() {
        return "Nyilas:" +
                "TE: " + getInRange() +
                ", VE: " + getDefensiveForce();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Nyilas))
        {
            return false;
        }
        Nyilas ny = (Nyilas)obj;
        return super.equals(ny) && this.inRange == ny.getInRange();
    }
}