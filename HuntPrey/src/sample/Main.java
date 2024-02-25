package sample;
/*
* Name: Dewan Fathima
* Class: CSIT 501 Java
* Description: Here it is demonstrating the hunt and flee action from different animals using inheritance and method overriding
* */

public class Main {
    public static void main(String[] args) {
        // This is creating instances for each animal
        Bird boldBird = new Bird();
        Cat crazyCat = new Cat();
        Wolf wildWolf = new Wolf();

        // This will display the actions of each animal when fleeing and hunting
        System.out.println("The Bold Bird's behavior:");
        boldBird.flee();
        boldBird.hunt();

        System.out.println("\nThe Crazy Cat's behavior:");
        crazyCat.flee();
        crazyCat.hunt();

        System.out.println("\nThe Wild Wolf's behavior:");
        wildWolf.flee();
        wildWolf.hunt();
    }
}
