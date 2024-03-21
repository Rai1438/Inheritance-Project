public class Eagle extends Bird {
    private boolean hasSharpTalons;

    // Constructor
    public Eagle(String name, String habitat, String wingspan, boolean canFly, boolean hasSharpTalons) {
        super(name, habitat, wingspan, canFly);
        this.hasSharpTalons = hasSharpTalons;
    }

    // Getter and setter for hasSharpTalons
    public boolean isHasSharpTalons() {
        return hasSharpTalons;
    }

    public void setHasSharpTalons(boolean hasSharpTalons) {
        this.hasSharpTalons = hasSharpTalons;
    }

    public void flyHigh() {
        System.out.println("The eagle soars high in the sky.");
    }


    // toString method
    @Override
    public String toString() {
        //return "Eagle{name='" + getName() + " ', habitat='" + getHabitat() + " ', wingspan=" + getWingspan() + " , canFly=" + isCanFly() + " , hasSharpTalons=" + hasSharpTalons + '}';
        return "The " + getName() + " lives in a " + getHabitat() + " habitat. It has a wingspan of " + getWingspan() + " ft. It is " + isCanFly() + " that it can fly. It's also " + hasSharpTalons + " that it has sharp talons.";
    }
}
