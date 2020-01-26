package proj1.zoo.animals;

import proj1.zoo.animal_classes.Cnidarians;

public class SeaAnemone extends Cnidarians {

    public SeaAnemone(String animalName){
        name = animalName;
    }

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
