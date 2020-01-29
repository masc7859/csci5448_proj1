package proj1.zoo.animals;
import proj1.zoo.animal_classes.Mollusks;

public class Shrimp extends Mollusks{

    public Shrimp(String animalName){
        name = animalName;
    }

    @Override
    public void makeNoise(){
        System.out.println(name + " the " + getAnimalType() + " makes noise.");
    }

    @Override
    public String getAnimalType(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String getName(){
        return name;
    }
}
