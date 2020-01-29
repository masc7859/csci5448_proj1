package proj1.zoo;

// Top level of inheritance
public class Animal {
    protected String name;

    public void wakeup(){}

    public void makeNoise(){}

    public void eat(){}

    public void roam() {
        System.out.println(name + " the " + getAnimalType() + " roams around.");
    }

    public void sleep(){}

    public String printType() {
        return this.getClass().getName();
    }

    public String getAnimalType() {
        return "";
    }

    public String getName(){
        return "";
    }
}
