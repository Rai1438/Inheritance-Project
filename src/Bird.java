public class Bird extends Animal {
    private double wingspan;
    private boolean canFly;

    // Constructor
    public Bird(String name, String habitat, double wingspan, boolean canFly) {
        super(name, habitat);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    // Getters and setters
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
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
        return "Bird{name='" + getName() + "', habitat='" + getHabitat() + "', wingspan=" + wingspan + ", canFly=" + canFly + '}';
    }
}


