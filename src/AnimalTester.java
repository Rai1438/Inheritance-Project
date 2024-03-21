import java.util.ArrayList;

public class AnimalTester {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        // Add instances of various animal subclasses to the ArrayList
        animals.add(new Canine("Dog", "Land", true, true, "Golden Retriever"));
        animals.add(new Feline("Cat", "Land", true, true, "Tabby"));
        animals.add(new Parrot("Parrot", "Forest", "2 - 3", true, true));
        animals.add(new Eagle("Eagle", "Mountains", "5.9 - 7.5", true, true));
        animals.add(new FreshwaterFish("Trout", "River", "Freshwater", true, 10));
        animals.add(new SaltwaterFish("Shark", "Ocean", "Saltwater", true));
        animals.add(new Lizard("Gila Monster", "Desserts and canyons", true, true));
        animals.add(new Turtle("Sea Turtle", "Oceans", false, true));


        for (Animal animal : animals) {
            System.out.println(animal);
            // Call a method specific to the subclass
            if (animal instanceof Canine) {
                ((Canine) animal).bark();
            } else if (animal instanceof Feline) {
                ((Feline) animal).purr();
            } else if (animal instanceof Parrot) {
                ((Parrot) animal).speak();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).flyHigh();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            } else if (animal instanceof Lizard) {
                ((Lizard) animal).hiss();
                //} else if (animal instanceof Turtle) {
                //((Turtle) animal).
            }

            System.out.println();
        }
    }
}
