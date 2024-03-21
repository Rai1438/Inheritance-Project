public class FreshwaterFish extends Fish {
    private double preferredTemperature;

    // Constructor
    public FreshwaterFish(String name, String habitat, String waterType, boolean canBreatheUnderwater, double preferredTemperature) {
        super(name, habitat, waterType, canBreatheUnderwater);
        this.preferredTemperature = preferredTemperature;
    }

    // Getter and setter for preferredTemperature
    public double getPreferredTemperature() {
        return preferredTemperature;
    }

    public void setPreferredTemperature(double preferredTemperature) {
        this.preferredTemperature = preferredTemperature;
    }

    // toString method
    @Override
    public String toString() {
        return "The " + getName() + " lives in a " + getHabitat() + " habitat which is a " + getWaterType() + " water type. It is " + super.isCanBreatheUnderwater() + " that it can breathe underwater. It prefers a temperature of " + preferredTemperature + " degrees celcius.";
    }
}
