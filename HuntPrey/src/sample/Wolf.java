package sample;

public class Wolf extends AnimalActions{
    // This is the flee method for the Wolf
    public void flee() {
        System.out.println("The wolf escapes with its packs.");
    }

    // This is the hunt method for the Wolf
    @Override
    public void hunt() {
        System.out.println("The wolf is stalks, waits, then hunts the prey.");
    }
}
