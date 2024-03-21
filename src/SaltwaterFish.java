public class SaltwaterFish extends Fish {
    private String habitat;

    // Constructor
    public SaltwaterFish(String name, String habitat, String waterType, boolean canBreatheUnderwater) {
        super(name, habitat, waterType, canBreatheUnderwater);
        this.habitat = habitat;
    }

    // Getter and setter for habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Additional methods specific to SaltwaterFish behavior can be added here

    // toString method

}
