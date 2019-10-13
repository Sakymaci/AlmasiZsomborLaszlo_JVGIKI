package Military;

/**
 *
 * @author Saky
 */

public class Katona {
    private int attackForce;
    private int defensiveForce;


    public Katona() {
        this.attackForce=5;
        this.defensiveForce=5;
    }

    public Katona(int attackForce, int defensiveForce) {
        this.attackForce = attackForce;
        this.defensiveForce = defensiveForce;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    public int getDefensiveForce() {
        return defensiveForce;
    }

    public void setDefensiveForce(int defensiveForce) {
        this.defensiveForce = defensiveForce;
    }

    @Override
    public String toString() {
        return "AF: " + attackForce +
                ", DF: " + defensiveForce;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Katona))
            return false;
        Katona o = (Katona)obj;
        return this.attackForce == o.getAttackForce() && this.defensiveForce == o.getDefensiveForce();

    }
}