package proj1.zoo.animals;
import proj1.zoo.animal_classes.Reptile;

public class Alligator extends Reptile{

    public Alligator(String animalName){
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
