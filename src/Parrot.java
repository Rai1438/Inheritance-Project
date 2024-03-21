public class Parrot extends Bird {
    private boolean canSpeak;

    // Constructor
    public Parrot(String name, String habitat, double wingspan, boolean canFly, boolean canSpeak) {
        super(name, habitat, wingspan, canFly);
        this.canSpeak = canSpeak;
    }

    // Getter and setter for canSpeak
    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    public void speak() {
        System.out.println("Polly wants a cracker!");
    }

    // toString method
    @Override
    public String toString() {
        return "Parrot{name='" + getName() + "', habitat='" + getHabitat() + "', wingspan=" + getWingspan() + ", canFly=" + isCanFly() + ", canSpeak=" + canSpeak + '}';
    }
}
