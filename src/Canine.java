public class Canine extends Mammal {
    private String breed;

    // Constructor
    public Canine(String name, String habitat, boolean hasHair, boolean canSwim, String breed) {
        super(name, habitat, hasHair, canSwim);
        this.breed = breed;
    }

    // Getter and setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    // toString method
    @Override
    public String toString() {
        //return "Canine{name='" + getName() + "', habitat='" + getHabitat() + "', hasHair=" + isHasHair() + ", canSwim=" + isCanSwim() + ", breed='" + breed + "'}";
        return "The " + getName() + " lives in a " + getHabitat() + " habitat. This animal belongs to the Canine species. It is of the " + breed + " breed. It's " + super.isHasHair() + " that it has hair.";
    }
}

