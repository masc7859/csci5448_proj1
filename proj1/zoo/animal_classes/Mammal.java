package proj1.zoo.animal_classes;
import proj1.zoo.animal_types.Vertebrate;

public class Mammal extends Vertebrate {

    @Override
    public void eat() {
        System.out.println(name + " the " + getAnimalType() + " eats");
    }
}
