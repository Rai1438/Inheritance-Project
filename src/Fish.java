public class Fish extends Animal {
    private String waterType;
    private boolean canBreatheUnderwater;

    // Constructor
    public Fish(String name, String habitat, String waterType, boolean canBreatheUnderwater) {
        super(name, habitat);
        this.waterType = waterType;
        this.canBreatheUnderwater = canBreatheUnderwater;
    }

    // Getters and setters
    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public boolean isCanBreatheUnderwater() {
        return canBreatheUnderwater;
    }

    public void setCanBreatheUnderwater(boolean canBreatheUnderwater) {
        this.canBreatheUnderwater = canBreatheUnderwater;
    }

    public void swim() {
        System.out.println("The " + getName() + " swims gracefully in the water.");
    }

    // toString method
    @Override
    public String toString() {
        //return "Fish{name='" + getName() + "', habitat='" + getHabitat() + "', waterType='" + waterType + "', canBreatheUnderwater=" + canBreatheUnderwater + '}';
        return "The " + getName() + " lives in a " + getHabitat() + " habitat which is a " + getWaterType() + " water type. It is " + canBreatheUnderwater + " that it can breathe underwater.";
    }
}
