public class Animal {
    private String name;
    private String habitat;

    // Constructor
    public Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // toString method
    @Override
    public String toString() {
        return "Animal{name='" + name + "', habitat='" + habitat + "'}";
    }
}
