package proj1.zoo;

import proj1.zoo.animals.*;
import java.util.List;

public class Zookeeper{

    public void doDuties(List<Animal> animals){
        for (Animal animal : animals) {
            wakeupAnimal(animal);
        }
        for (Animal animal : animals) {
            callAnimal(animal);
        }
        for (Animal animal : animals) {
            feedAnimal(animal);
        }
        for (Animal animal : animals) {
            exerciseAnimal(animal);
        }
        for (Animal animal : animals) {
            sleepAnimal(animal);
        }
    }
    
    private void wakeupAnimal(Animal animal){
        System.out.println("Waking Up Animal: ");
        animal.wakeup();
    }

    private void callAnimal(Animal animal){
        System.out.println("Calling Animal: ");
        animal.makeNoise();
    }

    private void feedAnimal(Animal animal){
        System.out.println("Feeding Animal: ");
        animal.eat();
    }

    private void exerciseAnimal(Animal animal){
        System.out.println("Exercising Animal: ");
        animal.roam();
    }

    private void sleepAnimal(Animal animal) {
        System.out.println("Putting to Sleep Animal: ");
        animal.sleep();
    }

    public void shutdownZoo(){
        System.out.println("Shutting Down Zoo");
    }
}
