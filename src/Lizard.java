public class Lizard extends Reptile {

    private boolean venomous;

    // Constructor
    public Lizard(String name, String habitat, boolean haveTeeth, boolean venomous) {
        super(name, habitat, haveTeeth);
        this.venomous = venomous;
    }

    // Getter and setter for venomous
    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    public void hiss(){
        System.out.println("Hisssssss...");
    }
    // Override toString method
    @Override
    public String toString() {
        String venomousStatus = venomous ? "is venomous" : "is not venomous";
        return super.toString() + " It " + venomousStatus + ".";
    }
}
