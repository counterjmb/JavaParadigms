package Abstraction;

public abstract class Animal {
    int age;
    String name;

    public abstract void makeSound();

    public void getName() {
        System.out.println("Name: " + this.name);
    }
}
