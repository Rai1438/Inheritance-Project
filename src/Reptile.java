public class Reptile extends Animal {
    private boolean haveTeeth;

    // Constructor
    public Reptile(String name, String habitat, boolean haveTeeth) {
        super(name, habitat);
        this.haveTeeth = haveTeeth;
    }

    // Getter and setter for haveTeeth
    public boolean haveTeeth() {
        return haveTeeth;
    }

    public void setHaveTeeth(boolean haveTeeth) {
        this.haveTeeth = haveTeeth;
    }


    // Override toString method
    @Override
    public String toString() {
        String teethStatus = haveTeeth ? "has teeth." : "does not have teeth.";
        return super.toString() + "It " + teethStatus;
    }
}
