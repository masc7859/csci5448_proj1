package proj1.zoo.animals;
import proj1.zoo.animal_classes.Mammal;

public class GrizzlyBear extends Mammal{

    public GrizzlyBear(String animalName){
        name = animalName;
    }

    public void makeNoise(){
        double randAction = Math.random();
        if (randAction < .25){
            System.out.println(name + " the " + getAnimalType() + " makes noise.");
        }
        else if (randAction < .50){
            eat();
        }
        else if (randAction < .75){
            roam();
        }
        else{
            sleep();
        }
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
