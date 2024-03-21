public class Bird extends Animal {
    private String wingspan;
    private boolean canFly;

    // Constructor
    public Bird(String name, String habitat, String wingspan, boolean canFly) {
        super(name, habitat);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    // Getters and setters
    public String getWingspan() {
        return wingspan;
    }

    public void setWingspan(String wingspan) {
        this.wingspan = wingspan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    // toString method
    @Override
    public String toString() {
        //return "Bird{name='" + getName() + "', habitat='" + getHabitat() + "', wingspan=" + wingspan + ", canFly=" + canFly + '}';
        return "The " + getName() + " lives in a " + getHabitat() + " habitat. It has a wingspan of " + getWingspan() + " ft. It is " + isCanFly() + " that it can fly.";
    }
}


