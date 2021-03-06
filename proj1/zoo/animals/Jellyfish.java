package proj1.zoo.animals;
import proj1.zoo.animal_classes.Cnidarians;

public class Jellyfish extends Cnidarians{

    public Jellyfish(String animalName){
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
