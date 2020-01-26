package proj1.zoo.animal_types;
import proj1.zoo.Animal;

public class Vertebrate extends Animal{

    @Override
    public void wakeup(){
        System.out.println(name + " the " + getAnimalType() + " wakes up.");
    }

    @Override
    public void sleep(){
        System.out.println(name + " the " + getAnimalType() + " goes to sleep.");
    }
}
