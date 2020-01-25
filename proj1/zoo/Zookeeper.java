package proj1.zoo;

import java.util.Iterator;
import java.util.Vector;

public class Zookeeper {
    public void doDuties(Vector<Animal> animals){
        for (Animal animal : animals) {
            wakeupAnimals(animal);
            callAnimals(animal);
            feedAnimals(animal);
            exerciseAnimals(animal);
            sleepAnimals(animal);
        }
    }
    private void wakeupAnimals(Animal animal){
        System.out.println("Waking Up: ");
    }

    private void callAnimals(Animal animal){
        System.out.println("Calling: ");
    }

    private void feedAnimals(Animal animal){
        System.out.println("Feeding: ");
    }

    private void exerciseAnimals(Animal animal){
        System.out.println("Exercising: ");
    }

    private void sleepAnimals(Animal animal){
        System.out.println("Putting to Sleep: ");
    }
}
