package proj1.zoo.animal_classes;
import proj1.zoo.animal_types.Invertebrate;

public class Cnidarians extends Invertebrate {

    @Override
    public void eat() {
        System.out.println(name + " the " + getAnimalType() + " eats.");
    }
}
