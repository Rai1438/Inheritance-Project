public class Feline extends Mammal {
    private String color;

    // Constructor
    public Feline(String name, String habitat, boolean hasHair, boolean canSwim, String color) {
        super(name, habitat, hasHair, canSwim);
        this.color = color;
    }

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void purr() {
        System.out.println("Purr... Purr...");
    }

    // toString method
    @Override
    public String toString() {
        //return "Feline{name='" + getName() + "', habitat='" + getHabitat() + "', hasHair=" + isHasHair() + ", canSwim=" + isCanSwim() + ", color='" + color + "'}";
        return "The " + getName() + " lives in a " + getHabitat() + " habitat. This animal belongs to the feline species. It is " + super.isCanSwim() + " that it can swim. It's " + super.isHasHair() + " that it has hair.";
    }
}
