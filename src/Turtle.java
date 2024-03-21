public class Turtle extends Reptile {

    private boolean canSwim;

    // Constructor
    public Turtle(String name, String habitat, boolean haveTeeth, boolean canSwim) {
        super(name, habitat, haveTeeth);
        this.canSwim = canSwim;
    }

    // Getter and setter for canSwim
    public boolean canSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    // Override toString method
    @Override
    public String toString() {
        String swimStatus = canSwim ? "can swim" : "cannot swim";
        return super.toString() + " It " + swimStatus + ".";
    }
}
