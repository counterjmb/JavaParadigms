package Abstraction;

public class Cat extends Animal {

    String name = "Kitty";

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

}
