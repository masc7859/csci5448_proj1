package proj1.zoo.animal_types;
import proj1.zoo.Animal;

public class Invertebrate extends Animal{
    public void wakeup(){
        System.out.println(name + " the " + getAnimalType() + " wakes up.");
    }

    public void sleep(){
        System.out.println(name + " the " + getAnimalType() + " goes to sleep.");
    }
}
