package sample;

public class Bird extends AnimalActions{
    // This is the flee method for the Bird
    public void flee() {
        System.out.println("The bird flies away very quickly.");
    }

    // This is the hunt method for  the Bird
    @Override
    public void hunt() {
        System.out.println("The bird uses its pierce eye-sight and captures the worms.");
    }
}
