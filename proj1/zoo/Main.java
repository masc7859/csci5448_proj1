package proj1.zoo;

import proj1.zoo.animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Instantiate and name all animals in the zoo
    public static List<Animal> populateZoo(){
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Alligator("Abe"));
        animals.add(new GrizzlyBear("Gabby"));
        animals.add(new Jellyfish("Joe"));
        animals.add(new SeaAnemone("Sasha"));
        animals.add(new Shrimp("Sheryl"));
        animals.add(new Snake("Sam"));
        animals.add(new Squid("Sally"));
        animals.add(new Tiger("Timothy"));
        return animals;
    }

    public static void main(String[] args) {
        List<Animal> zooPopulation = populateZoo();

        //Print out all the animals in the zoo, to verify the zookeeper is acting with all of them
        System.out.println("Animals in zoo:");
        for (Animal animal : zooPopulation) {
            System.out.println(animal.getName() + " the " + animal.getAnimalType());
        }
        System.out.println("\n");

        Zookeeper zeus = new Zookeeper();
        zeus.doDuties(zooPopulation);
        zeus.shutdownZoo();
    }
}
