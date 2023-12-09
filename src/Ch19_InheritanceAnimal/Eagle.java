package Ch19_InheritanceAnimal;

public class Eagle extends Bird {
    public Eagle(String name, int wingspan,  int clawsLegth) {
        super(name, wingspan, true);
        this.clawsLegth = clawsLegth;
    }

    private  int clawsLegth;

    public int getClawsLegth() {
        return clawsLegth;
    }

    public void setClawsLegth(int clawsLegth) {
        this.clawsLegth = clawsLegth;
    }
}
