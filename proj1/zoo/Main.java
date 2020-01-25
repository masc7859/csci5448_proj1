package proj1.zoo;

import proj1.zoo.animals.*;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Animal> animals = new Vector<Animal> ();
        animals.add(new Alligator("Abe"));
        animals.add(new GrizzlyBear("Gabby"));
        animals.add(new Jellyfish("Joe"));
        animals.add(new SeaAnemone("Sasha"));
        animals.add(new Shrimp("Sheryl"));
        animals.add(new Snake("Sam"));
        animals.add(new Squid("Sally"));
        animals.add(new Tiger("Timothy"));

        Zookeeper zeus = new Zookeeper();
        zeus.doDuties(animals);
    }
}
