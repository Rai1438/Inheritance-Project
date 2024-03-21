public class Mammal extends Animal {
    private boolean hasHair;
    private boolean canSwim;

    // Constructor
    public Mammal(String name, String habitat, boolean hasHair, boolean canSwim) {
        super(name, habitat);
        this.hasHair = hasHair;
        this.canSwim = canSwim;
    }

    // Getters and setters
    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    // toString method
    @Override
    public String toString() {
        //return "Mammal{name='" + getName() + "', habitat='" + getHabitat() + "', hasHair=" + hasHair + ", canSwim=" + canSwim + '}';
        return "The " + getName() + " lives in a " + getHabitat() + " habitat. It is " + canSwim + " that it can swim. It's " + hasHair + " that it has hair.";
    }
}

