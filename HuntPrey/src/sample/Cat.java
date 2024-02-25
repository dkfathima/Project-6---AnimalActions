package sample;

public class Cat extends AnimalActions{
    // This is the flee method for the Cat
    public void flee() {
        System.out.println("The cat runs away faster than a speeding car.");
    }

    // This is the hunt method for the Cat
    @Override
    public void hunt() {
        System.out.println("The cat jumps very high and pounces on the prey.");
    }
}
